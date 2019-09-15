package view;

import controller.StudController;
import controller.TeachController;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TeacherTab extends Application{
    private Tab tab1;

	
	public void start(Stage myStage) {
        myStage.setTitle("Teachers");
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(layout, 600, 600, Color.BLUE);


             
   //	tabs
        tab1 = new Tab();
        tab1.setText("Teachers");
        tab1.setContent(layout);
        
        layout.add(new Label("First Name:"), 1, 2);
        layout.add(new Label("Middle Name:"), 1, 3);
        layout.add(new Label("Surname:"), 1, 4);
        layout.add(new Label("Email Address:"), 1, 5);
        layout.add(new Label("Phone number:"), 1, 6);
        layout.add(new Label("Degree:"), 1, 7);
        
        TextField fNameInput = new TextField();
        layout.add(fNameInput, 2, 2);
        TextField midNameInput2 = new TextField();
        layout.add(midNameInput2, 2, 3);
        TextField surNameInput3 = new TextField();
        layout.add(surNameInput3, 2, 4);
        TextField emailInput4 = new TextField();
        layout.add(emailInput4, 2, 5);
        TextField phoneNoInput5 = new TextField();
        layout.add(phoneNoInput5, 2, 6);
        TextField degreeInput6 = new TextField();
        layout.add(degreeInput6, 2, 7);
             
        
        Button buttonA = new Button("Add Teacher");
        layout.add(buttonA, 1, 9);
        GridPane.setHalignment(buttonA, HPos.LEFT);
        
        Button buttonB = new Button("Delete Teacher");
        layout.add(buttonB, 2, 9);
        GridPane.setHalignment(buttonB, HPos.LEFT);
        
        Button buttonC = new Button("List Teacher");
        layout.add(buttonC, 3, 9);
        GridPane.setHalignment(buttonC, HPos.LEFT);
        
        buttonA.setOnAction(e -> {
            try {
                String g1 = fNameInput.getText();
     	        String g2 = midNameInput2.getText();
     	        String g3 = surNameInput3.getText();
     	        String g4 = emailInput4.getText();
     	        String g5 = phoneNoInput5.getText();  
     	        String g6 = degreeInput6.getText();
     	        
     	        TeachController.getTeach( g1,g2,g3,g4,g5,g6);
     	        
			 }catch(Exception f) {
				Alert alert1 = new Alert(AlertType.WARNING);
				alert1.setTitle("Error");
				alert1.setHeaderText("Incorrect Value entered");
				alert1.setContentText("Happy little tree!");
				alert1.showAndWait();
       	}
		});
        
        buttonB.setOnAction(e -> {
            try {
    	        String g1 = emailInput4.getText();
    	        
    	        TeachController.delTeach(g1);
            	
            }catch(Exception f) {
				Alert alert1 = new Alert(AlertType.WARNING);
				alert1.setTitle("Error");
				alert1.setHeaderText("Incorrect Value entered");
				alert1.setContentText("Happy little tree!");
				alert1.showAndWait();
        	}
		});
        
        buttonC.setOnAction(e -> {
            try {
            	TeachController.showTeach();
            }catch(Exception f) {
				Alert alert1 = new Alert(AlertType.WARNING);
				alert1.setTitle("Error");
				alert1.setHeaderText("Incorrect Value entered");
				alert1.setContentText("Happy little tree!");
				alert1.showAndWait();
        	}
		});
        //Launch of stage
        myStage.setScene(myScene);	
        myStage.show();
	}
	
	
    public Tab tabGet() {
    	return tab1;
    }
}

