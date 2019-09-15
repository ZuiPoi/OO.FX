package view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * @author Joshua Desmond
 *
 */
public class Tab1 extends Application{


	@Override
	public void start(Stage myStage) {

        StudentTab t1 = new StudentTab();
        TeacherTab t2 = new TeacherTab();
        ClassGroupTab t3 = new ClassGroupTab();
        t1.start(myStage);
        t2.start(myStage);
        t3.start(myStage);
        TabPane tabPane = new TabPane();
		tabPane.getTabs().addAll(t1.tabGet(), t2.tabGet(), t3.tabGet());
		
  
        myStage.setTitle("Things");
        Scene scene = new Scene(tabPane, 1000, 900, Color.BLUE);     
        myStage.setScene(scene);
        

	}
	
	
	
    /**
     * Launches the MAIN of the System
     * @param args
     */
    public static void main(String[] args) {
        Application.launch(args);
       
    }
}
