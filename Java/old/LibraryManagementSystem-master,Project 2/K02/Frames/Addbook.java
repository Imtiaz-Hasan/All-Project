package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import entity.*;
import repository.*;

public class Addbook extends JFrame implements ActionListener
{
	JLabel label,bookname, bookid, authorname, edition, note;
	JTextField booknameTF, bookidTF, authornameTF, editionTF;
	JButton addbtn, backbtn, exitBtn, getallbtn, removebtn, logoutbtn;
	JTable booktable;
	JScrollPane tablescroll;
	JPanel panel;
	Font myfont,myfont1,myfont2;
	Color mycolor;
	
	BookRepo br;
	User user;
	
	public Addbook()
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
		//myfont2 = note;
		myfont2 = new Font("Constantia", Font.PLAIN, 12);
		
		mycolor = new Color(255,0,0);
		
		label = new JLabel("ADD BOOK TO LIBRARY");
		label.setBounds(350,20,400,30);
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
		
		bookid = new JLabel("BOOK ID: ");
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
		
		addbtn = new JButton("ADD");
		addbtn.setBounds(100,300,100,30);
		addbtn.addActionListener(this);
		panel.add(addbtn);
		
		removebtn = new JButton("REMOVE");
		removebtn.setBounds(250,300,100,30);
		removebtn.addActionListener(this);
		panel.add(removebtn);
		
		getallbtn = new JButton("All Available Books");
		getallbtn.setBounds(480,350,300,30);
		getallbtn.addActionListener(this);
		panel.add(getallbtn);
		
		backbtn = new JButton("BACK");
		backbtn.setBounds(10,10,100,35);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		logoutbtn = new JButton("LOG OUT");
		logoutbtn.setBounds(760,10,110,30);
		logoutbtn.addActionListener(this);
		panel.add(logoutbtn);
		
		note = new JLabel("*Note: Please only enter book id for remove any book.");
		note.setBounds(70,390,800,30);
		note.setFont(myfont2);
		note.setForeground(mycolor);
		panel.add(note);
		
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
		else if(command.equals(addbtn.getText()))
		{
			Book b = new Book();
			
			b.setBookId(bookidTF.getText());
			b.setBookName(booknameTF.getText());
			b.setAuthorName(authornameTF.getText());
			b.setEdition(editionTF.getText());
			
			br.insertBook(b);
			
			JOptionPane.showMessageDialog(this, "BOOK ADDED");
			
			bookidTF.setText("");
			booknameTF.setText("");
			authornameTF.setText("");
			editionTF.setText("");
		}
		else if(command.equals(removebtn.getText()))
		{
			br.deleteBook(bookidTF.getText());

			JOptionPane.showMessageDialog(this,"Deleted");
			
			bookidTF.setText("");
			booknameTF.setText("");
			authornameTF.setText("");
			editionTF.setText("");
		}
		else if(command.equals(logoutbtn.getText()))
		{	
			Signinpage sign = new Signinpage();
			sign.setVisible(true);
			this.setVisible(false);
		}
	}
}