package userInterface;

import javax.swing.*;

public class AboutInfo {
	
	public AboutInfo(JFrame parent){
		initComponents(parent);
	}
	
	private void initComponents(JFrame parent){
		String message = new String("About FruitQuest\n\n"
				+ "Developed for Microsoft Hackathon 2016 by:\n"
				+ "   Richard Pazda\n"
				+ "   Matthew Fraley\n");
		JOptionPane.showMessageDialog(parent, message, "About", JOptionPane.INFORMATION_MESSAGE);
	}

}
