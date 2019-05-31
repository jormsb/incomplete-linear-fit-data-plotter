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
import java.util.ArrayList;
public class ControlPanel extends VBox{
	private int pointsCout;
	private ArrayList<String> plotList; 
	private String datapath;
	private Label label;
	private Label mutableLabel;
	private TextField field;
	private TextField fieldX;
	private TextField fieldY;
	private Button button;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private RadioButton r1;
	private RadioButton r2;
	private ToggleGroup toggle;
	private DisplayPanel displayPanel;
	private String userIn;
	public ControlPanel(){
		plotList = new ArrayList<String>();
		pointsCout = 0;
		datapath = "C:/Users/b/desktop";
		label = new Label("Importing from " + datapath);
		mutableLabel = new Label("x,y");
		field = new TextField("X");
		fieldX = new TextField("0");
		fieldY = new TextField("0");
		button = new Button("Import Data");
		button2 = new Button("Change datapath location");
		button3= new Button("Enter data points manually");
		button4= new Button("Restart");
		button5= new Button("Plot");
		button6= new Button("Add another point");
		r1 = new RadioButton("linear fit");
		r2 = new RadioButton("quadratic fit");
		toggle = new ToggleGroup();
		r1.setToggleGroup(toggle);
		r2.setToggleGroup(toggle);
		displayPanel = new DisplayPanel();
		setMinSize(500,500);
		//getChildren().addAll(label,field,button,button2,button3,r1,r2);
		getChildren().addAll(button3,r1,r2);
		setPadding(new Insets(10, 20, 10, 20));
		//import data
		button.setOnAction(new EventHandler<ActionEvent>( ){public void handle(ActionEvent event){
			getChildren().removeAll(label,field,button,button2,button3,r1,r2);
			getChildren().addAll(displayPanel,button4);
		}});
		//change dtapath
		button2.setOnAction(new EventHandler<ActionEvent>( ){ public void handle(ActionEvent event){
			datapath = field.getText();
			label.setText("Importing from " + datapath);			
		}});
		//enter data manually
		button3.setOnAction(new EventHandler<ActionEvent>( ){ public void handle(ActionEvent event){
			pointsCout= 1;
			getChildren().removeAll(label,field,button,button2,button3,r1,r2);
			getChildren().addAll(button5,button6,button4,mutableLabel,fieldX,fieldY);
		}});
		//plot
		button5.setOnAction(new EventHandler<ActionEvent>( ){ public void handle(ActionEvent event){
			pointsCout++;

			plotList.add(fieldX.getText());
			plotList.add(fieldY.getText());
			getChildren().clear();
			PlotHandler plot = new PlotHandler(plotList);
			getChildren().addAll(plot,button4);
		}});
		//add another point
		button6.setOnAction(new EventHandler<ActionEvent>( ){ public void handle(ActionEvent event){
			pointsCout++;
			plotList.add(fieldX.getText());
			plotList.add(fieldY.getText());
			fieldX = new TextField("");
			fieldY = new TextField("");
			mutableLabel = new Label("x,y");

			getChildren().addAll(mutableLabel,fieldX,fieldY);
		}});
		//restart
		button4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				getChildren().clear();
				plotList = new ArrayList<String>();
				fieldX = new TextField("");
				fieldY = new TextField("");
				getChildren().addAll(button3,r1,r2);
			}});
			

	}
	//non constructor based handler
	//button x , button.setOnAction(new ButtonHandler());
	private class ButtonHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent eve){
			try{}
			catch(Exception e){}
			}
	}
}

		
		

		

		

		
		

		

		