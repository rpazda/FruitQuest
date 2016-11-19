package userInterface;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HelpInfo {

	public HelpInfo(JFrame parent){
		initComponents(parent);
	}
	
	private void initComponents(JFrame parent){
		String message = new String("");
		JOptionPane.showMessageDialog(parent, message, "Help", JOptionPane.INFORMATION_MESSAGE);
	}

}

