package quest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;

import userInterface.*;

public class Quest {
	
	private JFrame frame;
	private JMenuBar menuBar;
	private JPanel panel;
	
	private JMenu fileMenu;
	private JMenuItem exit;
	private JMenuItem loadGame;
	private JMenuItem saveGame;
	
	private JMenu settingsMenu;
	private JMenuItem settings;
	
	private JMenu helpMenu;
	private JMenuItem help;
	private JMenuItem about;
	
	private JButton startButton;
	
	public Quest(){
		initComponents();
	}
	
	private void initComponents(){
		
		//set layout
		BorderLayout layout = new BorderLayout();
		
		//Initialize JFrame
		frame = new JFrame("FruitQuest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		
		menuBar = new JMenuBar();
		frame.add(menuBar,layout.NORTH);
		
		panel = new JPanel();
		panel.add(new JLabel(new ImageIcon("./assets/title.png")) ,layout.CENTER);
		frame.add(panel);
		panel.setBackground(Color.WHITE);
		
		startButton = new JButton("Begin Quest!");
		startButton.setMaximumSize(new Dimension(200,50));
		
		frame.add(startButton, layout.SOUTH);
		
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		
		exit = new JMenuItem("Exit");
		exit.addActionListener(new FileMenuAction());
		fileMenu.add(exit);
		
		settingsMenu = new JMenu("Settings");
		settingsMenu.setMnemonic('S');
		
		helpMenu = new JMenu("Help");
		helpMenu.setMnemonic('H');
		
		JMenuItem help = new JMenuItem("Help");
		help.addActionListener(new HelpMenuAction());
		helpMenu.add(help);
		
		JMenuItem about = new JMenuItem("About");
		about.addActionListener(new HelpMenuAction());
		helpMenu.add(about);
		
		menuBar.add(fileMenu);
		menuBar.add(settingsMenu);
		menuBar.add(helpMenu);
		
		
		frame.setVisible(true);
		frame.validate();
		frame.repaint();
		
	}
	
	private class FileMenuAction implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			//panel.removeAll();
			
			if(e.getActionCommand() == "Exit")
			{
				System.exit(0);
			}
			/*else if(e.getActionCommand() == ""){
				
			}*/
		}
	}
	
	private class HelpMenuAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getActionCommand() == "Help"){
				HelpInfo help = new HelpInfo(frame);
			}
			else if(e.getActionCommand() == "About"){
				AboutInfo about = new AboutInfo(frame);
			}
		}
	}
	
}
