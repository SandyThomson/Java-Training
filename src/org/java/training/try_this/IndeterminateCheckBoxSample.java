package org.java.training.try_this;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Try This 17-1.
 */
public class IndeterminateCheckBoxSample extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10);
		root.setAlignment(Pos.CENTER);
		stage.setTitle("JavaFX CheckBox Sample");
		stage.setScene(new Scene(root, 230, 200));
		Label heading = new Label("What computers do you own?"), response = new Label(), selected = new Label();
		root.getChildren().add(heading);
		
		List<CheckBox> checkboxes = Arrays.asList("Smartphone", "Tablet", "Notebook", "Desktop")
				.stream().map(CheckBox::new).collect(Collectors.toList());
		root.getChildren().addAll(checkboxes);

		checkboxes.get(0).setAllowIndeterminate(true);
		
		Supplier<String> findSelected = () ->
			checkboxes.stream().filter(cb -> cb.isSelected()).map(cb -> cb.getText()).collect(Collectors.joining(", "));
			
		checkboxes.forEach(cb -> cb.setOnAction(e -> {
			if ( cb.isIndeterminate() )
				response.setText(String.format("%s state is indeterminate", cb.getText()));
			else
				response.setText(String.format("%s was just %s.", cb.getText(), cb.isSelected() ? "selected" : "cleared"));
			selected.setText("Computers selected: " + findSelected.get());
		}));
		
		root.getChildren().addAll(response, selected);		
		stage.show();
	}
}
