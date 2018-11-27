package ui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel; 

public class ui {

	public static void main(String[] args) {
		JFrame menu = new JFrame();
		JPanel buttons = new JPanel();
		menu.setSize(800,600);
		menu.setLocation(200, 100);
		menu.setTitle("Library Database");
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setVisible(true);
		
		JButton EmployeeTable,BranchTable, SupplierTable, MemberTable,BookTable,
		DVDTable, HardwareTable;
		EmployeeTable = new JButton("Employee Table");
		BranchTable = new JButton("Branch Table");
		SupplierTable = new JButton("Supplier Table");
		MemberTable = new JButton("Member Table");
		BookTable = new JButton("Book Table");
		DVDTable = new JButton("DVD Table");
		HardwareTable = new JButton("Hardware Table");
		
		
		buttons.add(EmployeeTable);
		buttons.add(BranchTable);
		buttons.add(SupplierTable);
		buttons.add(MemberTable);
		buttons.add(BookTable);
		buttons.add(DVDTable);
		buttons.add(HardwareTable);
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.LINE_AXIS));
		menu.add(buttons, BorderLayout.CENTER);
		
		EmployeeTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame tempDB = new JFrame();
				tempDB.setSize(400,200);
				tempDB.setLocation(400, 200);
				tempDB.setTitle("Employee Database");
				tempDB.setVisible(true);
				add tempDB2 = new add();
				tempDB = tempDB2.addButton(tempDB);
			}          
	      });
		
		BranchTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame tempDB = new JFrame();
				tempDB.setSize(400,200);
				tempDB.setLocation(400, 200);
				tempDB.setTitle("Branch Database");
				tempDB.setVisible(true);
				add tempDB2 = new add();
				tempDB = tempDB2.addButton(tempDB);
			}          
	      });
		
		SupplierTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame tempDB = new JFrame();
				tempDB.setSize(400,200);
				tempDB.setLocation(400, 200);
				tempDB.setTitle("Supplier Database");
				tempDB.setVisible(true);
				add tempDB2 = new add();
				tempDB = tempDB2.addButton(tempDB);
			}          
	      });
		
		MemberTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame tempDB = new JFrame();
				tempDB.setSize(400,200);
				tempDB.setLocation(400, 200);
				tempDB.setTitle("Member Database");
				tempDB.setVisible(true);
				add tempDB2 = new add();
				tempDB = tempDB2.addButton(tempDB);
			}          
	      });
		
		BookTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame tempDB = new JFrame();
				tempDB.setSize(400,200);
				tempDB.setLocation(400, 200);
				tempDB.setTitle("Book Database");
				tempDB.setVisible(true);
				add tempDB2 = new add();
				tempDB = tempDB2.addButton(tempDB);
			}          
	      });
	
		DVDTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame tempDB = new JFrame();
				tempDB.setSize(400,200);
				tempDB.setLocation(400, 200);
				tempDB.setTitle("DVD Database");
				tempDB.setVisible(true);
				add tempDB2 = new add();
				tempDB = tempDB2.addButton(tempDB);
			}          
	      });
		
		HardwareTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame tempDB = new JFrame();
				tempDB.setSize(400,200);
				tempDB.setLocation(400, 200);
				tempDB.setTitle("Hardware Database");
				tempDB.setVisible(true);
				add tempDB2 = new add();
				tempDB = tempDB2.addButton(tempDB);
			}          
	      });
	}
}

