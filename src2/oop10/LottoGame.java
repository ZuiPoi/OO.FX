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
import javafx.scene.control.Tab;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import oop30.LottoRand;
import oop40.StarTracker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class LottoGame extends Application {
	private Tab tab1;
	Random rand = new Random();
	//random generation
	
    public void start(Stage myStage) {
    		
	    	

	    	
	    	
	    	// LAYOUT
	    	
	        //scene +basic labelling
	        myStage.setTitle("Guessing game");
	        GridPane layout = new GridPane();
	        layout.setAlignment(Pos.CENTER);
	        Scene myScene = new Scene(layout, 1200, 900);
	        layout.add(new Label("Lotto game!"), 1, 0);
	        layout.add(new Label("Guessing values:"), 0, 1);
	        layout.add(new Label("Result:"),0 ,4);
	        
	        //Tab
	        tab1 = new Tab();
	        tab1.setText("Lotto");
	        tab1.setContent(layout);
	        
	        //Input Fields
	        TextField guessInput = new TextField();
	        layout.add(guessInput, 1, 1);
	        TextField guessInput2 = new TextField();
	        layout.add(guessInput2, 2, 1);
	        TextField guessInput3 = new TextField();
	        layout.add(guessInput3, 3, 1);
	        TextField guessInput4 = new TextField();
	        layout.add(guessInput4, 4, 1);
	        TextField guessInput5 = new TextField();
	        layout.add(guessInput5, 5, 1);
	        
	        // Guessing button
	        Button aButton = new Button("Roll the lotto");
	        layout.add(aButton, 1, 3);
	        GridPane.setHalignment(aButton, HPos.LEFT);
	        
	        //Result Fields
	        TextField result = new TextField();
	        result.setEditable(false);
	        layout.add(result, 1, 4);
	        TextField result2 = new TextField();
	        result2.setEditable(false);
	        layout.add(result2, 2, 4);
	        TextField result3 = new TextField();
	        result3.setEditable(false);
	        layout.add(result3, 3, 4);
	        TextField result4 = new TextField();
	        result4.setEditable(false);
	        layout.add(result4, 4, 4);
	        TextField result5 = new TextField();
	        result5.setEditable(false);
	        layout.add(result5, 5, 4);
	        TextField result6 = new TextField();
	        result6.setEditable(false);
	        layout.add(result6, 1, 2);
	        
	        
	        //close button
			Button closeButton = new Button("Close this application");
			closeButton.setOnAction(e -> myStage.close());
	        layout.add(closeButton, 1, 9);
	        
	        //restart button
	        Button restart = new Button("clear fields");
			restart.setOnAction(e -> {
	    	guessInput.clear();
	    	guessInput2.clear();
	    	guessInput3.clear();
	    	guessInput4.clear();
	    	guessInput5.clear();
	    	result.clear();
	    	result2.clear();
	    	result3.clear();
	    	result4.clear();
	    	result5.clear();
	    	result6.clear();
			});
			
	        layout.add(restart, 1, 7);
	        
	        //reset button
			Button resetButton = new Button("Reset");
			resetButton.setOnAction(e ->  restart(myStage));
	        layout.add(resetButton, 1, 8);
	        
	        // FUNCTIONALITY
	        
	        //Value intake displays; 
	        aButton.setOnAction(e -> {
	        	try {
		    	int[] valArray = LottoRand.ran();
	        	int res = 0;
	            Integer value1 = Integer.valueOf(valArray[0]);
	            result.setText(value1.toString());
		        Integer value2 = Integer.valueOf(valArray[1]);
	            result2.setText(value2.toString());
		        Integer value3 = Integer.valueOf(valArray[2]);  
	            result3.setText(value3.toString());
			    Integer value4 = Integer.valueOf(valArray[3]);
	            result4.setText(value4.toString());
				Integer value5 = Integer.valueOf(valArray[4]);
	            result5.setText(value5.toString());
	            
	            Integer g1 = Integer.valueOf(guessInput.getText());
		        Integer g2 = Integer.valueOf(guessInput2.getText());
		        Integer g3 = Integer.valueOf(guessInput3.getText());  
			    int g4 = Integer.valueOf(guessInput4.getText());
				int g5 = Integer.valueOf(guessInput5.getText());

					
				
	            if(g1==valArray[0]) {
	            	res=res+1;
	            }
	            
	            if(g2==valArray[1]) {
	            	res=res+1;
	            }
	            
	            if(g3==valArray[2]) {
	            	res=res+1;
	            }
	            
	            if(g4==valArray[3]) {
	            	res=res+1;
	            }
	            
	            if(g5==valArray[4]) {
	            	res=res+1;
	            }
	            
	            else {
	            	
	            }
	            
	            result6.setText("Amount of matches: "+res);
	            if (res ==4) {
    	        StarTracker.starTrak.addStars(4);
	            }
	            if (res ==5) {
    	        StarTracker.starTrak.addStars(5);
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
    
    public static void main(String[] args) {
        launch(args);
    }

    public Tab tabGet() {
    	return tab1;
    }
	
}
