package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

import myException.*;
import classes.*;

public class Registration extends JFrame implements ActionListener
{
	JLabel regLabel, nameLabel;
	JTextField nameTF;
	JButton regbtn, backbtn, exitBtn;
	Font myfont,myfont1;
	JPanel panel;
	
	StudentEx stu;
	
	public Registration()
	{
		super("Registration");
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		stu = new StudentEx();
		
		panel = new JPanel();
		panel.setLayout(null);
		
		//myfont = main
		myfont = new Font("Cooper Black", Font.PLAIN, 20);
		// myfont1 = Label
		myfont1 = new Font("Constantia", Font.PLAIN, 15);
		
		regLabel = new JLabel("Student membership");
		regLabel.setBounds(300,50,400,30);
		regLabel.setFont(myfont);
		panel.add(regLabel);
		
		nameLabel = new JLabel("Input Name: ");
		nameLabel.setBounds(100,150,100,30);
		nameLabel.setFont(myfont1);
		panel.add(nameLabel);
		
		nameTF = new JTextField();
		nameTF.setBounds(220,150,500,30);
		panel.add(nameTF);
		
		regbtn = new JButton("REGISTRAION");
		regbtn.setBounds(350,200,150,30);
		regbtn.addActionListener(this);
		panel.add(regbtn);
		
		exitBtn = new JButton("EXIT");
		exitBtn.setBounds(770,400,80,30);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
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
			Signinpage sign = new Signinpage();
			sign.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(exitBtn.getText()))
		{
			System.exit(0);
		}
		else if(command.equals(regbtn.getText()))
		{
			
			Student s = new Student();
			Random rd = new Random();
			int x = rd.nextInt(50);
			
			s.setstudentName(nameTF.getText());
			s.setLibraryID("S0"+x);
			stu.insertStudent(s);
			
			FileReadWrite file = new FileReadWrite();//File
			file.writeInFile(+nameTF.getText()+,S0"+x);
			String ss;
		 
		    ss=file.readFromFile("History.txt");
		    System.out.println(ss);
			
			
			JOptionPanel.showMessageDialog(this, "Inserted, NAME: "+nameTF.getText()+" and Library ID: S0"+x);
		}
	}
	
}