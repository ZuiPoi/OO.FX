package oop10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import oop30.LottoRand;
import oop40.StarTracker;
import oop50.HashInput;
import oop50.LenFile;
import javafx.scene.control.TextField;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class PrizeSelection extends Application {
    private Tab tab1;


@Override
public void start(Stage Stage1) throws Exception {

	//basic layout
    Stage1.setTitle("PrizeField");
    GridPane layout = new GridPane();
    layout.setAlignment(Pos.CENTER);
    Scene myScene = new Scene(layout, 600, 600, Color.BLUE);
    layout.add(new Label("Prizes!"), 1, 0);
    layout.add(new Label("Your Stars:"), 2, 0);
    
    	//star display
    TextField starfield = new TextField();
    starfield.setEditable(false);
    layout.add(starfield, 3, 0);

	   //	tabs

    tab1 = new Tab();
    tab1.setText("Prize Selection");
    tab1.setContent(layout);
    
    //adding buttons
    
   
	Button but1 = new Button("Apple");
	but1.setOnAction(e -> {
	Alert alert1 = new Alert(AlertType.WARNING);
	alert1.setTitle("You Won!");
	alert1.setHeaderText("Congratulations you won a prize!");
	alert1.setContentText("You won Euro 1000!");
	alert1.showAndWait();
	});

	Button but2 = new Button("Orange");
	but2.setOnAction(e -> {
	Alert alert1 = new Alert(AlertType.WARNING);
	alert1.setTitle("You Won!");
	alert1.setHeaderText("Congratulations you won a prize!");
	alert1.setContentText("You won a Trip to Kerry!");
	alert1.showAndWait();
	});
	
	Button but3 = new Button("Pear");
	but1.setOnAction(e -> {
	Alert alert1 = new Alert(AlertType.WARNING);
	alert1.setTitle("You Won!");
	alert1.setHeaderText("Congratulations you won a prize!");
	alert1.setContentText("You won Euro 500!");
	alert1.showAndWait();
	});
	
	Button but4 = new Button("Banana");
	but1.setOnAction(e -> {
	Alert alert1 = new Alert(AlertType.WARNING);
	alert1.setTitle("You Won!");
	alert1.setHeaderText("Congratulations you won a prize!");
	alert1.setContentText("You won a Trip to the Carribean !");
	alert1.showAndWait();
	});
	
	Button but5 = new Button("Grape");
	but1.setOnAction(e -> {
	Alert alert1 = new Alert(AlertType.WARNING);
	alert1.setTitle("You Won!");
	alert1.setHeaderText("Congratulations you won a prize!");
	alert1.setContentText("You won Euro 10000!");
	alert1.showAndWait();
	});
	
	Button but7 = new Button("Kiwi");
	but1.setOnAction(e -> {
	Alert alert1 = new Alert(AlertType.WARNING);
	alert1.setTitle("You Won!");
	alert1.setHeaderText("Congratulations you won a prize!");
	alert1.setContentText("You won Euro 20000!");
	alert1.showAndWait();
	});
	
	Button but6 = new Button("Strawberry");
	but1.setOnAction(e -> {
	Alert alert1 = new Alert(AlertType.WARNING);
	alert1.setTitle("You Won!");
	alert1.setHeaderText("Congratulations you won a prize!");
	alert1.setContentText("You won a trip to donegal!");
	alert1.showAndWait();
	});
	
    layout.add(but1, 1, 1);
    layout.add(but2, 1, 2);
    layout.add(but3, 1, 3);
    layout.add(but4, 1, 4);
    layout.add(but5, 1, 5);
    layout.add(but6, 1, 6);
    layout.add(but7, 1, 7);


    but1.setVisible(false);
    but2.setVisible(false);
    but3.setVisible(false);
    but4.setVisible(false);
    but5.setVisible(false);
    but6.setVisible(false);
    but7.setVisible(false);
    
	Button but10 = new Button("View Prizes and stars");

	but10.setOnAction(e -> {
		// show current stars
		Integer iVal2 = Integer.valueOf(StarTracker.getStars());
		starfield.setText(iVal2.toString() ); 
		
    if (StarTracker.starTrak.getStars()== 2) {
        but2.setVisible(true);
        but3.setVisible(true);
    }
    
    if (StarTracker.starTrak.getStars()== 4) {
    but1.setVisible(true);
    but2.setVisible(true);
    but3.setVisible(true);
    but4.setVisible(true);
    but6.setVisible(true);
    }
    else if(StarTracker.starTrak.getStars()>5) {
    but1.setVisible(true);
    but2.setVisible(true);
    but3.setVisible(true);
    but4.setVisible(true);
    but6.setVisible(true);
    but7.setVisible(true);
    }
    else {
    	
    }
	});
    layout.add(but10, 0, 1);


    Stage1.setScene(myScene);
	
    Stage1.show();
	
}







private boolean sizeof(String[] buttonAmt) {
	// TODO Auto-generated method stub
	return false;
}




public static void main(String[] args) {
    launch(args);
}


public Tab tabGet() {
	return tab1;
}
}

