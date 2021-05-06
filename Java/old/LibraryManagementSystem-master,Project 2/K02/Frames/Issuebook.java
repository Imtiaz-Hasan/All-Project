package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;

public class Issuebook extends JFrame implements ActionListener
{
	JLabel label, studentid, book, studentname;
	JTextField studentidTF, bookTF, studentnameTF;
	JPanel panel;
	JButton updatebtn, backbtn, load, getallbtn, memberbtn, refreshbtn, logoutbtn;
	Font myfont, myfont1;
	JTable booktable, membertable;
	JScrollPane tablescroll, memberscrl;
	
	BookRepo br;
	User user;
	StudentRepo stu;
	
	public Issuebook()
	{
		super("Issue Book - Window");
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		br = new BookRepo();
		user = new User();
		stu = new StudentRepo();
		
		panel = new JPanel();
		panel.setLayout(null);
		
		//myfont = main
		myfont = new Font("Cooper Black", Font.PLAIN, 20);
		// myfont1 = label
		myfont1 = new Font("Constantia", Font.PLAIN, 15);
		
		label = new JLabel("ISSUE BOOK FOR USER");
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
		
		String data1[][] = {{"", "", ""}};
		
		String head1[] = {"NAME", "LIBRARY ID","BOOK ID"};
		
		membertable = new JTable(data1,head1);
		memberscrl = new JScrollPane(membertable);
		memberscrl.setBounds(50,50,350,200);
		membertable.setEnabled(false);
		panel.add(memberscrl);
		
		memberbtn = new JButton("LOAD");
		memberbtn.setBounds(170,258,100,30);
		memberbtn.addActionListener(this);
		panel.add(memberbtn);
		
		studentname = new JLabel("Name: ");
		studentname.setBounds(50,300,80,30);
		studentname.setFont(myfont1);
		panel.add(studentname);
		
		studentnameTF = new JTextField();
		studentnameTF.setBounds(150,300,150,30);
		panel.add(studentnameTF);
		
		studentid = new JLabel("ID: ");
		studentid.setBounds(50,350,60,30);
		studentid.setFont(myfont1);
		panel.add(studentid);
		
		
		studentidTF = new JTextField();
		studentidTF.setBounds(110,350,50,30);
		panel.add(studentidTF);
		
		
		book = new JLabel ("Book ID: ");
		book.setBounds(190,350,90,30);
		book.setFont(myfont1);
		panel.add(book);
		
		bookTF = new JTextField();
		bookTF.setBounds(280,350,60,30);
		panel.add(bookTF);
		
		load = new JButton("LOAD INFO");
		load.setBounds(100,400,100,30);
		load.addActionListener(this);
		panel.add(load);
		
		updatebtn = new JButton("ADD BOOK");
		updatebtn.setBounds(250,400,100,30);
		updatebtn.addActionListener(this);
		panel.add(updatebtn);
		
		refreshbtn = new JButton("Refresh");
		refreshbtn.setBounds(130,10,100,35);
		refreshbtn.addActionListener(this);
		panel.add(refreshbtn);
		
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
			String head[] = {"BOOK NAME", "BOOK ID", "AUTHOR NAME", "EDITION"};
			
			panel.remove(tablescroll);
			
			booktable = new JTable(data,head);
			booktable.setEnabled(false);
			tablescroll = new JScrollPane(booktable);
			tablescroll.setBounds(450,50,400,250);
			panel.add(tablescroll);
			
			panel.revalidate();
			panel.repaint();
			
		}
		else if(command.equals(memberbtn.getText()))
		{
			String data1[][] = stu.getallstudent();
			String head1[] = {"NAME", "LIBRARY ID", "BOOK ID"};
			
			panel.remove(memberscrl);
			
			membertable = new JTable(data1,head1);
			membertable.setEnabled(false);
			memberscrl = new JScrollPane(membertable);
			memberscrl.setBounds(50,50,350,200);
			panel.add(memberscrl);
			
			panel.revalidate();
			panel.repaint();
		}
		else if(command.equals(load.getText()))
		{
			if(!studentidTF.getText().equals("") || !studentidTF.getText().equals(null))
			{
				Student s = stu.searchStudent(studentidTF.getText());
				
				if(s!= null)
				{
					studentnameTF.setText(s.getstudentName());
					bookTF.setText(s.getBookID());
					
					studentidTF.setEnabled(false);
					studentnameTF.setEnabled(false);
				}
				else
				{
					JOptionPane.showMessageDialog(this,"BOOK OR ID NOT FOUND!!");
				}
			}
		}
		else if(command.equals(refreshbtn.getText()))
		{
			studentnameTF.setText("");
			studentidTF.setText("");
			bookTF.setText("");
			
			studentnameTF.setEnabled(true);
			studentidTF.setEnabled(true);
			bookTF.setEnabled(true);
		}
		
		else if(command.equals(updatebtn.getText()))
		{
			Student st = new Student();
			
			st.setstudentName(studentnameTF.getText());
			st.setLibraryID(studentidTF.getText());
			st.setBookID(bookTF.getText());
			
		
			stu.issueBook(st);
			
			JOptionPane.showMessageDialog(this, "Updated");
		
			studentnameTF.setText("");
			studentidTF.setText("");
			bookTF.setText("");
			
			studentnameTF.setEnabled(true);
			studentidTF.setEnabled(true);
			bookTF.setEnabled(true);
		}
		else if(command.equals(logoutbtn.getText()))
		{	
			Signinpage sign = new Signinpage();
			sign.setVisible(true);
			this.setVisible(false);
		}
	}
}