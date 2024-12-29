package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Main extends Application {
	
	private static ArrayList <Member> members = new ArrayList<>();
	
	public static ArrayList<Member> getMembers() {
		return members;
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root1 = new GridPane();
			// Scene 1
			Scene scene1 = new Scene(root1, 400, 400);

			Text t1 = new Text("Restuarant Menu System");
			t1.setFont(Font.font(20));
			t1.setTextAlignment(TextAlignment.CENTER);
			t1.setStroke(Color.RED);

			Text t2 = new Text("Welcome to the Restaurant Menu, Select the option you want to edit");

			Button b1 = new Button("Manage Members");
			Button b2 = new Button("Manage Orders");
			Button b3 = new Button("Manage Menu Items");
			Button b4 = new Button("View Order History");
			root1.setPadding(new Insets(20));

			GridPane.setHalignment(t1, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(t2, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b1, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b2, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b3, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b4, javafx.geometry.HPos.CENTER);

			root1.setHgap(10);
			root1.setVgap(10);
			root1.setAlignment(Pos.CENTER);

			root1.add(t1, 0, 0);
			root1.add(t2, 0, 1);

			t1.setTextAlignment(TextAlignment.CENTER);

			root1.add(b1, 0, 3);
			root1.add(b2, 0, 4);
			root1.add(b3, 0, 5);
			root1.add(b4, 0, 6);
			b1.setAlignment(Pos.CENTER);
			b2.setAlignment(Pos.CENTER);
			b3.setAlignment(Pos.CENTER);
			b4.setAlignment(Pos.CENTER);

			// Scene 2
			GridPane root2 = new GridPane();
			Scene scene2 = new Scene(root2, 400, 400);
			Text t2_1 = new Text("Member Managment Panel");
			t2_1.setFont(Font.font(20));
			t2_1.setTextAlignment(TextAlignment.CENTER);
			t2_1.setStroke(Color.RED);

			Text t2_2 = new Text("Select Option to Manage Member");
			Text t2_3 = new Text("What member would you like to manage?");

			Button b2_1 = new Button("Customer");
			Button b2_2 = new Button("Staff");

			root2.setPadding(new Insets(20));

			GridPane.setHalignment(t2_1, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(t2_2, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b2_1, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b2_2, javafx.geometry.HPos.CENTER);

			root2.setHgap(10);
			root2.setVgap(10);
			root2.setAlignment(Pos.CENTER);

			root2.add(t2_1, 0, 0);
			root2.add(t2_2, 0, 1);

			t1.setTextAlignment(TextAlignment.CENTER);

			root2.add(b2_1, 0, 3);
			root2.add(b2_2, 0, 4);

			b2_1.setAlignment(Pos.CENTER);
			b2_2.setAlignment(Pos.CENTER);

			// Scene 3
			GridPane root3 = new GridPane();
			Scene scene3 = new Scene(root3, 400, 400);
			Text t3_1 = new Text("Customer Managment Panel");
			t3_1.setFont(Font.font(20));
			t3_1.setTextAlignment(TextAlignment.CENTER);
			t3_1.setStroke(Color.RED);

			Text t3_2 = new Text("Select Option to Manage Member");
			Text t3_3 = new Text("What member would you like to manage?");

			Button b3_1 = new Button("Add Customer");
			Button b3_2 = new Button("Remove Customer");
			Button b3_3 = new Button("Update Customer");
			Button b3_4 = new Button("View All Customers");

			root2.setPadding(new Insets(20));

			GridPane.setHalignment(t3_1, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(t3_2, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b3_1, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b3_2, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b3_3, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(b3_4, javafx.geometry.HPos.CENTER);

			root3.setHgap(10);
			root3.setVgap(10);
			root3.setAlignment(Pos.CENTER);

			root3.add(t3_1, 0, 0);
			root3.add(t3_2, 0, 1);

			t1.setTextAlignment(TextAlignment.CENTER);

			root3.add(b3_1, 0, 3);
			root3.add(b3_2, 0, 4);
			root3.add(b3_3, 0, 5);
			root3.add(b3_4, 0, 6);

			b3_1.setAlignment(Pos.CENTER);
			b3_2.setAlignment(Pos.CENTER);

			// Scene 4

			GridPane root4 = new GridPane();
			Scene scene4 = new Scene(root4, 400, 400);

			Text t4_1 = new Text("Add Customer");
			t4_1.setFont(Font.font(20));
			t4_1.setTextAlignment(TextAlignment.CENTER);
			t4_1.setStroke(Color.RED);

			Text t4_2 = new Text("Name");
			Text t4_3 = new Text("Age");
			Text t4_4 = new Text("Phone");
			Text t4_6 = new Text("Card");

			TextField tf4_2 = new TextField();
			TextField tf4_3 = new TextField();
			TextField tf4_4 = new TextField();
			ComboBox<String> cardBox = new ComboBox<String>();
			cardBox.getItems().addAll("Master Card", "VISA", "Western Union");

			Button b4_1 = new Button("Back");
			Button b4_2 = new Button("Clear All");
			Button b4_3 = new Button("Add Member");

			root4.setHgap(10);
			root4.setVgap(10);
			root4.setAlignment(Pos.CENTER);

			root4.add(t4_1, 1, 0);
			root4.add(t4_2, 0, 1);
			root4.add(t4_3, 0, 2);
			root4.add(t4_4, 0, 3);
			root4.add(t4_6, 0, 4);

			root4.add(tf4_2, 1, 1);
			root4.add(tf4_3, 1, 2);
			root4.add(tf4_4, 1, 3);
			root4.add(cardBox, 1, 4);

			root4.add(b4_1, 0, 0);
			root4.add(b4_2, 0, 6);
			root4.add(b4_3, 1, 6);

			primaryStage.setScene(scene1);
			primaryStage.show();

			b1.setOnAction(e -> {
				primaryStage.setScene(scene2);
			});

			b2_1.setOnAction(e -> {
				primaryStage.setScene(scene3);
			});

			b3_1.setOnAction(e -> {
				primaryStage.setScene(scene4);
			});

			b4_2.setOnAction(e -> {

			});

			b4_3.setOnAction(e -> {
				String name = tf4_2.getText();
				int age = Integer.parseInt(tf4_3.getText());
				String phone = tf4_4.getText();
				String cardType = cardBox.getSelectionModel().getSelectedItem();
				Customer customer = new Customer(name, age, phone, cardType);
				System.out.println("Member Added Successfully");

				tf4_2.clear();
				tf4_3.clear();
				tf4_4.clear();
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
