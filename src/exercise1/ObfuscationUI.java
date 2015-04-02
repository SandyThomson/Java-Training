package exercise1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ObfuscationUI extends Application {

	@Override
	public void start( Stage primaryStage ) {

		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle( "Select File to Obfuscate" );
		fileChooser.getExtensionFilters().addAll(
		    new ExtensionFilter( "Text Files", "*.txt", ".xml" ),
		    new ExtensionFilter( "All Files", "*.*" ) );

		Button selectbtn = new Button();
		selectbtn.setText( "Select File to Obfuscate..." );
		selectbtn.setOnAction( new EventHandler<ActionEvent>() {

			@Override
			public void handle( ActionEvent event ) {
				fileChooser.showOpenDialog( primaryStage );
			}
		} );

		Button savebtn = new Button();
		savebtn.setText( "Select Location to Save File..." );
		savebtn.setOnAction( new EventHandler<ActionEvent>() {

			@Override
			public void handle( ActionEvent event ) {
				fileChooser.showOpenDialog( primaryStage );
			}
		} );

		Button runBtn = new Button();
		runBtn.setText( "Obfuscate!" );

		StackPane root = new StackPane();
		VBox vbox = new VBox(10);
		vbox.setAlignment( Pos.CENTER );
		vbox.getChildren().add( selectbtn );
		vbox.getChildren().add( savebtn );
		Separator sep1 = new Separator();
		vbox.getChildren().add( sep1 );
		vbox.getChildren().add( runBtn );

		root.getChildren().add( vbox );

		Scene scene = new Scene( root, 300, 250 );

		primaryStage.setTitle( "File Obfuscator" );
		primaryStage.setScene( scene );
		primaryStage.show();
	}

	public static void main( String[] args ) {
		launch( args );
	}
}