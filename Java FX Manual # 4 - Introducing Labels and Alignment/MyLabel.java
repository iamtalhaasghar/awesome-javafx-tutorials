
import javafx.application.Application ;
import javafx.stage.Stage;	
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;


import javafx.scene.control.Label;	// importing class "Label" to use Labels



public class MyLabel extends Application{

	public static void main(String []args){
	
		launch (args);
	}				// end of main



	public void start (Stage myStage){
		
		myStage.setTitle("Using Labels");
		
		FlowPane rootNode = new FlowPane();

		Scene myScene = new Scene(rootNode,500,500);

		Label myLabel = new Label ("This is a Label");
	
		rootNode.getChildren().add(myLabel);

		myStage.setScene(myScene);

		myStage.show();

	}			// end of Start

}			// end of class "MyLabel"
