package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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

import javax.swing.text.Position;

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

public class Gui extends Application 
{
	//This string is changed by selecting different buttons
	String userInput = "No string defined yet";
	//this is the text that goes into the label for the top section
	String labelText1 = "Top section part 1";
	//used to limit the amount of decimal points a number displays 
	DecimalFormat df = new DecimalFormat("#.##");
	
	//colors used for background colors of panels
	String style0 = "-fx-background-color: rgba(108, 162, 153, 1);";
	String style1 = "-fx-background-color: rgba(67, 135, 123, 1);";
	String style2 = "-fx-background-color: rgba(36, 108, 96, 1);";
	String style3 = "-fx-background-color: rgba(118, 137, 169, 1);";
	//button colors red green
	String style4 = "-fx-background-color: rgba(200, 50, 90, 1);";
	String style5 = "-fx-background-color: rgba(50, 200, 90, 1);";
	
	//String used to set border for all panels
	Border setPanelBorders = new Border(new BorderStroke(Color.BLACK,
			  BorderStrokeStyle.SOLID,CornerRadii.EMPTY,
			 	BorderWidths.DEFAULT));
	
	//interactivity
	//button gets a drop shadow when the mouse goes over it
	void btnDropShadow (Button btn)
	{
		
		DropShadow shadow = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		btn.addEventHandler(MouseEvent.MOUSE_ENTERED, 
		    new EventHandler<MouseEvent>() 
		{
		        @Override public void handle(MouseEvent e) 
		        {
		        	btn.setStyle(style1);
		            btn.setEffect(shadow);
		        }
		});
		//Removing the shadow when the mouse cursor is off
		btn.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    new EventHandler<MouseEvent>() 
		{
		        @Override public void handle(MouseEvent e) 
		        {
		        	btn.setStyle(style0);
		            btn.setEffect(null);
		            
		        }
		});
	}
	void btnChangeColorOnClick (Button btn)
	{
		
		DropShadow shadow = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		btn.addEventHandler( MouseEvent.MOUSE_RELEASED, 
		    new EventHandler<MouseEvent>() 
		{
		        @Override public void handle(MouseEvent e) 
		        {
		        	
		            btn.setStyle(style5);
		        }
		});
	}
	Line drawLine(double startX,double startY,double endX, double endY)
	{
	   Line line = new Line();
	   line.setStartX(startX);
	   line.setStartY(startY);
	   line.setEndX(endX);
	   line.setEndY(endY);
	   
	   return line;
	   
	}
	Button drawButton(double setScaleX,double setScaleY,String title)
	{
		Button btn = new Button(title);
		btn.setScaleX(setScaleX);
		btn.setScaleY(setScaleY);
		
		return btn;
	}
	Label drawLabel (String title)
	{
		Label lbl = new Label(title);
		return lbl;
	}
	
	GridPane drawTopPanel()
	{
		GridPane gp = new GridPane();
		gp.setMinSize(50, 50);
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		
		Label lbl 	= drawLabel( labelText1);
		Button btn1 = drawButton( 1, 1,"Show stored string ");
		Button btn2 = drawButton( 1., 1.,"Click to change label ");
		
		btn1.setOnAction(new EventHandler<ActionEvent>() 
		  {
			@Override
			public void handle(ActionEvent event) 
			{
				System.out.println(userInput);

			}
		  });
		btn2.setOnAction(new EventHandler<ActionEvent>() 
		  {
			@Override
			public void handle(ActionEvent event) 
			{
				lbl.setText("Top section text has changed ");	
			}
		  });
		
		//add all the nodes together in the  gridPane
		gp.add(lbl, 0, 0);
		gp.add(btn1, 1, 0);
		gp.add(btn2, 0, 1);
		gp.setBorder(setPanelBorders);
		gp.setStyle(style0);
		
		return gp;	
	}
	
	GridPane drawBottomPanel()
	{
		GridPane gp = new GridPane();
		gp.setMinSize(50, 50);
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		
		Label lbl 	= drawLabel( "Bottom section");
		Button btn1 = drawButton( 1, 1,"button 3" );
		Button btn2 = drawButton( 1., 1.,"button 4");
		
		//add all the nodes together in the  gridPane
		gp.add(lbl, 0, 0);
//		gp.add(btn1, 1, 0);
//		gp.add(btn2, 0, 1);
		gp.setBorder(setPanelBorders);
		gp.setStyle(style0);
		
		return gp;	
	}
	
	GridPane drawLeftPanel()
	{
		GridPane gp = new GridPane();
		gp.setMinSize(50, 50);
		gp.setAlignment(Pos.TOP_LEFT);
		gp.setHgap(10);
		gp.setVgap(10);
		
		Label lbl 	= drawLabel( "Left section");
		Button btn1 = drawButton( 1, 1,"button 5" );
		Button btn2 = drawButton( 1., 1.,"button 6");
		
		
		//add all the nodes together in the  gridPane
		gp.add(lbl, 0, 0);
		gp.add(btn1, 0, 1);
		gp.add(btn2, 1, 1);
		gp.setBorder(setPanelBorders);
		gp.setStyle(style2);
		
		return gp;	
	}
	
	GridPane drawRightPanel()
	{
		
		GridPane gp = new GridPane();
		gp.setMinSize(50, 50);
		gp.setAlignment(Pos.TOP_LEFT);
		gp.setHgap(10);
		gp.setVgap(10);
		
		Label lbl 	= drawLabel( "Right section");
		Button btn1 = drawButton( 1, 1,"button 7" );
		Button btn2 = drawButton( 1., 1.,"button 8");

		//add all the nodes together in the  gridPane
		gp.add(lbl, 0, 0);
		gp.add(btn1, 0, 1);
		gp.add(btn2, 1, 1);
		gp.setBorder(setPanelBorders);
		gp.setStyle(style2);
		
		return gp;	
	}
	GridPane drawCenterPanel()
	{
		
		GridPane gp = new GridPane();
		gp.setMinSize(50, 50);
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		
		//center
		Label lbl1Center = new Label("Input text here");
		Label lbl2Center = new Label("Slider value");
		TextField txtFieldCenter = new TextField ();
		Button btn1Center = new Gui().drawButton(1,1,"Get user text");
		Slider slider1Center = new Slider(0,1,0.5);
		slider1Center.setShowTickLabels(true);
		slider1Center.setShowTickLabels(true);
		slider1Center.setMajorTickUnit(0.25f);
		slider1Center.setBlockIncrement(0.1f);
		//add all the nodes together in the  gridPane
		gp.add(lbl1Center, 0, 0);
		gp.add(txtFieldCenter, 0, 1);
		gp.add(btn1Center, 1, 1);
		gp.add(slider1Center, 0, 2);
		gp.add(lbl2Center, 0, 3);
		gp.setBorder(new Border(new BorderStroke(Color.BLACK,
				  BorderStrokeStyle.SOLID,CornerRadii.EMPTY,
				 	BorderWidths.DEFAULT)));
		gp.setStyle(style3);
		//listener for slider object
		  slider1Center.valueProperty().addListener(new ChangeListener<Number>() 
		  {
			@Override
			public void changed(ObservableValue<? extends Number> observable, 
					Number oldValue, Number newValue) 
			{
				// TODO Auto-generated method stub
				//uses df.format to limit the amount of decimal places
				String sliderValue = df.format(slider1Center.getValue()); 
				lbl2Center.setText("Slider value is " + sliderValue);
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
		return gp;	
	}
	FlowPane testPane()
	{
		//this is just a test to use flowPane object
		//generate 30 buttons and see them wrap around the border
		
		FlowPane fp = new FlowPane();
		
		//image code not working yet
//		ImageView backgroundImage = new ImageView("TestPictureForHtml.jpg");
//		double setScaleImage = 0.5;
//		backgroundImage.fitWidthProperty().bind(fp.widthProperty());
//		backgroundImage.setPreserveRatio(false);
//		fp.getChildren().add(backgroundImage);
		
		fp.setMinSize(200, 50);
		fp.setVgap(10);
		fp.setHgap(10);
		fp.setPrefWrapLength(100);
		
		//fp.getChildren().add(arg0);
		for (int i = 0; i < 10; i++)
		{
			Button btn = new Button("button " + i);
			btn.setMinSize(50, 25);
			btn.setMaxSize(70, 50);
			fp.getChildren().add(btn );
			btnDropShadow(btn);
			btnChangeColorOnClick(btn);
		}
		//System.out.println("width is " +fp.getWidth() );
		return fp;
	}
	
	//needed for entire class exception handler
	   @Override     
	   public void start(Stage primaryStage) throws Exception 
	   {   
		   System.out.println("Error was found in Gui.java");
	   }
	   
	  
} 