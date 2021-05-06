package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

import repository.*;
import entity.*;

public class RemoveMember extends JFrame implements ActionListener
{
	JLabel main, userlabel;
	JTextField usertf;
	JButton removebtn, backbtn, refreshbtn, memberbtn;
	Font myfont, myfont1;
	JPanel panel;
	JTable table;
	JScrollPane tablesc;
	
	StudentRepo stu;
	User user;
	
	public RemoveMember()
	{
		super("Remove Member");
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		stu = new StudentRepo();
		user = new User();
		
		panel = new JPanel();
		panel.setLayout(null);
		
		//myfont = main
		myfont = new Font("Cooper Black", Font.PLAIN, 20);
		// myfont1 = Label
		myfont1 = new Font("Constantia", Font.PLAIN, 15);
		
		main = new JLabel("Remove Member - Window");
		main.setBounds(330,20,400,30);
		main.setFont(myfont);
		panel.add(main);
		
		String data[][] = {{"", ""}};
		
		String head[] = {"STUDENT NAME", "LIBRARY ID"};
		
		table = new JTable(data,head);
		tablesc = new JScrollPane(table);
		tablesc.setBounds(450,50,400,250);
		table.setEnabled(false);
		panel.add(tablesc);
		
		memberbtn = new JButton("SEE MEMBER");
		memberbtn.setBounds(480,350,300,30);
		memberbtn.addActionListener(this);
		panel.add(memberbtn);
		
		userlabel = new JLabel("LIBRARY ID: ");
		userlabel.setBounds(50,100,150,30);
		userlabel.setFont(myfont1);
		panel.add(userlabel);
	
		usertf = new JTextField();
		usertf.setBounds(200,100,180,30);
		usertf.addActionListener(this);
		panel.add(usertf);
		
		removebtn = new JButton("REMOVE");
		removebtn.setBounds(100,170,200,30);
		removebtn.addActionListener(this);
		panel.add(removebtn);
		
		backbtn = new JButton("BACK");
		backbtn.setBounds(10,10,100,35);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(backbtn.getText()))
		{
			Libraian li = new Libraian(user);
			li.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(removebtn.getText()))
		{
			stu.deleteStudent(usertf.getText());
			
			JOptionPane.showMessageDialog(this,"MEMMBER REMOVED");
			
			usertf.setText("");
		}
		else if(command.equals(memberbtn.getText()))
		{
			String data[][] = stu.getallstudent();
			String head[] = {"STUDENT NAME", "LIBRARY ID"};
			
			panel.remove(tablesc);
			
			table = new JTable(data,head);
			table.setEnabled(false);
			tablesc = new JScrollPane(table);
			tablesc.setBounds(450,50,400,250);
			panel.add(tablesc);
			
			panel.revalidate();
			panel.repaint();
		}
	}
}