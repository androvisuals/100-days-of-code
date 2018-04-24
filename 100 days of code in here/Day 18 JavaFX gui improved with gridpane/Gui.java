package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Gui extends Application 
{
	Line drawLine(double startX,double startY,double endX, double endY)
	   {
		   Line line = new Line();
		   line.setStartX(startX);
		   line.setStartY(startY);
		   line.setEndX(endX);
		   line.setEndY(endY);
		   
		   return line;
		   
	   }
	Button drawButton(/*double setX,double setY,*/double setScaleX,double setScaleY,String title)
	{
		Button btn = new Button(title);
//		btn.setLayoutX(setX);
//		btn.setLayoutY(setY);
		btn.setScaleX(setScaleX);
		btn.setScaleY(setScaleY);
		
		return btn;
	}
	Label drawLabel (/*double setX,double setY,*/String title)
	{
		Label lbl = new Label(title);
//		lbl.setLayoutX(setX);
//		lbl.setLayoutX(setY);
		return lbl;
	}
	   @Override     
	   public void start(Stage primaryStage) throws Exception 
	   {   
		   
//		   //Creating a group
//		   Group root = new Group(line);
//		   
//		   //Create a scene
//		   Scene scene = new Scene(root,600,300);
		   
	   }    
} 