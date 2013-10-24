package World;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class GameMenu extends JFrame implements ActionListener{
	private JButton startCampaign;
	private JButton startSandbox;
	private JButton settings;
	private JLabel gameTitle;
	
	public GameMenu(String name) {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		gameTitle = new JLabel("Hello " + name + " " +
				"the new Teroist group " +
				"known as La " +
				"Quasidilla is about to strike again please help us on " +
				"fending off this attack");
		Dimension title = gameTitle.getPreferredSize();
		
		startCampaign = new JButton("Start New Campaign");
		
		
		startSandbox = new JButton("Start a new SandBox Game");
		Dimension size = startSandbox.getPreferredSize();
		
		settings = new JButton("Settings");
		
		this.setTitle("Menu");
		this.setLayout(null);
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int gameTitlex = 0;
		int gameTitley = 0;
		gameTitle.setBounds(gameTitlex,gameTitley,title.width,title.height);
		int startCampaignx = (800/2) - (size.width);
		int startCampaigny = gameTitley+30;
		startCampaign.setBounds(startCampaignx,startCampaigny,size.width,size.height);
		int startSandboxx = startCampaignx;
		int startSandboxy = startCampaigny+30;
		startSandbox.setBounds(startSandboxx,startSandboxy,size.width,size.height);
		int settingsx = startCampaignx;
		int settingsy= startSandboxy +30;
		settings.setBounds(settingsx,settingsy,size.width,size.height);
		
		startCampaign.addActionListener(this);
		startSandbox.addActionListener(this);
		settings.addActionListener(this);
		
		this.setLocation((tk.getScreenSize().width/2)-(800/2), 0);
		this.add(gameTitle);
		this.add(startCampaign);
		this.add(startSandbox);
		this.add(settings);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startCampaign){
			this.dispose();
			new Track();
			
		}else if(e.getSource() == startSandbox){
			JOptionPane.showMessageDialog(null, "You Pressed the sandboxMode");
			System.exit(0);
		}else if(e.getSource() == settings){
			JOptionPane.showMessageDialog(null, "You Pressed the settings");
			System.exit(0);
		}else{
			JOptionPane.showMessageDialog(null, "Something Went Wrong");
			System.exit(0);
		}
		
	}
}
