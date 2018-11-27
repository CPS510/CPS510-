package ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class add{
	public JFrame addButton(JFrame frame){
		JButton insertButton = new JButton("Insertion");
		JButton selectButton = new JButton("Selection");
		
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}			
		});
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
			}
		});
		frame.add(insertButton, BorderLayout.EAST);
		frame.add(selectButton, BorderLayout.WEST);
		return frame;
	}

	
	
}
