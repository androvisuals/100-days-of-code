package application;
	
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;  
import javafx.event.*;
import javafx.geometry.Pos;

public class Main extends Application 
{ 
   @Override     
   public void start(Stage primaryStage) throws Exception 
   {  
	  
	 //creating a Group object
	  HBox top = new HBox(); 
	  top.setAlignment(Pos.CENTER);
	  top.setSpacing(10);
	 
	  HBox bottom = new HBox(); 
	  bottom.setAlignment(Pos.CENTER);
	  bottom.setSpacing(10);
	 
	  VBox left = new VBox();
	  left.setSpacing(10);
	  
	  VBox right = new VBox();
	  right.setSpacing(10);

	  //custom methods for adding Gui elements//hbox
	  
	  //top box
	  Label lbl1Top = new Gui().drawLabel( "Top section");
	  Button btn1Top = new Gui().drawButton( 1, 1,"button 1 ");
	  Button btn2Top = new Gui().drawButton( 1., 1.,"button 2 ");
	  
	  btn1Top.setOnAction(new EventHandler<ActionEvent>() 
	  {
		@Override
		public void handle(ActionEvent event) 
		{
			System.out.println("Button 1 has been pressed !");
			
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
	  
	  //add all the elements together per part of bPane
	  bottom.getChildren().addAll(lbl1Bottom,btn1Bottom,btn2Bottom);
	  top.getChildren().addAll(lbl1Top,btn1Top,btn2Top);
	  left.getChildren().addAll(lbl1Left,btn1Left,btn2Left);
	  right.getChildren().addAll(lbl1Right,btn1Right,btn2Right);
	  
	  
	  
	  BorderPane bPane = new BorderPane();
	  bPane.setBottom(bottom);
	  bPane.setTop(top);
	  bPane.setLeft(left);
	  bPane.setRight(right);
	  
	  
      
      //Creating a Scene by passing the group object, height and width   
      Scene scene = new Scene(bPane ,600, 300); 
      
      //setting color to the scene 
      scene.setFill(Color.rgb(170, 150, 200));  
    
      
      
      //Setting the title to Stage. 
      primaryStage.setTitle("Sample Layout Application"); 
      
   
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
