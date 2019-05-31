import javafx.application.Application;
import javafx.scene.Scene; 
import javafx.scene.layout.Pane;
import javafx.stage.Stage; 
import java.net.URL;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;
import javafx.geometry.Insets;
 import javafx.scene.layout.VBox;
/*
linear and quadratic regression model visualization with extrapolation in java
UML.png

part 1 of larger quantitative  financial modelling program
*/
//components>panel>stage>scene>show
//driver must extend application
public class Driver extends Application{
	public static void main(String[] args){ 
		launch(args); 
	}
	
	public void start(Stage stage) throws Exception{
		ControlPanel controlPanel = new ControlPanel();
		VBox panel = new VBox();
		panel.getChildren().addAll(controlPanel);
		Scene scene = new Scene(panel);
		stage.setScene(scene);
		stage.show();
	}

}



