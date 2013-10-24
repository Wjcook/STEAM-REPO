package World;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import World.Track;
import javax.swing.*;

public class Campaign {
	JTextArea Field;
	JPanel Panel;
	JFrame Frame;
	public Campaign(){
		Field = new JTextArea(5,7);
		Panel = new JPanel();
		Frame = new JFrame();
		
		Frame.setSize(500,400);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension size = tk.getScreenSize();
		int xpos = (size.width/2)-(Frame.getWidth()/2);
		int ypos = (size.height/2)-(Frame.getHeight()/2);
		Frame.setLocation(xpos,ypos);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel.add(Field);
		
		Frame.add(Panel);
		Frame.setVisible(true);
		
	}
	
	public void write(String words){
		Field.append(words);
	}
	
	public void clear(){
		Field.setText("");
	}
	
}

class KeyListner implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	

	
}
