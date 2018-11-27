package ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class add{
	public JFrame addButton(JFrame frame){
		//Creating the buttons
		JButton insertButton = new JButton("Insertion");
		JButton selectButton = new JButton("Selection");
		
		//action listeners for insert and selection, put code here
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}			
		});
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
			}
		});
		
		//add and return 
		frame.add(insertButton, BorderLayout.EAST);
		frame.add(selectButton, BorderLayout.WEST);
		return frame;
	}

	
	
}
