/**
 * Include updated @author tag.
 */
package application.controller;

import application.Main;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import application.model.MultithreadingInstance;

public class PianoController {
	
	
	public ImageView imgPianoC1; // 1
	public ImageView imgPianoC2; // 2
	public ImageView imgPianoC3; // 3
	
	public ImageView imgPianoCD1;
	public ImageView imgPianoCD2;
	public ImageView imgPianoCD3;
	
	public ImageView imgPianoD1; // 4
	public ImageView imgPianoD2; // 5
	public ImageView imgPianoD3; // 6
	
	public ImageView imgPianoDE1;
	public ImageView imgPianoDE2;
	public ImageView imgPianoDE3;
	
	public ImageView imgPianoE1; // 7
	public ImageView imgPianoE2; // 8
	public ImageView imgPianoE3; // 9
	
	public ImageView imgPianoEF1;
	public ImageView imgPianoEF2;
	public ImageView imgPianoEF3;
	
	public ImageView imgPianoF1; // 10
	public ImageView imgPianoF2; // 11
	public ImageView imgPianoF3; // 12
	
	public ImageView imgPianoG1; // 13
	public ImageView imgPianoG2; // 14
	public ImageView imgPianoG3; // 15
	
	public ImageView imgPianoGA1;
	public ImageView imgPianoGA2;
	
	public ImageView imgPianoA1; // 16
	public ImageView imgPianoA2; // 17
	
	public ImageView imgPianoAB1;
	public ImageView imgPianoAB2;
	
	public ImageView imgPianoB1; // 18
	public ImageView imgPianoB2; // 19
	
