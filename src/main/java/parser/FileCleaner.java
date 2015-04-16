/**
 * 
 */
package main.java.parser;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Michael.Wambeek
 *
 */
public class FileCleaner {

	public static final String REGEX_SEP = "\\|";

	/**
	 * 
	 */
	public void process() {
		List<Line> lines = readFile();
		Line header = lines.remove(0);
		cleanFile(lines);
		printFile(header, lines);
	}

	/**
	 * @return
	 */
	public List<Line> readFile() {
		Path path = Paths.get("src/resources/customer-data.txt");

		LinkedList<Line> lines = new LinkedList<>();
		try (Stream<String> file = Files.lines(path)) {
			file.forEach(s -> {
				lines.add(new Line(s));
			});
		} catch (IOException ioe) {
			System.err.println("ERROR!!!");
			System.err.println(ioe);
			ioe.printStackTrace(System.err);
		}

		return lines;
	}

	/**
	 * @param lines
	 */
	public void cleanFile(List<Line> lines) {
		lines.parallelStream().forEach(this::clean);
		Line.removeCv2();
	}

	/**
	 * @param line
	 */
	public void clean(Line line) {
		cleanCardNumber(line);
		cleanExpiry(line);
	}

	/**
	 * @param line
	 */
	public void cleanCardNumber(Line line) {
		String cardNum = line.getCardNumber();
		char[] chars = cardNum.toCharArray();
		char[] cleanCardNum = new char[chars.length];
		for (int i = 0; i < cardNum.length(); i++) {
			if (i < 5) {
				cleanCardNum[i] = chars[i];
			} else {
				cleanCardNum[i] = '#';
			}
		}

		line.setCardNumber(new String(cleanCardNum));
	}

	/**
	 * @param line
	 */
	public void cleanExpiry(Line line) {
		String expirey = line.getExpiry();
		line.setExpiry(expirey.replaceAll("\\d", "#"));
	}

	public void printFile(Line header, List<Line> lines) {
		try (FileWriter fw = new FileWriter("src/resources/clean-customer-data.txt")) {
			fw.write(header.toString() + "\n");

			lines.stream().forEachOrdered(l -> {
				try {
					fw.write(l.toString());
					fw.write("\n");
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			});
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}
	}
}
