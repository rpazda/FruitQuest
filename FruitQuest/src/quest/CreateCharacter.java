package quest;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import quest.Character.saveCharacterAction;

public class CreateCharacter {
	
	public JComboBox classesSelect;
	public JLabel selectedClass = new JLabel();
	public Character character;
	
	public CreateCharacter(JPanel panel, JPanel buttons){
		
		character = new Character();
		
		String[] classStrings = {"Apple", "Orange", "Banana", "Pear", "Peach"};
		classesSelect = new JComboBox(classStrings);
		classesSelect.addActionListener(new selectCharacterAction());
		panel.add(classesSelect);
		panel.add(selectedClass);

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
	private class selectCharacterAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			selectedClass = (JLabel) classesSelect.getSelectedItem();
			String fruitClass = classesSelect.getSelectedItem().toString();
			character.setMyFruit(fruitClass);
			//panel.add(new JLabel(new ImageIcon(character.getUrl())));
		}
	}
}

