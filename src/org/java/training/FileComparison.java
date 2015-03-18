package org.java.training;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Consumer;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FileComparison extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		FlowPane root = new FlowPane(10, 10);
		root.setAlignment(Pos.CENTER);
		stage.setTitle("Compare Files");
		stage.setScene(new Scene(root, 180, 220));

		Label result = new Label();
		TextField a = new TextField(), b = new TextField();

		a.setPromptText("first file path...");
		b.setPromptText("second file path...");

		Button compare = new Button("Compare");
		compare.setOnAction(e -> compare(a.getText(), b.getText(), result::setText));

		Arrays.asList(a, b).forEach(tf -> tf.setOnAction(e -> compare.fire()));

		root.getChildren().addAll(a, b, compare, result);
		stage.show();
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
			else out.accept("Files are the same. Rejoice.");
		} catch (IOException e) {
			out.accept("Failed to open files :-(.");
		}
	}
}
