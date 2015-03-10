package org.java.training;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

/**
 * Chapter 16 Q19, but based on the file-oriented help system from
 * Try-This 10-2.
 */
public class HelpSystem {
	HelpSystem() {
		JFrame frame = frame();
		Help help = new Help("resources/help.txt");
		
		JList<String> topics = new JList<>(help.getTopics().toArray(new String[]{}));
		topics.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JScrollPane scroll = new JScrollPane(topics);
		scroll.setPreferredSize(new Dimension(120, 110));
		
		JLabel output = new JLabel();
		output.setOpaque(true);
		output.setBackground(Color.WHITE);
		
		topics.addListSelectionListener(ls -> {
			if(!ls.getValueIsAdjusting())
				output.setText(
					String.format("<html>%s</html>", help.showDetail(topics.getSelectedValue())));
			});

		Arrays.asList(scroll, output).forEach(frame::add);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(HelpSystem::new);
	}
	
	public static JFrame frame() {
		JFrame frame = new JFrame("Help Demo");
		frame.setLayout(new FlowLayout());
		frame.setSize(280, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return frame;
	}
}

class Help {
	private final Path file;
	
	Help( String filename ) {
		file = Paths.get(filename);
		if (!Files.exists(file))
			throw new RuntimeException(String.format("Help file at [%s] not found.", file.toString()));
	}
	
	public List<String> getTopics() {
		try ( Stream<String> in = Files.lines(file) ) {
			return in.filter(s -> s.startsWith("<!--#"))
			  .map(s -> s.substring(5).trim())
			  .collect(Collectors.toList());
		} catch (IOException e) {
			throw new RuntimeException(String.format("Failed to parse input file [%s]", file.toString()));
		}
	}
	
	public String showDetail( String topic ) {
		StringBuilder details = new StringBuilder();
		try ( BufferedReader reader = new BufferedReader(new FileReader(file.toFile())) ) {
			String line = null;
			boolean found = false;
			while ( (line = reader.readLine()) != null ) {
				if ( found ) {
					if ( line.startsWith("<!--#") ) break;
					details.append(line).append('\n');
				}
				found = found || (line.startsWith("<!--#") && line.substring(5).trim().equalsIgnoreCase(topic));
			}
			if ( !found )
				details.append(String.format("Could not find topic [%s]", topic));
		} catch (IOException e) {
			details.append("Failed to open help file: " + e.getLocalizedMessage());
		}
		return details.toString();
	}
}