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
import javafx.stage.WindowEvent;
import javafx.event.*;
import javafx.geometry.Pos;

import java.util.prefs.*;

public class Main extends Application 
{ 

		
   @Override     
   public void start(Stage primaryStage) throws Exception 
   { 
	  SaveGuiPrefs saveGui = new SaveGuiPrefs("nodeTestMain");
	   
	  BorderPane bPane = new BorderPane();
	  
	  GridPane top = new Gui().drawTopPanel();
	  bPane.setTop(top);
	 
	  
	  GridPane bottom = new Gui().drawBottomPanel();
	  bPane.setBottom(bottom);
	  
	  FlowPane left = new Gui().testPane();
	  bPane.setLeft(left);
	  GridPane right = new Gui().drawRightPanel();
	  bPane.setRight(right);
	  
	  GridPane center = new Gui().drawCenterPanel();
	  bPane.setCenter(center);
	  
	  HBox topHbox = new Gui().topHbox();
	  
	 
	  
	 
	  
	  
	 
	  
	  //bPane.getChildren().add(new ImageView(backgroundImage));
	  
	 
	  
		
	  
	  //Creating a Scene by passing the group object, height and width   
      Scene scene = new Scene(bPane ,600, 300); 
      //Scene scene = new Scene(topHbox ,600, 300); 
      
      
      //setting color to the scene 
      scene.setFill(Color.rgb(170, 150, 200));  
      
      //Setting the title to Stage. 
      primaryStage.setTitle("Sample Layout Application"); 
      primaryStage.setMinWidth(500);
      primaryStage.setMinHeight(320);
      primaryStage.setWidth(Double.parseDouble(saveGui.getValue("0")));
      primaryStage.setHeight(Double.parseDouble(saveGui.getValue("1")));
     
      
      
      //Adding the scene to Stage 
      primaryStage.setScene(scene); 
      
    //runs when width is changed to store it to preferences
      scene.widthProperty().addListener(new ChangeListener<Number>() {
    	    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
    	        System.out.println("Width: " + newSceneWidth);
    	    }
    	});
      //runs when height is changed to store it to preferences
      scene.heightProperty().addListener(new ChangeListener<Number>() {
    	    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
    	        System.out.println("Height: " + newSceneHeight);
    	    }
    	});
      //this code runs when the window is closed
      primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
          public void handle(WindowEvent we) {
        	  saveGui.setValue("0", primaryStage.getWidth());
        	  saveGui.setValue("1", primaryStage.getHeight());
              
        	  System.out.println("Window is closing");
          }
      });  
      
      //Displaying the contents of the stage 
      primaryStage.show(); 
   }    
   public static void main(String args[])
   {          
      launch(args);     
   }         
} 