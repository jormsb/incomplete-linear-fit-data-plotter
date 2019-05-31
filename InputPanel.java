import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.Scene; 
import javafx.scene.layout.Pane;
import javafx.stage.Stage; 
import javafx.event.ActionEvent;	
import javafx.event.EventHandler;	
import java.io.*;
import java.net.URL;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
 import javafx.geometry.Rectangle2D;
 import javafx.scene.layout.VBox;
 import javafx.scene.layout.BorderPane;
 import javafx.geometry.Insets;
 import javafx.scene.control.TextField;
 import javafx.scene.control.Label;
 import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
public class controlPanel extends VBox{
	
	private String datapath;
	private Label label;
	private TextField field;

	private Button button;
	private Button button2;
	private RadioButton r1;
	private RadioButton r2;
	private ToggleGroup toggle;
	private DisplayPanel displayPanel;
	
	public controlPanel(){
		datapath = "C:/Users/b/desktop";
		label = new Label("Importing from " + datapath);
		field = new TextField("X");
		button = new Button("Import Data");
		button2 = new Button("Change datapath location");
		r1 = new RadioButton("linear fit");
		r2 = new RadioButton("quadratic fit");
		toggle = new ToggleGroup();
		r1.setToggleGroup(toggle);
		r2.setToggleGroup(toggle);
		displayPanel = new DisplayPanel();
		setMinSize(500,500);
		getChildren().addAll(label,field,button,button2,r1,r2);
		
		button.setOnAction(new EventHandler<ActionEvent>( ){public void handle(ActionEvent event){
			getChildren().removeAll(label,field,button,button2,r1,r2);
			Button button3 = new Button("Restart");
			getChildren().addAll(displayPanel,button3);
			
			button3.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					getChildren().removeAll(displayPanel,button3);
					getChildren().addAll(label,field,button,button2,r1,r2);
				}});
		}});

		button2.setOnAction(new EventHandler<ActionEvent>( ){public void handle(ActionEvent event){
			datapath = field.getText();
			label.setText("Importing from " + datapath);			
		}});

		}
}

		
		

		

		

		
		

		

		