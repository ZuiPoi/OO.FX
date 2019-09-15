package view;

import controller.StudController;
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

/**
 * @author Joshua Desmond
 *
 */

public class StudentTab extends Application{
    private Tab tab1;

	
	public void start(Stage myStage) {
        myStage.setTitle("Students");
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(layout, 600, 600, Color.BLUE);
        layout.add(new Label("Student Info"), 1, 0);
        layout.add(new Label("Module Info"),3, 0);
             
   //	tabs
        tab1 = new Tab();
        tab1.setText("Students");
        tab1.setContent(layout);
        
        layout.add(new Label("First Name:"), 1, 2);
        layout.add(new Label("Middle Name:"), 1, 3);
        layout.add(new Label("Surname:"), 1, 4);
        layout.add(new Label("Email Address:"), 1, 5);
        layout.add(new Label("Phone number:"), 1, 6);
        layout.add(new Label("Date Of Birth:"), 1, 7);
        layout.add(new Label("Class Group:"), 1, 8);
        
        layout.add(new Label("Module 1 Name:"), 3, 2);
        layout.add(new Label("Module 2 Name:"), 3, 3);
        layout.add(new Label("Module 3 Name:"), 3, 4);
        layout.add(new Label("Module 4 Name:"), 3, 5);
        layout.add(new Label("Module 5 Name:"), 3, 6);
        layout.add(new Label("Module 6 Name:"), 3, 7);
        
        layout.add(new Label("Module 1 Grade:"), 5, 2);
        layout.add(new Label("Module 2 Grade:"), 5, 3);
        layout.add(new Label("Module 3 Grade:"), 5, 4);
        layout.add(new Label("Module 4 Grade:"), 5, 5);
        layout.add(new Label("Module 5 Grade:"), 5, 6);
        layout.add(new Label("Module 6 Grade:"), 5, 7);
        // inputs
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
        TextField DOBInput6 = new TextField();
        layout.add(DOBInput6, 2, 7); 
        TextField classgroup7 = new TextField();
        layout.add(classgroup7, 2, 8); 
        
        TextField modInput = new TextField();
        layout.add(modInput, 4, 2);
        TextField mod2Input2 = new TextField();
        layout.add(mod2Input2, 4, 3);
        TextField mod3Input3 = new TextField();
        layout.add(mod3Input3, 4, 4);
        TextField mod4Input4 = new TextField();
        layout.add(mod4Input4, 4, 5);
        TextField mod5Input5 = new TextField();
        layout.add(mod5Input5, 4, 6);
        TextField mod6Input6 = new TextField();
        layout.add(mod6Input6, 4, 7);  
        
        TextField grade = new TextField();
        layout.add(grade, 6, 2);
        TextField grade2 = new TextField();
        layout.add(grade2, 6, 3);
        TextField grade3 = new TextField();
        layout.add(grade3, 6, 4);
        TextField grade4 = new TextField();
        layout.add(grade4, 6, 5);
        TextField grade5 = new TextField();
        layout.add(grade5, 6, 6);
        TextField grade6 = new TextField();
        layout.add(grade6, 6, 7);  
        
        Button buttonA = new Button("Add Student");
        layout.add(buttonA, 1, 9);
        GridPane.setHalignment(buttonA, HPos.LEFT);
        
        Button buttonB = new Button("Delete Student");
        layout.add(buttonB, 2, 9);
        GridPane.setHalignment(buttonB, HPos.LEFT);
        
        Button buttonC = new Button("List Student");
        layout.add(buttonC, 3, 9);
        GridPane.setHalignment(buttonC, HPos.LEFT);
        
        buttonA.setOnAction(e -> {
       try {
            String g1 = fNameInput.getText();
	        String g2 = midNameInput2.getText();
	        String g3 = surNameInput3.getText();
	        String g4 = emailInput4.getText();
	        String g5 = phoneNoInput5.getText();  
	        String g6 = DOBInput6.getText();
	        String g7 = classgroup7.getText();
			
            String m1 = modInput.getText();
	        String m2 = mod2Input2.getText();
	        String m3 = mod3Input3.getText();
	        String m4 = mod4Input4.getText();
	        String m5 = mod5Input5.getText(); 
	        String m6 = mod6Input6.getText();
	        
            String n1 = grade.getText();
	        String n2 = grade2.getText();
	        String n3 = grade3.getText();
	        String n4 = grade4.getText();
	        String n5 = grade5.getText(); 
	        String n6 = grade6.getText();
	        
	       // StudController.getmods(m1, m2, m3, m4, m5, m6, n1, n2, n3, n4, n5, n6);
	        StudController.getStud(g1, g2, g3, g4, g5, g6, g7, m1, n1, m2, n2, m3, n3, m4, n4, m5, n5, m6, n6);
			 
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
    	        
    	        StudController.delStud(g1);
            	
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
            	StudController.showStud();
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
	
	
    /**
     * returns student tab
     * @return
     */
    public Tab tabGet() {
    	return tab1;
    }
}
