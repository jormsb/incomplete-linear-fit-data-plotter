import javafx.collections.FXCollections;
import java.util.Random;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Orientation;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent; 	
import java.util.ArrayList;
import javafx.scene.shape.Circle;

public class PlotHandler extends Pane{
   private Line line1;
   private Line line2;
   private Line line3;
   private ArrayList<String> plotList;
   
   public PlotHandler(ArrayList<String> plotList) {
	   this.plotList = plotList;
	   for(int i = 0; i < plotList.size(); i++){
		   System.out.println(plotList.get(i));
	   }
		graph();
   }
   
	private void graph () {
			int originX = 100;
			int originY = 400;
			int x = 300;
			int y = -300;
			int z = 0;
			
			//x vector
			line1 = new Line();
			line1.setStartX(originX); line1.setStartY(originY);
			line1.setEndX(x+originX); line1.setEndY(originY);
			getChildren().add(line1);
			
			//y vector
			line2 = new Line();
			line2.setStartX(originX); line2.setStartY(originY);
			line2.setEndX(originX); line2.setEndY(y+originY);
			getChildren().add(line2);
			
			//plot points
			 for(int i = 0; i < plotList.size() - 1; i++){
				 try{
				Circle circle = new Circle(originX+Double.parseDouble(plotList.get(i)), originY+-1*Double.parseDouble(plotList.get(i+1)), 5);
				getChildren().add(circle);
				 }
				 catch(Exception e){}
				
			}
	}
	private void linearFit(){
		
		
	}
	private void quadFit(){
		
		
	}
}
/*
	private class ButtonHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event){}
	}
*/

