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

import java.awt.TextArea;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.ResourceBundle.Control;
import java.util.Timer;
import java.util.prefs.Preferences;

import javax.swing.text.Position;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.FileChooser;
import javafx.stage.Stage;  
import javafx.event.*;
import javafx.geometry.Pos;

import java.util.prefs.*;

public class Gui extends Application 
{
	//instance variables
	SaveGuiPrefs saveGui;// = new SaveGuiPrefs("nodeTest");
	
	DecimalFormat df;
	
	//colors used for background colors of panels
	String style0,style1,style2,style3,style4,style5;
	
	
	Border setPanelBorders;
	
	//game engine variables
	Integer boardSize =20;
	int turnNumber ;

	Integer playerHeight = 19;
	Integer boardHeight = 20;
	Integer textHeight = 25;
	
	GridPane gp ;//= new GridPane();
	
	//main buttons
	Button btnStartGame;
	Button btnEndTurn;
	Button btnDisplayTurnNumber;
	
	Button btnPlayer ;//
	ArrayList<Button> btnBoardPiece = new ArrayList<Button>();
	ArrayList<Label> lblLocation = new ArrayList<Label>();
	
	//debug text area
	GridPane textPaneBottom;
	Label textAreaEncounter;
	Label textAreaDebug;
	Label textAreaDebugTemp;
	
	String debugString;
	
	
	//board number clicked temp for now
	Integer boardNumberClicked;
	public void init()
	{
		//used to store preferences, only screen settings for now.
		saveGui = new SaveGuiPrefs("nodeTest");
		//used to limit amount of decimal places
		df = new DecimalFormat("#.##");
		//colors used for background colors of panels
		style0 = "-fx-background-color: rgba(108, 162, 153, 1);";
		style1 = "-fx-background-color: rgba(67, 135, 123, 1);";
		style2 = "-fx-background-color: rgba(36, 108, 96, 1);";
		style3 = "-fx-background-color: rgba(118, 137, 169, 1);";
		//button colors red green
		style4 = "-fx-background-color: rgba(200, 50, 90, 1);";
		style5 = "-fx-background-color: rgba(50, 200, 90, 1);";
		//Set border for all panels, probably not needed right now.
		setPanelBorders = new Border(new BorderStroke(Color.BLACK,
				  BorderStrokeStyle.SOLID,CornerRadii.EMPTY,
				 	BorderWidths.DEFAULT));
		
		//set screen padding and layout
		gp = new GridPane();
		gp.setMinSize(1280, 720);
		gp.setAlignment(Pos.TOP_LEFT);
		gp.setHgap(5);
		gp.setVgap(20);
		gp.setGridLinesVisible(false);
		
		//main buttons
		btnStartGame = drawButton( 1, 1,"Start game ");
		gp.add(btnStartGame,1 , 1);
		
		btnEndTurn = drawButton( 1., 1.,"End turn ");
		gp.add(btnEndTurn, 2, 1);
		
		btnDisplayTurnNumber = drawButton( 1., 1.,"TURN 0");
		gp.add(btnDisplayTurnNumber, 3, 1);
		
		btnPlayer = new Button("Player");
		btnPlayer.setMinSize(50, 25);
		gp.add(btnPlayer,10,playerHeight);
		
		//fills board with buttons,generates the lot
		for (int i = 0; i<boardSize;i++)
		{
			btnBoardPiece.add(new Button(Integer.toString(i)));
			btnBoardPiece.get(i).setMinSize(50, 25);
			btnBoardPiece.get(i).setMaxSize(70, 50);
			gp.add(btnBoardPiece.get(i), i, boardHeight);
			
			lblLocation.add(new Label("Location "+i));
			gp.add(lblLocation.get(i),i,textHeight);
			
		}
		//main gp for text at bottom of screen
		textPaneBottom = new GridPane();
		textPaneBottom.setAlignment(Pos.TOP_LEFT);
		textPaneBottom.setBorder(setPanelBorders);
		
		//encounter text label bottom left
		textAreaEncounter = new Label("Encounter text area");
		textAreaEncounter.setMaxWidth(300);
		textAreaEncounter.setMinWidth(300);
		textAreaEncounter.setMinHeight(200);
		textAreaEncounter.setWrapText(true);
		
		//Debug text label bottom center
		textAreaDebug = new Label("Debug Text Area");
		textAreaDebug.setMinWidth(300);
		textAreaDebug.setMaxWidth(300);
		textAreaDebug.setMinHeight(200);
		textAreaDebug.setWrapText(true);
		
		
		textAreaDebugTemp = new Label();
		textAreaDebugTemp.setMinWidth(300);
		textAreaDebugTemp.setMaxWidth(300);
		textAreaDebugTemp.setMinHeight(200);
		textAreaDebugTemp.setWrapText(true);
		//so the 2nd gui call is overwriting the 1st, the whole GUI class is the problem
		textAreaDebug.setText("debug text test temp aaaaaahhh");
		
		textPaneBottom.add(textAreaEncounter,0,0);
		textPaneBottom.add(textAreaDebug, 1, 0);
		textPaneBottom.add(textAreaDebugTemp, 2, 0);
		//setDebugTextArea("debug text area is " + boardNumberClicked);//Integer.toString(getBoardNumber()) );
		//boardNumberClicked = 0;
	}

