package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import repository.*;
import entity.*;

public class Home extends JFrame implements ActionListener
{
	JLabel title, searchtitle, signintitle, grouptitle, imgLabel;
	JButton bookloadbtn, signinbtn;
	JPanel panel;
	Color mycolor;
	Font myfont, myfont1, myfont2;
	ImageIcon img;
	
	Book book;
	
	public Home()
	{
		super("Home Menu");
		
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.book = book;
		
		panel = new JPanel();
		panel.setLayout(null);
		
		//myfont = main
		myfont = new Font("Cooper Black", Font.PLAIN, 30);
		// myfont1 = search and signin
		myfont1 = new Font("Constantia", Font.PLAIN, 20);
		// myfont2 = gourp member
		myfont2 = new Font("Constantia", Font.PLAIN, 12);
		
		title = new JLabel(" LIBRARY MANAGEMENT SYSTEM");
		title.setBounds(170,70,565,30);
		title.setOpaque(true);
		title.setFont(myfont);
		panel.add(title);
		
		signintitle = new JLabel(" For Login and Registration");
		signintitle.setBounds(320,150,245,30);
		signintitle.setOpaque(true);
		signintitle.setFont(myfont1);
		panel.add(signintitle);
		
		signinbtn = new JButton("SIGN IN");
		signinbtn.setBounds(390,190,100,35);
		signinbtn.addActionListener(this);
		panel.add(signinbtn);
		
		searchtitle = new JLabel("For Book Search");
		searchtitle.setBounds(360,250,150,30);
		searchtitle.setOpaque(true);
		searchtitle.setFont(myfont1);
		panel.add(searchtitle);
		
		bookloadbtn = new JButton("SEARCH");
		bookloadbtn.setBounds(390,290,100,35);
		bookloadbtn.addActionListener(this);
		panel.add(bookloadbtn);
		
		grouptitle = new JLabel("Made By Group k02");
		grouptitle.setBounds(750,400,200,30);
		grouptitle.setFont(myfont2);
		panel.add(grouptitle);
		
		img = new ImageIcon("library.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,900,500);
		panel.add(imgLabel);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(signinbtn.getText()))
		{
			Signinpage sign = new Signinpage();
			sign.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(bookloadbtn.getText()))
		{
			SearchFrame sr = new SearchFrame(book);
			sr.setVisible(true);
			this.setVisible(false);
		}
		
	}
}