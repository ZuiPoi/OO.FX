package oop10;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import oop20.GuessGameInput;
import oop20.GuessGameRandom;
import oop40.StarTracker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class GuessingGame extends Application {
    int i =0;
    private Tab tab1;
    String[] resultString= new String[2];
	//generate random
	/*Random rand = new Random();
 		private int ran() {
		int guessValue = rand.nextInt(51);
    	return guessValue;
		}*/
	  	int guessValue = GuessGameRandom.ran();

	  	//STAGE 
    public void start(Stage myStage) {
    	
	  	System.out.println(guessValue);
	
	    //basic layout
	        myStage.setTitle("Guessing game");
	        GridPane layout = new GridPane();
	        layout.setAlignment(Pos.CENTER);
	        Scene myScene = new Scene(layout, 600, 600, Color.BLUE);
	        layout.add(new Label("Guessing game!"), 1, 0);
	        layout.add(new Label("Guessing value:"), 0, 1);
	        layout.add(new Label("Result:"),0 ,4);
	        
	        
	   //	tabs

	        tab1 = new Tab();
	        tab1.setText("Guessing Game");
	        tab1.setContent(layout);

	   // Input fields
	        TextField guessInput = new TextField();
	        layout.add(guessInput, 1, 1);
	   // Guess button
	        
	        Button aButton = new Button("guess");
	        layout.add(aButton, 1, 3);
	        GridPane.setHalignment(aButton, HPos.LEFT);
	        
	  // result field
	        TextField result = new TextField();
	        result.setEditable(false);
	        layout.add(result, 1, 4);
	 // Attemps display;
	        Label attLabel = new Label();
	        attLabel.setText("Number of attempts:");
	        layout.add(attLabel, 2, 0);
	        
	        TextField attempt = new TextField();
	        attempt.setEditable(false);
	        layout.add(attempt, 2, 1);
	 // Restart help
	        Label resi = new Label();
	        resi.setText("");
	        layout.add(resi, 1, 8);
	        
	 // Close button
			Button closeButton = new Button("Close this window");
			closeButton.setOnAction(e -> myStage.close());
	        layout.add(closeButton, 1, 5);
	        
	 // Restart Button  
			Button restart = new Button("Restart");
			restart.setOnAction(e -> {
				guessInput.clear();
				attempt.clear();
				result.clear();
				i = 0;
				aButton.setDisable(false);
				guessValue = GuessGameRandom.ran();
			});
	        layout.add(restart, 1, 7);
	        
	//reset button
			Button resetButton = new Button("Reset");
			resetButton.setOnAction(e ->  restart(myStage));
	        layout.add(resetButton, 1, 6);
	        
	// test functionality
	        
	        
	//guess button 


	        aButton.setOnAction(e -> {	
	        	try {
	        	/*Integer value = Integer.valueOf(guessInput.getText());
	        	if(i<4) {
	        		resi.setText("");
	    	        aButton.setText("Guess?");
	        	resultString =GuessGameInput.GameInput(value,guessValue);
	        	result.setText(resultString[0]);
	        	aButton.setText(resultString[1]);
	        	
		        i = i+1;
	        	}
	        	
	        	else {
	    	        guessInput.clear();
	    	        result.setText("Game over");
	    	        resi.setText("Hit restart to begin again!");
	        	}*/
	        
	        	if(i<4) {
	    	        resi.setText("");
	    	        aButton.setText("Guess?");
		            Integer value = Integer.valueOf(guessInput.getText());
		            if(value<guessValue) {
		            	result.setText("your answer was too low!");
			            
		            }
		            else if(value>guessValue) {
		            	result.setText("your answer was too High!");
		            }
		            
		            else if(value==guessValue) {
		            	result.setText("your answer was correct congratulations");
		            	resi.setText("Hit restart to begin again!");
		    	        guessInput.clear();
		    	        StarTracker.starTrak.addStars(2);
		    	        aButton.setDisable(true);
		            }
		            
		        	i=i+1;
		        	Integer iVal = Integer.valueOf(i);
		        	attempt.setText(iVal.toString() );
	        	}
	        	
	        	else {
	    	        guessInput.clear();
	    	        result.setText("Game over");
	    	        resi.setText("Hit restart to begin again!");
	    	        aButton.setDisable(true);

	        	}
	        	}catch(Exception f) {
					Alert alert1 = new Alert(AlertType.WARNING);
					alert1.setTitle("Error");
					alert1.setHeaderText("Incorrect Value entered");
					alert1.setContentText("You must enter an int!");
					alert1.showAndWait();
	        	}
	        	
	        });

	        myStage.setScene(myScene);
	
	        myStage.show();
    	}
    
    void restart(Stage stage) {

        start(stage);
    }
    
    public Tab tabGet() {
    	return tab1;
    }

    public static void main(String[] args) {
        launch(args);
    }

	
	
}
