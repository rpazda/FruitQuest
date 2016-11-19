package quest;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import quest.Character.saveCharacterAction;

public class CreateCharacter {
	
	public CreateCharacter(){
		
		Character character = new Character();
	}
	
	private void initComponents(JPanel parent, JPanel lowerPanel){
		
		//Initialize character properties
		
		parent.removeAll();	//Clear contents of panel to display creation menu
		
		JLabel charNameLabel = new JLabel("Character Name:");
		charNameLabel.setPreferredSize(new Dimension(200, 25));
		JTextField characterNameField = new JTextField();
		characterNameField.setPreferredSize(new Dimension(200, 25));
		
		JButton saveCharacterButton = new JButton("Save Character");
		saveCharacterButton.addActionListener(new saveCharacterAction());
		

		parent.add(charNameLabel);
		parent.add(characterNameField);
		
		lowerPanel.add(saveCharacterButton);
		
		parent.validate();
		parent.repaint();	//Repaint main panel with Character form
		parent.setVisible(true);
		
		lowerPanel.validate();
		lowerPanel.repaint();	//Repaint main panel with Character form
		lowerPanel.setVisible(true);
	}

	private boolean doesCharacterExist(){
		return false;
	}
	
	private class saveCharacterAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getActionCommand() == "Save Character"){
				
			}
		}
	}
}

