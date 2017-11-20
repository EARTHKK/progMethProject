package tst;

import creeps.Creeps;
import drawer.Drawer;
import holder.Holder;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ONE extends Application {
	public static final int SIZE = 800; 
	@Override
	public void start(Stage primaryStage)  {
		
		Drawer screen = new Drawer(SIZE,SIZE);

		Scene scene = new Scene(new Pane(screen));
		

		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}


}
