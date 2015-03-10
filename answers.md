### Chapter 16 Self Test

  1) _In general, AWT components are heavyweight and Swing components are_
      _______.

Lightweight.

  2) _Can the look and feel of a Swing component be changed? If so, what feature
      enables this?_

Yes, using Swing's _"pluggable look and feel"_ architecture.

  3) _What is the most commonly used top-level container for an application?_

`JFrame`.

  4) _Top-level containers have several panes. To what pane are components added?_

The content pane.

  5) _Show how to construct a label that contains the message "Select an entry from
      the list"._

```java
new JLabel("Select an entry from the list");
```

  6) _All interaction with GUI components must take place on what thread?_

The event dispatching thread.

  7) _What is the default action command associated with a `JButton`? How can the action
      command be changed?_

The text displayed in the button is the default action command. It can be changed with e.g.
`setActionCommand("secret destroy the universe button")`.

  8) _What event is generated when a push button is pressed?_

An `ActionEvent`.

  9) _Show how to create a text field that has 32 columns._

```java
new JTextField(32);
```

 10) _Can a `JTextField` have its action command set? If so, how?_

The same way as shown in question #7, just call `setActionCommand` on the instance.

 11) _What Swing component creates a check box? What event is generated when a check box is
      selected or deselected?_

Based on the weird naming convention, probably `JCheckBox`. Changes to the check box send
an `ItemEvent`.

 12) _`JList` displays a list of items from which the user can select. True or False?_

True.

 13) _What event is generated when the user selects or deselects an item in a `JList`?_

A `ListSelectionEvent`.

 14) _What method sets the selection mode of a `JList`? What method obtains the index of the
      first selected item?_

`setSelectionMode()` and `getSelectedIndex()`.

 15) _To create a Swing-based applet, what class must you inherit?_

`JApplet`.

 16) _Usually, Swing-based applets use `invokeAndWait()` to create the initial GUI. True
      of False?_

True.

 17 _Add a check box to the file comparer developed in Try This 15-1 that has the following text:
     Show position of mismatch. When this box is checked, have the program display the location
     of the first point in the files at which a mismatch occurs._

See [FileLocComparison.java](src/org/java/training/FileLocComparison.java).

 18) _Change the `ListDemo` program so that it allows multiple items in the list to be selected._

See [ListDemoPlusPlus](src/org/java/training/ListDemoPlusPlus.java).

 19) _Bonus challenge: Convert the help class developed in Try This 4-1 into a Swing-based GUI
      program. Display the keywords (`for`, `while`, `switch`_, and so on) in a `JList`.
      When the user selects one, display the keyword's syntax. To display multiple lines of
      text within a label, you can use HTML. When doing so, you must begin the text with the
      sequence `<html>`. When this is done, the text is automatically formatted as described
      by the markup. In addition to other benefits, HTML enables you to create labels that span
      two or more lines. For example, this creates a label that displays two lines of text,
      with the string "Top" over the string "Bottom"._
```java
JLabel jlabhtml = new JLabel("<html>Top<br>Bottom</html>");
```
_No answer is shown for this exercise. You have reached the point where you are ready to apply
 your Java skills on your own!_

See [HelpSystem.java](src/org/java/training/HelpSystem.java).


 