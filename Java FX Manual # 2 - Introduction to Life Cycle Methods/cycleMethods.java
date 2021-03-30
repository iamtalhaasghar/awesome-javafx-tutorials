
import javafx.application.Application ;
import javafx.stage.Stage;	
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;

public class cycleMethods extends Application{

	public static void main(String []args){

		System.out.println("Start of main.");
		
		System.out.println("Calling Launch ...");

		launch (args);

		System.out.println("End of main.");


	}	// end of main


	public void init (){

		System.out.println("This is method Init.");


	}		// end of method "init"




	public void start (Stage myStage){

		System.out.println("Body of Start Method.");
		
		System.out.println("Launching JFX App");

		myStage.setTitle("Life Cycle Methods");

		FlowPane rootNode = new FlowPane();

		Scene myScene = new Scene(rootNode,500,500);

		myStage.setScene(myScene);

		myStage.show();

		System.out.println("End of Start Method.");


	}			// end of method "Start"

	
	public void stop (){

		System.out.println("This is method Stop.");


	}	// end of method "stop"



}			// end of class "cycleMethods"