	public ImageView imgKeyboardA;
	public ImageView imgKeyboardS;
	public ImageView imgKeyboardD;
	public ImageView imgKeyboardF;
	public ImageView imgKeyboardG;
	public ImageView imgKeyboardH;
	public ImageView imgKeyboardJ;
	public ImageView imgKeyboardK;
	public ImageView imgKeyboardL;
	public ImageView imgKeyboardQ;
	public ImageView imgKeyboardW;
	public ImageView imgKeyboardE;
	public ImageView imgKeyboardR;
	public ImageView imgKeyboardT;
	public ImageView imgKeyboardY;
	public ImageView imgKeyboardU;
	public ImageView imgKeyboardI;
	public ImageView imgKeyboardO;
	public ImageView imgKeyboardP;
	
	
	public void handleReturn(ActionEvent event) { //Initialize Main.fxml
		
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			Main.stage.setScene(new Scene(root, 600, 600));
			Main.stage.show();
			
		}catch( IOException e ) {
			System.out.println( "Error returning to home screen." ); //output if file null
			e.printStackTrace();
		}
		
	}
	
	public static String lastPressed = "A0";
	
	//Finally going to have to play with Multi-threading
	
	//If recording == true, then handle should add key to string to be saved to file later.
	
    @FXML
    public void initialize() throws FileNotFoundException{
    	
    	try {
    		
    		Main.currentStage = "Piano";
    		
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.A && Main.currentStage.equals("Piano") ) { System.out.println("C3"); lastPressed = "C3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //C3
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.S && Main.currentStage.equals("Piano") ) { System.out.println("D3"); lastPressed = "D3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //D3
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.D && Main.currentStage.equals("Piano") ) { System.out.println("E3"); lastPressed = "E3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //E3
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.F && Main.currentStage.equals("Piano") ) { System.out.println("F3"); lastPressed = "F3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //F3
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.G && Main.currentStage.equals("Piano") ) { System.out.println("G3"); lastPressed = "G3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //G3
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.H && Main.currentStage.equals("Piano") ) { System.out.println("A3"); lastPressed = "A3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //A3
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.J && Main.currentStage.equals("Piano") ) { System.out.println("B3"); lastPressed = "B3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //B3
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.K && Main.currentStage.equals("Piano") ) { System.out.println("C4"); lastPressed = "C4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //C4
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.L && Main.currentStage.equals("Piano") ) { System.out.println("D4"); lastPressed = "D4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //D4
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Q && Main.currentStage.equals("Piano") ) { System.out.println("E4"); lastPressed = "E4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //E4
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.W && Main.currentStage.equals("Piano") ) { System.out.println("F4"); lastPressed = "F4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //F4
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.E && Main.currentStage.equals("Piano") ) { System.out.println("G4"); lastPressed = "G4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //G4
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.R && Main.currentStage.equals("Piano") ) { System.out.println("A4"); lastPressed = "A4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //A4
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.T && Main.currentStage.equals("Piano") ) { System.out.println("B4"); lastPressed = "B4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //B4
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.Y && Main.currentStage.equals("Piano") ) { System.out.println("C5"); lastPressed = "C5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //C5
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.U && Main.currentStage.equals("Piano") ) { System.out.println("D5"); lastPressed = "D5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //D5
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.I && Main.currentStage.equals("Piano") ) { System.out.println("E5"); lastPressed = "E5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //E5
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.O && Main.currentStage.equals("Piano") ) { System.out.println("F5"); lastPressed = "F5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //F5
    		Main.stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> { if(key.getCode()==KeyCode.P && Main.currentStage.equals("Piano") ) { System.out.println("G5"); lastPressed = "G5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); } }); //G5
    		
    	} catch (Exception e) { 
            System.out.println ("Exception is caught"); 
        } 
    }
	
	@FXML private void handleC3_entered() throws ClassNotFoundException { imgPianoC1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleC3_exited() throws ClassNotFoundException { imgPianoC1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleC3_clicked() throws ClassNotFoundException { lastPressed = "C3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleC4_entered() throws ClassNotFoundException { imgPianoC2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleC4_exited() throws ClassNotFoundException { imgPianoC2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleC4_clicked() throws ClassNotFoundException { lastPressed = "C4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleC5_entered() throws ClassNotFoundException { imgPianoC3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleC5_exited() throws ClassNotFoundException { imgPianoC3.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleC5_clicked() throws ClassNotFoundException { lastPressed = "C5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleD3_entered() throws ClassNotFoundException { imgPianoD1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD3_exited() throws ClassNotFoundException { imgPianoD1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleD3_clicked() throws ClassNotFoundException { lastPressed = "D3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleD4_entered() throws ClassNotFoundException { imgPianoD2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD4_exited() throws ClassNotFoundException { imgPianoD2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleD4_clicked() throws ClassNotFoundException { lastPressed = "D4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleD5_entered() throws ClassNotFoundException { imgPianoD3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD5_exited() throws ClassNotFoundException { imgPianoD3.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleD5_clicked() throws ClassNotFoundException { lastPressed = "D5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleE3_entered() throws ClassNotFoundException { imgPianoE1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE3_exited() throws ClassNotFoundException { imgPianoE1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleE3_clicked() throws ClassNotFoundException { lastPressed = "E3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleE4_entered() throws ClassNotFoundException { imgPianoE2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE4_exited() throws ClassNotFoundException { imgPianoE2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleE4_clicked() throws ClassNotFoundException { lastPressed = "E4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleE5_entered() throws ClassNotFoundException { imgPianoE3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE5_exited() throws ClassNotFoundException { imgPianoE3.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleE5_clicked() throws ClassNotFoundException { lastPressed = "E5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleF3_entered() throws ClassNotFoundException { imgPianoF1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleF3_exited() throws ClassNotFoundException { imgPianoF1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleF3_clicked() throws ClassNotFoundException { lastPressed = "F3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleF4_entered() throws ClassNotFoundException { imgPianoF2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleF4_exited() throws ClassNotFoundException { imgPianoF2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleF4_clicked() throws ClassNotFoundException { lastPressed = "F4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleF5_entered() throws ClassNotFoundException { imgPianoF3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleF5_exited() throws ClassNotFoundException { imgPianoF3.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleF5_clicked() throws ClassNotFoundException { lastPressed = "F5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleG3_entered() throws ClassNotFoundException { imgPianoG1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG3_exited() throws ClassNotFoundException { imgPianoG1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleG3_clicked() throws ClassNotFoundException { lastPressed = "G3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleG4_entered() throws ClassNotFoundException { imgPianoG2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG4_exited() throws ClassNotFoundException { imgPianoG2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleG4_clicked() throws ClassNotFoundException { lastPressed = "G4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleG5_entered() throws ClassNotFoundException { imgPianoG3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG5_exited() throws ClassNotFoundException { imgPianoG3.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleG5_clicked() throws ClassNotFoundException { lastPressed = "G5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleA3_entered() throws ClassNotFoundException { imgPianoA1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleA3_exited() throws ClassNotFoundException { imgPianoA1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleA3_clicked() throws ClassNotFoundException { lastPressed = "A3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleA4_entered() throws ClassNotFoundException { imgPianoA2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleA4_exited() throws ClassNotFoundException { imgPianoA2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleA4_clicked() throws ClassNotFoundException { lastPressed = "A4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	
	@FXML private void handleB3_entered() throws ClassNotFoundException { imgPianoB1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleB3_exited() throws ClassNotFoundException { imgPianoB1.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleB3_clicked() throws ClassNotFoundException { lastPressed = "B3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	@FXML private void handleB4_entered() throws ClassNotFoundException { imgPianoB2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleB4_exited() throws ClassNotFoundException { imgPianoB2.setImage(new Image("keys/piano_left.png")); }
	@FXML private void handleB4_clicked() throws ClassNotFoundException { lastPressed = "B4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleA_entered() throws ClassNotFoundException { imgKeyboardA.setImage(new Image("keys/color2.png")); imgPianoC1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleA_exited() throws ClassNotFoundException { imgKeyboardA.setImage(new Image("keys/color.png")); imgPianoC1.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleA_clicked() throws ClassNotFoundException { lastPressed = "C3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleS_entered() throws ClassNotFoundException { imgKeyboardS.setImage(new Image("keys/color2.png")); imgPianoD1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleS_exited() throws ClassNotFoundException { imgKeyboardS.setImage(new Image("keys/color.png")); imgPianoD1.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleS_clicked() throws ClassNotFoundException { lastPressed = "D3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleD_entered() throws ClassNotFoundException { imgKeyboardD.setImage(new Image("keys/color2.png")); imgPianoE1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleD_exited() throws ClassNotFoundException { imgKeyboardD.setImage(new Image("keys/color.png")); imgPianoE1.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleD_clicked() throws ClassNotFoundException { lastPressed = "E3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleF_entered() throws ClassNotFoundException { imgKeyboardF.setImage(new Image("keys/color2.png")); imgPianoF1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleF_exited() throws ClassNotFoundException { imgKeyboardF.setImage(new Image("keys/color.png")); imgPianoF1.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleF_clicked() throws ClassNotFoundException { lastPressed = "F3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleG_entered() throws ClassNotFoundException { imgKeyboardG.setImage(new Image("keys/color2.png")); imgPianoG1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleG_exited() throws ClassNotFoundException { imgKeyboardG.setImage(new Image("keys/color.png")); imgPianoG1.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleG_clicked() throws ClassNotFoundException { lastPressed = "G3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleH_entered() throws ClassNotFoundException { imgKeyboardH.setImage(new Image("keys/color2.png")); imgPianoA1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleH_exited() throws ClassNotFoundException { imgKeyboardH.setImage(new Image("keys/color.png")); imgPianoA1.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleH_clicked() throws ClassNotFoundException { lastPressed = "A3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleJ_entered() throws ClassNotFoundException { imgKeyboardJ.setImage(new Image("keys/color2.png")); imgPianoB1.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleJ_exited() throws ClassNotFoundException { imgKeyboardJ.setImage(new Image("keys/color.png")); imgPianoB1.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleJ_clicked() throws ClassNotFoundException { lastPressed = "B3"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleK_entered() throws ClassNotFoundException { imgKeyboardK.setImage(new Image("keys/color2.png")); imgPianoC2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleK_exited() throws ClassNotFoundException { imgKeyboardK.setImage(new Image("keys/color.png")); imgPianoC2.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleK_clicked() throws ClassNotFoundException { lastPressed = "C4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleL_entered() throws ClassNotFoundException { imgKeyboardL.setImage(new Image("keys/color2.png")); imgPianoD2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleL_exited() throws ClassNotFoundException { imgKeyboardL.setImage(new Image("keys/color.png")); imgPianoD2.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleL_clicked() throws ClassNotFoundException { lastPressed = "D4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleQ_entered() throws ClassNotFoundException { imgKeyboardQ.setImage(new Image("keys/color2.png")); imgPianoE2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleQ_exited() throws ClassNotFoundException { imgKeyboardQ.setImage(new Image("keys/color.png")); imgPianoE2.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleQ_clicked() throws ClassNotFoundException { lastPressed = "E4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleW_entered() throws ClassNotFoundException { imgKeyboardW.setImage(new Image("keys/color2.png")); imgPianoF2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleW_exited() throws ClassNotFoundException { imgKeyboardW.setImage(new Image("keys/color.png")); imgPianoF2.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleW_clicked() throws ClassNotFoundException { lastPressed = "F4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleE_entered() throws ClassNotFoundException { imgKeyboardE.setImage(new Image("keys/color2.png")); imgPianoG2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleE_exited() throws ClassNotFoundException { imgKeyboardE.setImage(new Image("keys/color.png")); imgPianoG2.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleE_clicked() throws ClassNotFoundException { lastPressed = "G4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleR_entered() throws ClassNotFoundException { imgKeyboardR.setImage(new Image("keys/color2.png")); imgPianoA2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleR_exited() throws ClassNotFoundException { imgKeyboardR.setImage(new Image("keys/color.png")); imgPianoA2.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleR_clicked() throws ClassNotFoundException { lastPressed = "A4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleT_entered() throws ClassNotFoundException { imgKeyboardT.setImage(new Image("keys/color2.png")); imgPianoB2.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleT_exited() throws ClassNotFoundException { imgKeyboardT.setImage(new Image("keys/color.png")); imgPianoB2.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleT_clicked() throws ClassNotFoundException { lastPressed = "B4"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleY_entered() throws ClassNotFoundException { imgKeyboardY.setImage(new Image("keys/color2.png")); imgPianoC3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleY_exited() throws ClassNotFoundException { imgKeyboardY.setImage(new Image("keys/color.png")); imgPianoC3.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleY_clicked() throws ClassNotFoundException { lastPressed = "C5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleU_entered() throws ClassNotFoundException { imgKeyboardU.setImage(new Image("keys/color2.png")); imgPianoD3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleU_exited() throws ClassNotFoundException { imgKeyboardU.setImage(new Image("keys/color.png")); imgPianoD3.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleU_clicked() throws ClassNotFoundException { lastPressed = "D5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleI_entered() throws ClassNotFoundException { imgKeyboardI.setImage(new Image("keys/color2.png")); imgPianoE3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleI_exited() throws ClassNotFoundException { imgKeyboardI.setImage(new Image("keys/color.png")); imgPianoE3.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleI_clicked() throws ClassNotFoundException { lastPressed = "E5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleO_entered() throws ClassNotFoundException { imgKeyboardO.setImage(new Image("keys/color2.png")); imgPianoF3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleO_exited() throws ClassNotFoundException { imgKeyboardO.setImage(new Image("keys/color.png")); imgPianoF3.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleO_clicked() throws ClassNotFoundException { lastPressed = "F5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
	@FXML private void handleP_entered() throws ClassNotFoundException { imgKeyboardP.setImage(new Image("keys/color2.png")); imgPianoG3.setImage(new Image("keys/piano_left2.png")); }
	@FXML private void handleP_exited() throws ClassNotFoundException { imgKeyboardP.setImage(new Image("keys/color.png")); imgPianoG3.setImage(new Image("keys/piano_left.png"));  }
	@FXML private void handleP_clicked() throws ClassNotFoundException { lastPressed = "G5"; Thread object = new Thread(new MultithreadingInstance()); object.start(); }
	
}