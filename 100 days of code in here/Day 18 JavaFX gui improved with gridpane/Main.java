package application;
	
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.GridPane;

import java.util.ResourceBundle.Control;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.FileChooser;
import javafx.stage.Stage;  
import javafx.event.*;
import javafx.geometry.Pos;

public class Main extends Application 
{ 
	//This string is changed by selecting different buttons
	String userInput = "No string defined yet";
	//this is the text that goes into the label for the top section
	String topSectionText = "Top section part 1";
   @Override     
   public void start(Stage primaryStage) throws Exception 
   {  
	 
	 
	  GridPane top = new GridPane();
	  top.setMinSize(50, 50);
	  top.setAlignment(Pos.CENTER);
	  top.setHgap(10);
	  top.setVgap(10);
	  
	  //HBox bottom = new HBox(); 
	  GridPane bottom = new GridPane();
	  bottom.setMinSize(50, 50);
	  bottom.setAlignment(Pos.CENTER);
	  bottom.setHgap(10);
	  bottom.setVgap(10);
	
	  GridPane left = new GridPane();
	  left.setMinSize(50, 50);
	  left.setAlignment(Pos.TOP_LEFT);
	  left.setHgap(10);
	  left.setVgap(10);
	  

	  GridPane right = new GridPane();
	  right.setMinSize(50, 50);
	  right.setAlignment(Pos.TOP_RIGHT);
	  right.setHgap(10);
	  right.setVgap(10);
	  

	  GridPane center = new GridPane();
	  center.setMinSize(50, 50);
	  center.setAlignment(Pos.CENTER);
	  center.setHgap(10);
	  center.setVgap(10);
	  


	  //custom methods for adding Gui elements//hbox
	  //top box
	  Label lbl1Top = new Gui().drawLabel( topSectionText);
	  Button btn1Top = new Gui().drawButton( 1, 1,"Show stored string ");
	  Button btn2Top = new Gui().drawButton( 1., 1.,"Click to change label ");
	  
	  btn1Top.setOnAction(new EventHandler<ActionEvent>() 
	  {
		@Override
		public void handle(ActionEvent event) 
		{
			System.out.println(userInput);
			
		}
	  });
	  btn2Top.setOnAction(new EventHandler<ActionEvent>() 
	  {
		@Override
		public void handle(ActionEvent event) 
		{
			lbl1Top.setText("Top section text has changed ");	
		}
	  });
	  
	  //bottom box
	  Label lbl1Bottom = new Gui().drawLabel( "Bottom section");
	  Button btn1Bottom = new Gui().drawButton( 1, 1,"button 3 ");
	  Button btn2Bottom = new Gui().drawButton( 1., 1.,"button 4 ");
	  
	  //left box
	  Label lbl1Left = new Gui().drawLabel( "Left section");
	  Button btn1Left = new Gui().drawButton( 1, 1,"button 5 ");
	  Button btn2Left = new Gui().drawButton( 1., 1.,"button 6 ");
	  
	  //right box
	  Label lbl1Right = new Gui().drawLabel( "right section");
	  Button btn1Right= new Gui().drawButton( 1, 1,"button 7 ");
	  Button btn2Right = new Gui().drawButton( 1., 1.,"button 8 ");
	  
	  //center
	  Label lbl1Center = new Label("Input text here");
	  Label lbl2Center = new Label("Slider value");
	  //allows user to type into a field
	  TextField txtFieldCenter = new TextField ();
	  Button btn1Center = new Gui().drawButton(1,1,"Get user text");
	  Slider slider1Center = new Slider(0,1,0.5);
	  slider1Center.setShowTickLabels(true);
	  slider1Center.setShowTickLabels(true);
	  slider1Center.setMajorTickUnit(0.25f);
	  slider1Center.setBlockIncrement(0.1f);
	  //listener for slider object
	  slider1Center.valueProperty().addListener(new ChangeListener<Number>() 
	  {
		@Override
		public void changed(ObservableValue<? extends Number> observable, 
				Number oldValue, Number newValue) 
		{
			// TODO Auto-generated method stub
			double sliderValue = slider1Center.getValue(); 
			lbl2Center.setText("Slider value is " + Double.toString(sliderValue));
		}
	  });

	  
	  //if user presses this button then the text from the 
	  //text field object gets printed to the console
	  btn1Center.setOnAction(new EventHandler<ActionEvent>() 
	  {
		@Override
		public void handle(ActionEvent event) 
		{
			String userInput = "";
			userInput = txtFieldCenter.getText();
			System.out.println(userInput);
		}
	  });
	  
	
	  //add all the elements together per part of bPane
	  //top.getChildren().addAll(lbl1Top,btn1Top,btn2Top);
	  top.add(lbl1Top, 0, 0);
	  top.add(btn1Top, 1, 0);
	  top.add(btn2Top, 0, 1);
	  
	  //bottom.getChildren().addAll(lbl1Bottom,btn1Bottom,btn2Bottom);
	  bottom.add(lbl1Bottom, 0, 0);
	 
	  //left.getChildren().addAll(lbl1Left,btn1Left,btn2Left);
	  left.add(lbl1Left, 0, 0);
	  left.add(btn1Left, 0, 1);
	  left.add(btn2Left, 1, 1);
	  
	  //right.getChildren().addAll(lbl1Right,btn1Right,btn2Right);
	  right.add(lbl1Right, 0, 0);
	  right.add(btn1Right, 0, 1);
	  right.add(btn2Right, 1, 1);
	  
	  //center.getChildren().addAll(lbl1Center,txtFieldCenter,btn1Center,slider1Center);
	  center.add(lbl1Center, 0, 0);
	  center.add(txtFieldCenter, 0, 1);
	  center.add(btn1Center, 1, 1);
	  center.add(slider1Center, 0, 2);
	  center.add(lbl2Center, 0, 3);
	  
	  BorderPane bPane = new BorderPane();
	  bPane.setBottom(bottom);
	  bPane.setTop(top);
	  bPane.setLeft(left);
	  bPane.setRight(right);
	  bPane.setCenter(center);
	  
	  
      //Creating a Scene by passing the group object, height and width   
      Scene scene = new Scene(bPane ,600, 300); 
      
      
      //setting color to the scene 
      scene.setFill(Color.rgb(170, 150, 200));  
    
      
      
      //Setting the title to Stage. 
      primaryStage.setTitle("Sample Layout Application"); 
      primaryStage.setMinWidth(600);
      primaryStage.setMinHeight(300);
   
      //Adding the scene to Stage 
      primaryStage.setScene(scene); 
       
      //Displaying the contents of the stage 
      primaryStage.show(); 
   }    
   public static void main(String args[])
   {          
      launch(args);     
   }         
} 