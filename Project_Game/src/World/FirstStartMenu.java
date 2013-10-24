package World;
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;


@SuppressWarnings("serial")

public class FirstStartMenu extends JFrame implements ActionListener{
	private JLabel heading;
	private JTextField nameBox;
	private JButton nameConfirm;
	public String NAMEOFCHRACTER;
	
	public FirstStartMenu(){
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		this.setLocation((tk.getScreenSize().width/2) - (600/2),0);
		
		this.setLayout(null);
		this.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		heading = new JLabel("[Still Insert heading Here]");
		Dimension size1 = heading.getPreferredSize();
		
		
		nameBox = new JTextField();
		nameBox.requestFocus();
		nameConfirm = new JButton("Create Chracter");
		
		Dimension size2 = nameConfirm.getPreferredSize();
		
		int headingx = (600/2) - (size1.width/2);
		int headingy = 30;
		int nameBoxx = headingx;
		int nameBoxy = headingy+size1.height+10;
		int nameConfirmx = nameBoxx+size2.width+20;
		int nameConfirmy = nameBoxy;
		heading.setBounds(headingx,headingy,size1.width,size1.height);
		nameBox.setBounds(nameBoxx,nameBoxy,size1.width,size2.height);
		nameConfirm.setBounds(nameConfirmx,nameConfirmy,size1.width,size2.height);
		
		nameConfirm.addActionListener(this);
		
		this.add(nameBox);
		this.add(nameConfirm);
		this.add(heading);
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == nameConfirm){
			NAMEOFCHRACTER = nameBox.getText();
			/*JOptionPane.showMessageDialog(null, "Hello " + NAMEOFCHRACTER + " " +
					"the new Teroist group " +
					"known as La " +
					"Quasidilla is about to strike again please help us on " +
					"fending off this attack");*/
			this.dispose();
			new GameMenu(NAMEOFCHRACTER);
			
		}
		
	}

	
	
}
