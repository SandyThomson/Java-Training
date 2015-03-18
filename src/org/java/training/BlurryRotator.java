package org.java.training;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class BlurryRotator extends Application {

	double angle = 0.0, scaleFactor = 0.4, blurAmount = 1.0;
	Reflection reflect = new Reflection();
	Rotate rotate = new Rotate();
	Scale scale = new Scale(scaleFactor, scaleFactor);
	BoxBlur
		blur = new BoxBlur(1.0, 1.0, 1),
		rotateBlur = new BoxBlur(5.d, 5.d, 2);
	
	Button
		rotated = new Button("Rotate"),
		blurred = new Button("Blur"),
		scaled = new Button("Scale");
	Label reflected = new Label("Reflect");
	
	@Override
	public void init() {
		reflect.setTopOpacity(0.7);
		reflect.setBottomOpacity(0.3);
		
		rotated.setOnAction(e -> {
			angle += 15.;
			rotate.setAngle(angle);
			rotate.setPivotX(rotated.getWidth() / 2.d);
			rotate.setPivotY(rotated.getHeight() / 2.d);
		});
		
		scaled.setOnAction(e -> {
			scaleFactor += 0.1;
			scaleFactor = scaleFactor > 2.0 ? 0.4 : scaleFactor;
			scale.setX(scaleFactor);
			scale.setY(scaleFactor);
		});
		
		blurred.setOnAction(e -> {
			blurAmount = ++blurAmount > 10.d ? 1.d : blurAmount;
			blurred.setEffect(blurAmount <= 1.d ? null : blur);
			blur.setWidth(blurAmount);
			blur.setHeight(blurAmount);
		});
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Effects and Transforms Demo");
		FlowPane root = new FlowPane(20, 20);
		root.setAlignment(Pos.CENTER);
		stage.setScene(new Scene(root, 300, 120));
		
		rotated.getTransforms().addAll(rotate);
		rotated.setEffect(rotateBlur);
		scaled.getTransforms().add(scale);
		reflected.setEffect(reflect);
		
		root.getChildren().addAll(rotated, scaled, blurred, reflected);
		stage.show();
	}
}
