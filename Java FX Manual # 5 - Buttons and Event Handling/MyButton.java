
import javafx.application.Application ;
import javafx.stage.Stage;	
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;


import javafx.geometry.Pos;		// importing "geometry.Pos" for Alignment of child nodes

import javafx.scene.control.Button;	// importing class "Button" to use Buttons



public class MyButton extends Application{

	public static void main(String []args){
	
		launch (args);
	}				// end of main



	public void start (Stage myStage){
		
		myStage.setTitle("Using Buttons");
		
		FlowPane rootNode = new FlowPane();

		Scene myScene = new Scene(rootNode,500,500);

		Button myButton = new Button("A Button");
	
		rootNode.getChildren().add(myButton);
		
		rootNode.setAlignment(Pos.CENTER);	// set the alignment to CENTER

		myStage.setScene(myScene);

		myStage.show();

	}			// end of Start

}			// end of class "MyButton"
