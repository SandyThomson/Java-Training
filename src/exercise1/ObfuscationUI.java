package exercise1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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

		Button btn = new Button();
		btn.setText( "Select File to Obfuscate..." );
		btn.setOnAction( new EventHandler<ActionEvent>() {

			@Override
			public void handle( ActionEvent event ) {
				fileChooser.showOpenDialog( primaryStage );
			}
		} );


		StackPane root = new StackPane();
		root.getChildren().add( btn );

		Scene scene = new Scene( root, 300, 250 );

		primaryStage.setTitle( "File Obfuscator" );
		primaryStage.setScene( scene );
		primaryStage.show();
	}

	public static void main( String[] args ) {
		launch( args );
	}
}