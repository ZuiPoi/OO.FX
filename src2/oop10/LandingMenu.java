package oop10;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import oop40.StarTracker;

public class LandingMenu extends Application {


	@Override
	public void start(Stage mainStage) throws Exception {
	    StarTracker.starTrak.addStars(0);

        GuessingGame g1 = new GuessingGame();
        LottoGame l1= new LottoGame();
        PrizeSelection p1 = new PrizeSelection();
        l1.start(mainStage);
        g1.start(mainStage);
        p1.start(mainStage);
        TabPane tabPane = new TabPane();
		tabPane.getTabs().addAll(g1.tabGet(), l1.tabGet(), p1.tabGet());
		
        mainStage.setTitle("Games");
        Scene scene = new Scene(tabPane, 1000, 900, Color.BLUE);
        
        mainStage.setScene(scene);
	}
	
    public static void main(String[] args) {
        Application.launch(args);
       
    }
}

