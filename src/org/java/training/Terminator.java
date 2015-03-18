package org.java.training;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Terminator extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		FlowPane root = new FlowPane(10, 10);
		root.setAlignment(Pos.CENTER);
		stage.setTitle("TERMINATOR");
		stage.setScene(new Scene(root, 180, 100));

		Button run = new Button("Run"), exit = new Button("Exit");
		Label action = new Label("Push a button. Do it.");

		run.setOnAction(e -> action.setText("Run pressed. Nicely done."));
		exit.setOnAction(e -> Platform.exit());

		root.getChildren().addAll(run, exit, action);
		stage.show();
	}
}
