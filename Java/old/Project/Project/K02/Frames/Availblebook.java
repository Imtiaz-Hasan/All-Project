package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import entity.*;
import repository.*;

public class Availblebook extends JFrame implements ActionListener
{
	JLabel label,bookname, bookid, authorname, edition;
	JTextField booknameTF, bookidTF, authornameTF, editionTF;
	JButton searchbtn, backbtn,exitBtn, getallbtn, refreshbtn, logoutbtn;
	JTable booktable;
	JScrollPane tablescroll;
	JPanel panel;
	Font myfont,myfont1;
	
	BookRepo br;
	User user;
	
	public Availblebook()
	{
		super("BOOK SEARCH - Window");
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		br = new BookRepo();
		user = new User();
		
		panel = new JPanel();
		panel.setLayout(null);
		
		//myfont = main
		myfont = new Font("Cooper Black", Font.PLAIN, 20);
		// myfont1 = label
		myfont1 = new Font("Constantia", Font.PLAIN, 15);
		
		label = new JLabel("SEARCH AVAILBLE BOOK");
		label.setBounds(330,20,400,30);
		label.setFont(myfont);
		panel.add(label);
		
		String data[][] = {{"", "", "", ""}};
		
		String head[] = {"BOOK ID", "BOOK NAME", "AUTHOR NAME", "EDITION"};
		
		booktable = new JTable(data,head);
		tablescroll = new JScrollPane(booktable);
		tablescroll.setBounds(450,50,400,250);
		booktable.setEnabled(false);
		panel.add(tablescroll);
		
		bookname = new JLabel("Book Name: ");
		bookname.setBounds(50,150,150,30);
		bookname.setFont(myfont1);
		panel.add(bookname);
		
		booknameTF = new JTextField();
		booknameTF.setBounds(200,150,180,30);
		panel.add(booknameTF);
		
		bookid = new JLabel("Book ID: ");
		bookid.setBounds(50,100,150,30);
		bookid.setFont(myfont1);
		panel.add(bookid);
		
		bookidTF = new JTextField();
		bookidTF.setBounds(200,100,180,30);
		panel.add(bookidTF);
		
		authorname = new JLabel("Author Name: ");
		authorname.setBounds(50,200,150,30);
		authorname.setFont(myfont1);
		panel.add(authorname);
		
		authornameTF = new JTextField();
		authornameTF.setBounds(200,200,180,30);
		panel.add(authornameTF);
		
		edition = new JLabel("Edition: ");
		edition.setBounds(50,250,150,30);
		edition.setFont(myfont1);
		panel.add(edition);
		
		editionTF = new JTextField();
		editionTF.setBounds(200,250,180,30);
		panel.add(editionTF);
		
		searchbtn = new JButton("Search");
		searchbtn.setBounds(100,300,200,30);
		searchbtn.addActionListener(this);
		panel.add(searchbtn);
		
		getallbtn = new JButton("All Available Books");
		getallbtn.setBounds(480,350,300,30);
		getallbtn.addActionListener(this);
		panel.add(getallbtn);
		
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
		
		logoutbtn = new JButton("LOG OUT");
		logoutbtn.setBounds(760,10,110,30);
		logoutbtn.addActionListener(this);
		panel.add(logoutbtn);
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(backbtn.getText()))
		{
			Libraian lb = new Libraian(user);
			lb.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(exitBtn.getText()))
		{
			System.exit(0);
		}
		else if(command.equals(getallbtn.getText()))
		{
			String data[][] = br.getAllBook();
			String head[] = {"BOOK ID", "BOOK NAME", "AUTHOR NAME", "EDITION"};
			
			panel.remove(tablescroll);
			
			booktable = new JTable(data,head);
			booktable.setEnabled(false);
			tablescroll = new JScrollPane(booktable);
			tablescroll.setBounds(450,50,400,250);
			panel.add(tablescroll);
			
		}
		else if(command.equals(searchbtn.getText()))
		{
			if(!bookidTF.getText().equals("") || !bookidTF.getText().equals(null))
			{
				Book b = br.SearchBook(bookidTF.getText());
				
				if(b!= null)
				{
					booknameTF.setText(b.getBookName());
					authornameTF.setText(b.getAuthorname());
					editionTF.setText(b.getEdition());
					
					bookidTF.setEnabled(false);
					booknameTF.setEnabled(true);
					authornameTF.setEnabled(true);
					editionTF.setEnabled(true);
				}
				else
				{
					JOptionPane.showMessageDialog(this,"BOOK NOT FOUND!!");
				}
			}
		}
		else if(command.equals(refreshbtn.getText()))
		{
			booknameTF.setText("");
			bookidTF.setText("");
			authornameTF.setText("");
			editionTF.setText("");
			
			bookidTF.setEnabled(true);
		}
		else if(command.equals(logoutbtn.getText()))
		{	
			Signinpage sign = new Signinpage();
			sign.setVisible(true);
			this.setVisible(false);
		}
	}
}