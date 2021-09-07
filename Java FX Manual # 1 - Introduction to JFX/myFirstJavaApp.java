import javafx.application.Application ;			// import the "Application" class
import javafx.stage.Stage;				// import the "Stage" class
import javafx.scene.Scene;				// import the "Scene" class

import javafx.scene.layout.FlowPane;			/* import the layout "FlowPane" 
							which will provide layout to our 
							this application and is "rootNode" 
							in our this program. */


// note that our class is inheriting "Application" class

public class myFirstJavaApp extends Application{	

	public static void main(String []args){

		launch (args);		// method to "launch" a Java FX app

	}	

	public void start (Stage myStage){

		myStage.setTitle("My First Java FX App");	// renaming the title of our app

		FlowPane rootNode = new FlowPane();		// creating layout of our app

		Scene myScene = new Scene(rootNode,500,500);	/* create scene using rootNode
								and set the size of our app window.
								In this case both width and height
								of our app window is  set to 500. */

		myStage.setScene(myScene);	// add Scene to Stage

		myStage.show();		// show the stage
	}


}	// end of class "myFirstJavaApp"	
