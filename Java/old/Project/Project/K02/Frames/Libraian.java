package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;

public class Libraian extends JFrame implements ActionListener
{
	JLabel mainLabel;
	JButton addbookbtn, viewbookbtn, issuebookbtn, viewissuebookbtn, returnbookbtn, logoutbtn,logout, passwordchangebtn, removemember;
	Font myfont,myfont1;
	JPanel panel;
	
	User user;
	
	public Libraian(User user)
	{
		super("Librarian Home Window");
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.user = user;
		
		panel = new JPanel();
		panel.setLayout(null);
		
		//myfont = main
		myfont = new Font("Cooper Black", Font.PLAIN, 20);
		// myfont1 = label
		myfont1 = new Font("Constantia", Font.PLAIN, 15);
		
		mainLabel = new JLabel("LIBRAIAN HOME WINDOW");
		mainLabel.setBounds(300,30,500,30);
		mainLabel.setFont(myfont);
		panel.add(mainLabel);
		
		viewbookbtn = new JButton("AVAILABLE BOOK");
		viewbookbtn.setBounds(200,100,500,30);
		viewbookbtn.setFont(myfont1);
		viewbookbtn.addActionListener(this);
		panel.add(viewbookbtn);
		
		addbookbtn = new JButton("UPDATE BOOK");
		addbookbtn.setBounds(250,175,150,30);
		addbookbtn.setFont(myfont1);
		addbookbtn.addActionListener(this);
		panel.add(addbookbtn);
		
		issuebookbtn = new JButton("ISSUE BOOK");
		issuebookbtn.setBounds(500,175,150,30);
		issuebookbtn.setFont(myfont1);
		issuebookbtn.addActionListener(this);
		panel.add(issuebookbtn);
		
		passwordchangebtn = new JButton("Change Password");
		passwordchangebtn.setBounds(650,250,150,30);
		passwordchangebtn.addActionListener(this);
		panel.add(passwordchangebtn);
		
		removemember = new JButton("Remove Member");
		removemember.setBounds(100,350,200,30);
		removemember.addActionListener(this);
		panel.add(removemember);
		
		returnbookbtn = new JButton("RETURN BOOK");
		returnbookbtn.setBounds(350,250,200,30);
		returnbookbtn.setFont(myfont1);
		returnbookbtn.addActionListener(this);
		panel.add(returnbookbtn);
		
		logoutbtn = new JButton("LOG OUT");
		logoutbtn.setBounds(760,10,110,30);
		logoutbtn.addActionListener(this);
		panel.add(logoutbtn);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(logoutbtn.getText()))
		{	
			Signinpage sign = new Signinpage();
			sign.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(viewbookbtn.getText()))
		{
			Availblebook av = new Availblebook();
			av.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(issuebookbtn.getText()))
		{
			Issuebook is = new Issuebook();
			is.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(returnbookbtn.getText()))
		{
			Returnbook rtn = new Returnbook();
			rtn.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(addbookbtn.getText()))
		{
			Addbook ab = new Addbook();
			ab.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(passwordchangebtn.getText()))
		{
			ChangePassword pass = new ChangePassword();
			pass.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(removemember.getText()))
		{
			RemoveMember rm = new RemoveMember();
			rm.setVisible(true);
			this.setVisible(false);
		}
	}
}