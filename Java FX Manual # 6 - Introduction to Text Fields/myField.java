import javafx.application.Application ;

import javafx.stage.Stage;	

import javafx.scene.Scene;

import javafx.scene.layout.FlowPane;

import javafx.geometry.Pos;

	// importing classes "Label" and "Button"

import javafx.scene.control.Label;

import javafx.scene.control.Button;

	// importing class "TextField" to use TextFields

import javafx.scene.control.TextField;



public class myField extends Application{

	public static void main(String []args){

		launch (args);
	}				// end of main


	
	public void start (Stage myStage){
		
		myStage.setTitle("Using Text Fields");

		FlowPane rootNode = new FlowPane(15,15);

		Scene myScene = new Scene(rootNode,500,500);


		Label myLabel = new Label ("Enter name:");

		Button myButton = new Button ("Ok!");

		TextField myField = new TextField();

		rootNode.getChildren().addAll(myLabel,myField,myButton);


		rootNode.setAlignment(Pos.CENTER);
		
	
		myButton.setOnAction((myAction) ->{
	
			String name = myField.getText();

			myLabel.setText("Welcome " + name + "!");
		});

	
		myStage.setScene(myScene);

		myStage.show();
	
	}			// end of Start



}			// end of class "myField"
