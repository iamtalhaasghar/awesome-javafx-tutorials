import javafx.application.Application ;
import javafx.stage.Stage;	
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

	// importing class "Button" to use Buttons
import javafx.scene.control.Button;

public class MyButton2 extends Application{
	
	public static void main(String []args){
	
		launch (args);
	}				// end of main

	public void start (Stage myStage){

	myStage.setTitle("Event Handling");

	FlowPane rootNode = new FlowPane();

	Scene myScene = new Scene(rootNode,500,500);

	Button myButton = new Button("A Button");

	Label myLabel = new Label("");

	rootNode.getChildren().addAll(myLabel,myButton);

	rootNode.setAlignment(Pos.CENTER);

	myButton.setOnAction((myAction) ->{

		myLabel.setText("Welcome to Java FX 8.");
	});
	
	myStage.setScene(myScene);
	
	myStage.show();

	}			// end of Start

}			// end of class "MyButton2"
