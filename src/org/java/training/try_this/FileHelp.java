package org.java.training.try_this;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Try This 10-2
 */
public class FileHelp {
	
	public static void main(String[] args) throws FileNotFoundException {
		Help controlFlowHelp = new Help("resources/try_this/helpfile.txt");
		
		controlFlowHelp.showTopics(System.out::println);
		String selection = controlFlowHelp.getSelection(new Scanner(System.in)::nextLine, System.out::println);
		controlFlowHelp.showDetail(selection, System.out::println);
	}

}

class Help {
	private final Path file;
	private final Function<String, String> entryFormat = s -> String.format("\t%s", s);
	
	Help( String filename ) throws FileNotFoundException {
		file = Paths.get(filename);
		if (!Files.exists(file))
			throw new FileNotFoundException(String.format("Help file at [%s] not found.", file.toString()));
	}
	
	public String getSelection(Supplier<String> in, Consumer<String> out) {
		out.accept("Enter topic: ");
		return in.get();
	}
	
	public Help showTopics( Consumer<String> out ) {
		try ( Stream<String> in = Files.lines(file) ) {
			out.accept("Options: ");
			in.filter(s -> s.startsWith("#"))
			  .map(s -> s.substring(1).trim())
			  .map(entryFormat)
			  .forEach(out::accept);
		} catch (IOException e) {
			out.accept("Failed to open help file: " + e.getLocalizedMessage());
		}
		return this;
	}
	
	public Help showDetail( String topic, Consumer<String> out ) {
		try ( BufferedReader reader = new BufferedReader(new FileReader(file.toFile())) ) {
			String line = null;
			boolean found = false;
			while ( (line = reader.readLine()) != null ) {
				if ( found ) {
					if ( line.startsWith("#") ) break;
					out.accept(line);
				}
				found = found || (line.startsWith("#") && line.substring(1).trim().equalsIgnoreCase(topic));
			}
			if ( !found )
				out.accept(String.format("Could not find topic [%s]", topic));
		} catch (IOException e) {
			out.accept("Failed to open help file: " + e.getLocalizedMessage());
		}
		return this;
	}
}
