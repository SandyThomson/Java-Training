package org.java.training;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class ListDemoPlusPlus {
	final String[] names = {"Flame", "Bubblegum", "Lumpy Space", "Ghost", "Slime", "Breakfast", "Crab", "Wildberry"};
	
	public ListDemoPlusPlus() {
		JFrame frame = frame();
		
		JLabel label = new JLabel("Choose a name. Do it.");
		JList<String> ls = new JList<>(names);
		ls.addListSelectionListener(le -> showNames(ls.getSelectedIndices(), label::setText));
		
		JScrollPane scroll = new JScrollPane(ls);
		scroll.setPreferredSize(new Dimension(120, 110));

		Arrays.asList(scroll, label).forEach(frame::add);
		frame.setVisible(true);
	}
	
	public void showNames(int[] indices, Consumer<String> out) {
		if( indices.length == 0 ) {
			out.accept("<html>Seriously. Pick some names.<br />I'll display 'em.</html>");
			return;
		}
		
		String selected = Arrays.stream(indices).mapToObj(i -> names[i]).collect(Collectors.joining("</li><li>"));
		selected = String.format("<ul><li>%s</li></ul>", selected);
		out.accept(String.format("<html>Current selections:%s</html>", selected));
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(ListDemoPlusPlus::new);
	}

	public static JFrame frame() {
		JFrame frame = new JFrame("List Demo");
		frame.setLayout(new FlowLayout());
		frame.setSize(200, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return frame;
	}
}
