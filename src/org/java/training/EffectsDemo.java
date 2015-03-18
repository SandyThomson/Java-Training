package org.java.training;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.SepiaTone;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Shear;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EffectsDemo extends Application {
	private List<Consumer<Button>> ts;
	private Iterator<Consumer<Button>> transforms;

	@Override
	public void init() {
		ts = Arrays.asList(
			b -> b.setEffect(new Glow(0.6)),
			b -> {
				TranslateTransition t = new TranslateTransition(Duration.millis(350), b);
				t.setByX(30);
				t.setByY(-12);
				t.play();
			},
			b -> b.getTransforms().add(new Shear(-0.4, 0.05)),
			b -> b.getTransforms().add(new Scale(1.1, 1.1)),
			b -> b.getTransforms().add(new Translate(-30, 12)),
			b -> b.setEffect(new Lighting()),
			b -> b.setEffect(new SepiaTone())
			);
		restartTransforms();
	}

	public void restartTransforms() {
		transforms = ts.iterator();
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("More Effects & Transforms");
		FlowPane root = new FlowPane(20, 20);
		root.setAlignment(Pos.CENTER);
		stage.setScene(new Scene(root, 300, 120));

		Button target = new Button("Transform Me");

		target.setOnAction(e -> {
			if ( !transforms.hasNext() )
				restartTransforms();
			transforms.next().accept(target);	
		});

		root.getChildren().add(target);
		stage.show();
	}

}
