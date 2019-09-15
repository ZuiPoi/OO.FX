package view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author Joshua Desmond
 *
 */
public class ClassGroupTab extends Application {
    private Tab tab1;

	
	public void start(Stage myStage) {
        myStage.setTitle("Class Groups");
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(layout, 600, 600, Color.BLUE);
        layout.add(new Label("NULL!"), 1, 0);

             
   //	tabs
        tab1 = new Tab();
        tab1.setText("Class Groups");
        tab1.setContent(layout);
        
             
        
        //Launch of stage
        myStage.setScene(myScene);	
        myStage.show();
	}
	
	
    /**
     * returns the tab
     * @return
     */
    public Tab tabGet() {
    	return tab1;
    }
}