	Gui() 
	{
		init();
		//drawTextArea();
//		System.out.println("length of board is " + btnBoardPiece.size());
		System.out.println("gui init started");
	}
	//this is the event handler for the 20 buttons
	void getBoardInput() 
	{
		//drawTextArea();
		
		for (int i = 0; i < boardSize; i++)
		{
			//so this allows me to read any button from the board
			//event handler doesn't allow i to be used so I make a new local
			//variable for each iteration
			Integer x = i;
			
			btnBoardPiece.get(i).setOnAction(new EventHandler<ActionEvent>() 
			{
				@Override
				public void handle(ActionEvent event) 
				{
					System.out.println("btn number is " + btnBoardPiece.get(x).getText() );
					
					setBoardNumber(Integer.parseInt( btnBoardPiece.get(x).getText()) );
					debugString = Integer.toString(x);
					//setdebugString(btnBoardPiece.get(x).getText());
					System.out.println("get debug string is " + getdebugString());
					
					textAreaDebug.setText("BOO BOO");
//					getBoardNumber();
//					debugString =btnBoardPiece.get(x).getText();
//					boardNumberClicked = x;
//					System.out.println("debug string is " + boardNumberClicked);
					//setDebugTextArea("debug string is " + boardNumberClicked);
				}
				
			});
			
		}
		
	}
	//used to set board number clicked as event handler won't return integer
	void setBoardNumber(int boardNumberIn) 
	{
		boardNumberClicked =  boardNumberIn;
		System.out.println("SetBoardNumberIs " + boardNumberIn);
	}
	Integer getBoardNumber() 
	{	
		System.out.println("getBoardNumberIs " + boardNumberClicked);
		return boardNumberClicked ;
	}
	void setdebugString(String stringIn)
	{
		debugString = stringIn;
	}
	String getdebugString()
	{
		return debugString ;
	}

	//redrawn in main
	GridPane drawTextArea()
	{
		System.out.println("draw text area was triggered");
		
		//text area for player info and debugging
		//in a separate pane or it messes up the formatting from the game stuff
		//THE MAIN GP 
	
		return textPaneBottom;
	}
	void setDebugTextArea(String stringIn)
	{
		//textAreaDebug.setText(Integer.toString( getBoardNumber()) );
		textAreaDebug.setText(stringIn );
	}


	
	GridPane drawScreen()
	{
		
		//used to watch for board button clicks
		getBoardInput ();
		//setDebugTextArea(Integer.toString( boardNumberClicked) );
		//don't really want event handlers here, see if I can change it later
		btnStartGame.setOnAction(new EventHandler<ActionEvent>() 
		 { @Override
			public void handle(ActionEvent event) 
			{
				System.out.println("game has started");
			}});
		btnEndTurn.setOnAction(new EventHandler<ActionEvent>() 
		{@Override
			public void handle(ActionEvent event) 
			{
				turnNumber +=1;
				btnDisplayTurnNumber.setText("TURN " + turnNumber );	
			}});

		return gp;	
		
		
		//center
//		Label lbl1Center = new Label("Input text here");
//		Label lbl2Center = new Label("Slider value");
//		TextField txtFieldCenter = new TextField ();
//		Button btn1Center = new Gui().drawButton(1,1,"Get user text");
//		Slider slider1Center = new Slider(0,1,0.5);
//		slider1Center.setShowTickLabels(true);
//		slider1Center.setShowTickLabels(true);
//		slider1Center.setMajorTickUnit(0.25f);
//		slider1Center.setBlockIncrement(0.1f);
//		
//		slider1Center.setValue(Double.parseDouble(saveGui.getValue("10") ));
//		
//		//add all the nodes together in the  gridPane
//		gp.add(lbl1Center, 0, 0);
//		gp.add(txtFieldCenter, 0, 1);
//		gp.add(btn1Center, 1, 1);
//		gp.add(slider1Center, 0, 2);
//		gp.add(lbl2Center, 0, 3);
//		gp.setBorder(new Border(new BorderStroke(Color.BLACK,
//				  BorderStrokeStyle.SOLID,CornerRadii.EMPTY,
//				 	BorderWidths.DEFAULT)));
//		gp.setStyle(style3);
//		//listener for slider object
//		  slider1Center.valueProperty().addListener(new ChangeListener<Number>() 
//		  {
//			@Override
//			public void changed(ObservableValue<? extends Number> observable, 
//					Number oldValue, Number newValue) 
//			{
//				//uses df.format to limit the amount of decimal places
//				String sliderValue = df.format(slider1Center.getValue()); 
//				lbl2Center.setText("Slider value is " + sliderValue);
//				//gui save preferences
//				saveGui.setValue("10", slider1Center.getValue());
//			}
//		  });
//		  //if user presses this button then the text from the 
//		  //text field object gets printed to the console
//		  btn1Center.setOnAction(new EventHandler<ActionEvent>() 
//		  {
//			@Override
//			public void handle(ActionEvent event) 
//			{
//				String userInput = "";
//				userInput = txtFieldCenter.getText();
//				System.out.println(userInput);
//			}
//		  });
		
	}
	

	
	FlowPane testPane()
	{
		//this is just a test to use flowPane object
		//generate a variable amount of  buttons and see them wrap around the border
		
		FlowPane fp = new FlowPane();
		Label title = drawLabel("         Title text                        ");
		
		fp.setMinSize(200, 50);
		fp.setVgap(10);
		fp.setHgap(10);
		fp.setPrefWrapLength(100);
		
		fp.getChildren().add(title);
		//fp.getChildren().add(arg0);
		for (int i = 1; i < 7; i++)
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
	//needed for entire class exception handler
	   @Override     
	   public void start(Stage primaryStage) throws Exception 
	   {   
		   System.out.println("Error was found in Gui.java");
	   }
  
} 