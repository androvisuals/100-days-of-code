package application;
	
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

import java.text.DecimalFormat;
import java.util.ResourceBundle.Control;
import java.util.Set;

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

import java.util.prefs.*;

public class Main extends Application 
{ 

   @Override     
   public void start(Stage primaryStage) throws Exception 
   { 
	   
	  
	  GridPane top = new Gui().drawTopPanel();
	  GridPane bottom = new Gui().drawBottomPanel();
	  //GridPane left = new Gui().drawLeftPanel();
	  FlowPane left = new Gui().testPane();
	  
	  GridPane right = new Gui().drawRightPanel();
	  GridPane center = new Gui().drawCenterPanel();
	  
	  
	  BorderPane bPane = new BorderPane();
	 
	  
	  bPane.setTop(top);
	  
	  bPane.setBottom(bottom);
	  bPane.setLeft(left);
	  bPane.setRight(right);
	  //bPane.getChildren().add(new ImageView(backgroundImage));
	  bPane.setCenter(center);
	 
	  
		
	  
	  //Creating a Scene by passing the group object, height and width   
      Scene scene = new Scene(bPane ,600, 300); 
      
      
      //setting color to the scene 
      scene.setFill(Color.rgb(170, 150, 200));  
      
      //Setting the title to Stage. 
      primaryStage.setTitle("Sample Layout Application"); 
      primaryStage.setMinWidth(640);
      primaryStage.setMinHeight(480);
   
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