package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import myException.*;
import classes.*;

public class Signinpage extends JFrame implements ActionListener, MouseListener
{
	JLabel title, userlabel, passlabel,reglabel, memberinfo;
	JTextField userTF;
	JPasswordField passPF;
	JButton loginbtn, exitBtn, regBtn, showPassBtn, refreshbtn, backbtn, memberbtn;
	JPanel panel;
	Font myfont,myfont1;
	
	
	public Signinpage()
	{
		super("Login Window");
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		//myfont = main
		myfont = new Font("Cooper Black", Font.PLAIN, 20);
		// myfont1 = label
		myfont1 = new Font("Constantia", Font.PLAIN, 20);
		
		
		title = new JLabel("Library Management System - Login Window");
		title.setBounds(220,50,500,30);
		title.setFont(myfont);
		panel.add(title);
		
		userlabel = new JLabel("User ID: ");
		userlabel.setBounds(300,120,150,30);
		userlabel.setFont(myfont1);
		panel.add(userlabel);
		
		userTF = new JTextField();
		userTF.setBounds(400,120,150,30);
		panel.add(userTF);
		
		passlabel = new JLabel("Password: ");
		passlabel.setBounds(300,160,150,30);
		passlabel.setFont(myfont1);
		panel.add(passlabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(400,160,150,30);
		passPF.setEchoChar('*');
		panel.add(passPF);
		
		showPassBtn = new JButton("Show");
		showPassBtn.setBounds(560,160,80,30);
		showPassBtn.addMouseListener(this);
		panel.add(showPassBtn);
		
		loginbtn = new JButton("Login");
		loginbtn.setBounds(400,200,100,30);
		loginbtn.addActionListener(this);
		panel.add(loginbtn);
		
		reglabel = new JLabel("Library Membership");
		reglabel.setBounds(350,250,500,30);
		reglabel.setFont(myfont1);
		panel.add(reglabel);
		
		regBtn = new JButton("Registration");
		regBtn.setBounds(380,300,150,30);
		regBtn.addActionListener(this);
		panel.add(regBtn);
		
		memberinfo = new JLabel("Member Info and Remove Member");
		memberinfo.setBounds(250,350,500,30);
		memberinfo.setFont(myfont1);
		panel.add(memberinfo);
		
		memberbtn = new JButton("All Member");
		memberbtn.setBounds(380,390,150,30);
		memberbtn.addActionListener(this);
		panel.add(memberbtn);
		
		refreshbtn = new JButton("Refresh");
		refreshbtn.setBounds(130,10,100,35);
		refreshbtn.addActionListener(this);
		panel.add(refreshbtn);
		
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
			Home hm = new Home();
			hm.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(exitBtn.getText()))
		{
			System.exit(0);
		}
		
		else if(command.equals(loginbtn.getText()))
		{
			UserEx ur = new UserEx();
			User user = ur.getUser(userTF.getText(), passPF.getText());
			
			if(user != null)
			{
				Libraian lb = new Libraian(user);
				lb.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Invaild Id or Password");
			}
		}
		else if(command.equals(regBtn.getText()))
		{
			Registration reg = new Registration();
			reg.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(memberbtn.getText()))
		{
			Memberinfo mem = new Memberinfo();
			mem.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(refreshbtn.getText()))
		{
			userTF.setText("");
			passPF.setText("");
			
			userTF.setEnabled(true);
			passPF.setEnabled(true);
		}
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me)
	{
		passPF.setEchoChar((char)0);
	}
	public void mouseReleased(MouseEvent me)
	{
		passPF.setEchoChar('*');
	}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
}