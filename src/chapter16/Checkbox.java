package chapter16;

/*
  Based on Try This 16-1
  
  File comparer with a check box

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Checkbox implements ActionListener {

  JTextField jtfFirst;  // holds the first file name
  JTextField jtfSecond; // holds the second file name

  JButton jbtnComp; // button to compare the files

  JLabel jlabFirst, jlabSecond; // displays prompts
  JLabel jlabResult; // displays results and error messages

  JCheckBox checkbox;
  JLabel checkboxResult;

  Checkbox() {

   // Create a new JFrame container.
   JFrame jfrm = new JFrame("Compare Files");

   // Specify FlowLayout for the layout manager.
   jfrm.setLayout(new FlowLayout());

   // Give the frame an initial size.
   jfrm.setSize(200, 250);

   // Terminate the program when the user closes the application.
   jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   // Create the text fields for the file names..
   jtfFirst = new JTextField(14);
   jtfSecond = new JTextField(14);

   // Set the action commands for the text fields.
   jtfFirst.setActionCommand("fileA");
   jtfSecond.setActionCommand("fileB");

   // Create the Compare button.
   JButton jbtnComp = new JButton("Compare");

   // Add action listener for the Compare button.
   jbtnComp.addActionListener(this);
   
   // Creating a checkbox
   checkbox = new JCheckBox( "Show Mismatch?" );
   checkbox.setActionCommand( "show_mismatch" );

   // Create the labels.
   jlabFirst = new JLabel("First file: ");
   jlabSecond = new JLabel("Second file: ");
   jlabResult = new JLabel("");
   checkboxResult = new JLabel("");

   // Add the components to the content pane.
   jfrm.add(jlabFirst);
   jfrm.add(jtfFirst);
   jfrm.add(jlabSecond);
   jfrm.add(jtfSecond);
   jfrm.add(checkbox);
   jfrm.add(jbtnComp);
   jfrm.add(jlabResult);
   jfrm.add(checkboxResult);

   // Display the frame.
   jfrm.setVisible(true);
  }

  // Compare the files when the Compare button is pressed.
  public void actionPerformed(ActionEvent ae) {
   int i=0, j=0;

   // First, confirm that both file names have
   // been entered.
   if(jtfFirst.getText().equals("")) {
     jlabResult.setText("First file name missing.");
     return;
   }
   if(jtfSecond.getText().equals("")) {
     jlabResult.setText("Second file name missing.");
     return;
   }

   // Compare files. Use try-with-resources to manage the files.
   try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
        FileInputStream f2 = new FileInputStream(jtfSecond.getText()))
   {
     // Keep a count of the bytes because I couldn't think of a better way
     int byteCount = 0;
     
     // Check the contents of each file.
     do {
       i = f1.read();
       j = f2.read();
       byteCount++;
       if(i != j) break;
     } while(i != -1 && j != -1);

     if(i != j) {
       jlabResult.setText("Files are not the same.");

       if ( checkbox.isSelected() ) {
         checkboxResult.setText( "Difference at byte " + byteCount );
       }
       else {
         checkboxResult.setText( "" );
       }
     }
     else
       jlabResult.setText("Files compare equal.");
   } catch(IOException exc) {
     jlabResult.setText("File Error");
   }
   
  }

  public static void main(String args[]) {
   // Create the frame on the event dispatching thread.
   SwingUtilities.invokeLater(new Runnable() {
     public void run() {
       new Checkbox();
     }
   });
  }


}
