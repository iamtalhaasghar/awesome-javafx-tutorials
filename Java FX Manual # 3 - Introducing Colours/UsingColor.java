
import javafx.application.Application ;
import javafx.stage.Stage;	
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;


import javafx.scene.paint.Color;	// importing class of “Color”


public class UsingColor extends Application {

	public static void main(String []args){

		launch (args);

	}				// end of main


	public void start (Stage myStage){
	
		myStage.setTitle("Using Colours");
	
		FlowPane rootNode = new FlowPane();

		
		Scene myScene = new Scene(rootNode,500,500,Color.RED); 
		
		/* The above line creates a scene from rootNode, 
		and sets the width and height of app`s Window to 500 units
		and sets the background color to “RED” */

		myStage.setScene(myScene);

		myStage.show();

	}			// end of Start

}			// end of class “UsingColor”




