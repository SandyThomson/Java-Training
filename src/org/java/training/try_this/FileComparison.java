package org.java.training.try_this;

import java.awt.FlowLayout;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Consumer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * Try This 16-1
 */
public class FileComparison {
	FileComparison() {
		JFrame frame = frame();

		JTextField a = new JTextField(14), b = new JTextField(14);
		a.setActionCommand("pathA");
		b.setActionCommand("pathB");

		JButton compare = new JButton("Compare");
		JLabel
			labela = new JLabel("First file: "),
			labelb = new JLabel("Second file: "),
			result = new JLabel("");

		compare.addActionListener(ae -> compare(a.getText(), b.getText(), result::setText));

		Arrays.asList(labela, a, labelb, b, compare, result).forEach(frame::add);
		frame.setVisible(true);
	}
	
	public static JFrame frame() {
		JFrame frame = new JFrame("File Comparison");
		frame.setLayout(new FlowLayout());
		frame.setSize(200, 190);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return frame;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(FileComparison::new);
	}

	public void compare(String first, String second, Consumer<String> out) {
		if( first == null || first.equals("") ) {
			out.accept("First file name missing.");
			return;
		}

		if ( second == null || second.equals("") ) {
			out.accept("Second file name missing.");
			return;
		}

		try(FileInputStream a = new FileInputStream(first);
			FileInputStream b = new FileInputStream(second)) {
			int i = 0, j = 0;
			do {
				i = a.read();
				j = b.read(); 
				if (i != j) break;
			} while (i != -1 && j != -1);
			
			if ( i != j ) out.accept("Files are not the same.");
			else out.accept("Files are the same.");
		} catch (IOException e) {
			out.accept("Failed to open files.");
		}
	}
}
