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

	private static ArrayList<Member> members;

	@Override
	public void start(Stage primaryStage) {
		try {
			Member.loadMembers();
			members = Member.getMembers();
			System.out.println(members);
			GridPane homePane = new GridPane();
			// Restuarant Management System
			Scene homeScene = new Scene(homePane, 400, 400);

			Text t1 = new Text("Restuarant Menu System");
			t1.setFont(Font.font(20));
			t1.setTextAlignment(TextAlignment.CENTER);
			t1.setStroke(Color.RED);

			Text t2 = new Text("Welcome to the Restaurant Menu, Select the option you want to edit");

			Button memberManageButton = new Button("Manage Members");
			Button orderManageButton = new Button("Manage Orders");
			Button menuManageButton = new Button("Manage Menu Items");
			Button orderHistoryButton = new Button("View Order History");
			homePane.setPadding(new Insets(20));

			GridPane.setHalignment(t1, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(t2, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(memberManageButton, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(orderManageButton, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(menuManageButton, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(orderHistoryButton, javafx.geometry.HPos.CENTER);

			homePane.setHgap(10);
			homePane.setVgap(10);
			homePane.setAlignment(Pos.CENTER);

			homePane.add(t1, 0, 0);
			homePane.add(t2, 0, 1);

			t1.setTextAlignment(TextAlignment.CENTER);

			homePane.add(memberManageButton, 0, 3);
			homePane.add(orderManageButton, 0, 4);
			homePane.add(menuManageButton, 0, 5);
			homePane.add(orderHistoryButton, 0, 6);
			memberManageButton.setAlignment(Pos.CENTER);
			orderManageButton.setAlignment(Pos.CENTER);
			menuManageButton.setAlignment(Pos.CENTER);
			orderHistoryButton.setAlignment(Pos.CENTER);

			// Which option to manage - scene
			GridPane managePane = new GridPane();
			Scene manageScene = new Scene(managePane, 400, 400);
			Text t2_1 = new Text("Member Managment Panel");
			t2_1.setFont(Font.font(20));
			t2_1.setTextAlignment(TextAlignment.CENTER);
			t2_1.setStroke(Color.RED);

			Text t2_2 = new Text("Select Option to Manage Member");
			Text t2_3 = new Text("What member would you like to manage?");

			Button customerButton = new Button("Customer");
			Button staffButton = new Button("Staff");

			managePane.setPadding(new Insets(20));

			GridPane.setHalignment(t2_1, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(t2_2, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(customerButton, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(staffButton, javafx.geometry.HPos.CENTER);

			managePane.setHgap(10);
			managePane.setVgap(10);
			managePane.setAlignment(Pos.CENTER);

			managePane.add(t2_1, 0, 0);
			managePane.add(t2_2, 0, 1);

			t1.setTextAlignment(TextAlignment.CENTER);

			managePane.add(customerButton, 0, 3);
			managePane.add(staffButton, 0, 4);

			customerButton.setAlignment(Pos.CENTER);
			staffButton.setAlignment(Pos.CENTER);

			// Customer Manage Scene
			GridPane customerPane = new GridPane();
			Scene customerScene = new Scene(customerPane, 400, 400);
			Text t3_1 = new Text("Customer Managment Panel");
			t3_1.setFont(Font.font(20));
			t3_1.setTextAlignment(TextAlignment.CENTER);
			t3_1.setStroke(Color.RED);

			Text t3_2 = new Text("Select Option to Manage Member");
			Text t3_3 = new Text("What member would you like to manage?");

			Button addCustomerButton = new Button("Add Customer");
			Button removeCustomerButton = new Button("Remove Customer");
			Button updateCustomerButton = new Button("Update Customer");
			Button viewCustomerButton = new Button("View All Customers");

			managePane.setPadding(new Insets(20));

			GridPane.setHalignment(t3_1, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(t3_2, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(addCustomerButton, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(removeCustomerButton, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(updateCustomerButton, javafx.geometry.HPos.CENTER);
			GridPane.setHalignment(viewCustomerButton, javafx.geometry.HPos.CENTER);

			customerPane.setHgap(10);
			customerPane.setVgap(10);
			customerPane.setAlignment(Pos.CENTER);

			customerPane.add(t3_1, 0, 0);
			customerPane.add(t3_2, 0, 1);

			t1.setTextAlignment(TextAlignment.CENTER);

			customerPane.add(addCustomerButton, 0, 3);
			customerPane.add(removeCustomerButton, 0, 4);
			customerPane.add(updateCustomerButton, 0, 5);
			customerPane.add(viewCustomerButton, 0, 6);

			addCustomerButton.setAlignment(Pos.CENTER);
			removeCustomerButton.setAlignment(Pos.CENTER);

			// Add Customer - Scene

			GridPane addCustomerPane = new GridPane();
			Scene addCustomerScene = new Scene(addCustomerPane, 400, 400);

			Text t4_1 = new Text("Add Customer");
			t4_1.setFont(Font.font(20));
			t4_1.setTextAlignment(TextAlignment.CENTER);
			t4_1.setStroke(Color.RED);

			Text nameLabel = new Text("Name");
			Text ageLabel = new Text("Age");
			Text phoneLabel = new Text("Phone");
			Text cardLabel = new Text("Card");

			Text added = new Text("");

			TextField tf4_2 = new TextField();
			TextField tf4_3 = new TextField();
			TextField tf4_4 = new TextField();
			ComboBox<String> cardBox = new ComboBox<String>();
			cardBox.getItems().addAll("Master Card", "VISA", "Western Union");

			Button backButton1 = new Button("Back");
			Button clearButton1 = new Button("Clear All");
			Button addCustomerButton1 = new Button("Add Customer");

			addCustomerPane.setHgap(10);
			addCustomerPane.setVgap(10);
			addCustomerPane.setAlignment(Pos.CENTER);

			addCustomerPane.add(t4_1, 1, 0);
			addCustomerPane.add(nameLabel, 0, 1);
			addCustomerPane.add(ageLabel, 0, 2);
			addCustomerPane.add(phoneLabel, 0, 3);
			addCustomerPane.add(cardLabel, 0, 4);
			addCustomerPane.add(added, 1, 7);
			added.setVisible(false);

			addCustomerPane.add(tf4_2, 1, 1);
			addCustomerPane.add(tf4_3, 1, 2);
			addCustomerPane.add(tf4_4, 1, 3);
			addCustomerPane.add(cardBox, 1, 4);

			addCustomerPane.add(backButton1, 0, 0);
			addCustomerPane.add(clearButton1, 0, 6);
			addCustomerPane.add(addCustomerButton1, 1, 6);

			// Remove Customer - Scene
			GridPane remCustomerPane = new GridPane();
			Scene remCustomerScene = new Scene(remCustomerPane, 400, 400);

			Text t5_1 = new Text("Remove Customer");
			t5_1.setFont(Font.font(20));
			t5_1.setTextAlignment(TextAlignment.CENTER);
			t5_1.setStroke(Color.RED);

			Text nameLabel2 = new Text("Name");
			Text phoneLabel2 = new Text("Phone");

			Text removed = new Text("Member Successfully Removed");

			TextField tf5_2 = new TextField();
			TextField tf5_3 = new TextField();

			Button backButton2 = new Button("Back");
			Button clearButton2 = new Button("Clear All");
			Button removeCustomerButton1 = new Button("Remove Customer");

			remCustomerPane.setHgap(10);
			remCustomerPane.setVgap(10);
			remCustomerPane.setAlignment(Pos.CENTER);

			remCustomerPane.add(t5_1, 1, 0);
			remCustomerPane.add(nameLabel2, 0, 1);
			remCustomerPane.add(phoneLabel2, 0, 2);
			remCustomerPane.add(removed, 1, 3);
			removed.setVisible(false);

			remCustomerPane.add(tf5_2, 1, 1);
			remCustomerPane.add(tf5_3, 1, 2);

			remCustomerPane.add(backButton2, 0, 0);
			remCustomerPane.add(clearButton2, 0, 6);
			remCustomerPane.add(removeCustomerButton1, 1, 6);

			// Update Customer Scene
			GridPane updateCustomerPane = new GridPane();
			Scene updateCustomerScene = new Scene(updateCustomerPane, 400, 400);

			Text t6_1 = new Text("Update Customer");
			t6_1.setFont(Font.font(20));
			t6_1.setTextAlignment(TextAlignment.CENTER);
			t6_1.setStroke(Color.RED);

			Text nameLabel3 = new Text("Name");
			Text ageLabel3 = new Text("Enter new age");
			Text phoneLabel3 = new Text("Enter new phone");
			Text cardLabel3 = new Text("Enter new card");

			Text updated = new Text("");

			TextField tf6_2 = new TextField();
			TextField tf6_3 = new TextField();
			TextField tf6_4 = new TextField();
			ComboBox<String> updateBox = new ComboBox<String>();
			updateBox.getItems().addAll("Master Card", "VISA", "Western Union");

			Button backButton3 = new Button("Back");
			Button clearButton3 = new Button("Clear All");
			Button updateCustomerButton3 = new Button("Update Customer");

			updateCustomerPane.setHgap(10);
			updateCustomerPane.setVgap(10);
			updateCustomerPane.setAlignment(Pos.CENTER);

			updateCustomerPane.add(t6_1, 1, 0);
			updateCustomerPane.add(nameLabel3, 0, 1);
			updateCustomerPane.add(ageLabel3, 0, 2);
			updateCustomerPane.add(phoneLabel3, 0, 3);
			updateCustomerPane.add(cardLabel3, 0, 4);
			updateCustomerPane.add(updated, 1, 7);
			added.setVisible(false);

			updateCustomerPane.add(tf6_2, 1, 1);
			updateCustomerPane.add(tf6_3, 1, 2);
			updateCustomerPane.add(tf6_4, 1, 3);
			updateCustomerPane.add(updateBox, 1, 4);

			updateCustomerPane.add(backButton3, 0, 0);
			updateCustomerPane.add(clearButton3, 0, 6);
			updateCustomerPane.add(updateCustomerButton3, 1, 6);

			primaryStage.setScene(homeScene);
			primaryStage.show();

			// Home Screen Actions
			memberManageButton.setOnAction(e -> {
				primaryStage.setScene(manageScene);
			});

			customerButton.setOnAction(e -> {
				primaryStage.setScene(customerScene);
			});

			addCustomerButton.setOnAction(e -> {
				primaryStage.setScene(addCustomerScene);
			});

			removeCustomerButton.setOnAction(e -> {
				primaryStage.setScene(remCustomerScene);
			});

			updateCustomerButton.setOnAction(e -> {
				primaryStage.setScene(updateCustomerScene);
			});

			// Add Customer Actions

			backButton1.setOnAction(e -> {
				primaryStage.setScene(customerScene);
			});

			clearButton1.setOnAction(e -> {
				tf4_2.clear();
				tf4_3.clear();
				tf4_4.clear();
			});

			addCustomerButton1.setOnAction(e -> {
				String name = tf4_2.getText();
				int age = Integer.parseInt(tf4_3.getText());
				added.setVisible(true);
				String phone = tf4_4.getText();
				if ((age < 0 || age > 120)) {
					added.setText("Please Enter Valid Age");
				} else if (phone.length() != 8) {
					added.setText("Please Enter Valid Phone Number");
				} else {
					added.setText("Member Added Successfully");
					String cardType = cardBox.getSelectionModel().getSelectedItem();
					Customer customer = new Customer(name, age, phone, cardType);
					System.out.println("Member Added Successfully");

					tf4_2.clear();
					tf4_3.clear();
					tf4_4.clear();

					Member.addMember(customer);
					System.out.println(members.toString());
					added.setVisible(true);
				}

			});

			// Remove Customer Actions
			backButton2.setOnAction(e -> {
				primaryStage.setScene(customerScene);

			});

			clearButton2.setOnAction(e -> {
				tf5_2.clear();
				tf5_3.clear();
			});

			removeCustomerButton1.setOnAction(e -> {
				String name = tf5_2.getText();
				String phone = tf5_3.getText();

				tf4_2.clear();
				tf4_3.clear();
				tf4_4.clear();

				System.out.println(members.toString());
				String removedTemp = Member.removeMember(name, phone);
				removed.setText(removedTemp);
				removed.setVisible(true);
			});

			// Update Customer Actions

			backButton3.setOnAction(e -> {
				primaryStage.setScene(customerScene);
			});

			clearButton3.setOnAction(e -> {
				tf6_2.clear();
				tf6_3.clear();
				tf6_4.clear();
			});

			updateCustomerButton3.setOnAction(e -> {
				String name = tf6_2.getText();
				System.out.println(members);
				if (members.size() != 0) {
					for (Member member : members) {
						if (member.getName().equalsIgnoreCase(name)) {
							int age = Integer.parseInt(tf6_3.getText());
							Customer updateCustomer = (Customer) member;
							added.setVisible(true);
							String phone = tf6_4.getText();
							if ((age < 0 || age > 120)) {
								updated.setText("Please Enter Valid Age");
							} else if (phone.length() != 8) {
								updated.setText("Please Enter Valid Phone Number");
							} else {
								String cardType = cardBox.getSelectionModel().getSelectedItem();
								updated.setText("Member Updated Successfully");
								updateCustomer.setAge(age);
								updateCustomer.setPhone(phone);
								updateCustomer.setCardType(cardType);
								System.out.println("Member Updated Successfully");

								tf6_2.clear();
								tf6_3.clear();
								tf6_4.clear();

								System.out.println(members.toString());
								added.setVisible(true);
							}
						} else {
							updated.setText("Customer with entered name not found");
							System.out.print("Customer with entered name not found");
						}
					}
				} else {
					updated.setText("Members database is empty");
					System.out.print("Members database is empty");
				}

			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
