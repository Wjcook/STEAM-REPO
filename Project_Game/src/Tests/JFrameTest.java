package Tests;
import java.awt.Color;

import javax.swing.*;

public class JFrameTest {
	private static JFrame f; // The Frame is the actual window
	private static JButton b; //a button is a button
	private static JPanel p;//the panel is what fills the inside of the window
	
	public static void CreateJFrame(){
		f = new JFrame("This is my first JFrame"); //gives the name to the frame
		f.setSize(600,400);//sets size in pixels
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//gives it an operation 
		//to run when it closes on default it does nothing
		
		
		b = new JButton("Click Me"); //gives the button name
		
		p= new JPanel(); //creates the panel
		p.setBackground(Color.BLUE);//sets the background color
		p.add(b);//adds the button to the panel
		
		f.add(p);//adds the panel to the window
		f.setVisible(true);
	}
	
	public static void main(String args[]){
		CreateJFrame();// calls the method
		
	}
}
