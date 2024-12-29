package application;

import java.awt.TextField;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			Scene scene = new Scene(root, 400, 400);

			Text tf1 = new Text("Restuarant Menu System");
			tf1.setFont(Font.font(20));
			tf1.setTextAlignment(TextAlignment.CENTER);
			tf1.setStroke(Color.RED);

			Text tf2 = new Text("Welcome to the Restaurant Menu, Select the option you want to edit");

			Button b1 = new Button("Manage Members");
			Button b2 = new Button("Manage Orders");
			Button b3 = new Button("Manage Menu Items");
			Button b4 = new Button("View Order History");
			root.setPadding(new Insets(20));
			
			GridPane.setHalignment(tf1, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(tf2, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b1, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b2, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b3, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b4, javafx.geometry.HPos.CENTER);

			
			root.setHgap(10);
			root.setVgap(10);
			root.setAlignment(Pos.CENTER);

			root.add(tf1, 0, 0);
			root.add(tf2, 0, 1);

			tf1.setTextAlignment(TextAlignment.CENTER);

			root.add(b1, 0, 3);
			root.add(b2, 0, 4);
			root.add(b3, 0, 5);
			root.add(b4, 0, 6);
			b1.setAlignment(Pos.CENTER);
			b2.setAlignment(Pos.CENTER);
			b3.setAlignment(Pos.CENTER);
			b4.setAlignment(Pos.CENTER);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
