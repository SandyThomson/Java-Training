package chapter17;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*; 
import javafx.scene.layout.*; 
import javafx.scene.control.*; 
import javafx.geometry.*; 
 
public class JavaFXFC extends Application { 
 
  public static void main(String[] args) { 
 
    // Start the JavaFX application by calling launch(). 
    launch(args);   
  } 
 
  // Override the start() method. 
  public void start(Stage stage) { 
 
    // Give the stage a title. 
    stage.setTitle("File comparison using Java FX"); 
 
    // Set up a vertical flow pane
    FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10); 
 
    // Center the controls in the scene. 
    rootNode.setAlignment(Pos.CENTER); 
 
    // Create a scene. 
    Scene scene = new Scene(rootNode, 500, 250); 
 
    // Set the scene on the stage. 
    stage.setScene(scene); 
 
    // Create some label. 
    Label title = new Label("Specify some files for comparison"); 
    Label file1Label = new Label( "File 1");
    Label file2Label = new Label( "File 2");
    Label result = new Label();
    
    // Text fields
    TextField file1 = new TextField();
    file1.setPrefColumnCount( 32 );
    TextField file2 = new TextField();
    file2.setPrefColumnCount( 32 );
 
    // Create the compare button
    Button compare = new Button("Compare"); 
 
    // Handle the action events
    compare.setOnAction( (ae) -> {
      
      result.setText( "Comparing files" );
      
      if ( file1.getText().equals( "" ) ) {
        result.setText( "File 1 is empty" );
        return;
      }
      
      if ( file2.getText().equals( "" ) ) {
        result.setText( "File 2 is empty" );
        return;
      }
      
      int i = 0, j = 0;
      
      try (FileInputStream f1 = new FileInputStream(file1.getText());
          FileInputStream f2 = new FileInputStream(file2.getText()))
      {
         // Check the contents of each file.
         do {
           i = f1.read();
           j = f2.read();
           if(i != j) break;
         } while(i != -1 && j != -1);

         if(i != j)
           result.setText("Files are not the same.");
         else
           result.setText("Files are the same.");
      } catch(IOException exc) {
        result.setText("File Error");
      }
        
      
    } ); 

    // Button firer
    file1.setOnAction( (ae) -> compare.fire() );
    file2.setOnAction( (ae) -> compare.fire() );
 
    // Add the label and buttons to the scene graph. 
    rootNode.getChildren().addAll(title, file1Label, file1, file2Label, file2, compare, result); 
 
    // Show the stage and its scene. 
    stage.show(); 
  } 
  
}

