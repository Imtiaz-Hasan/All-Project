package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import entity.*;
import repository.*;

public class SearchFrame extends JFrame implements ActionListener
{
	JLabel label;
	JButton backbtn, exitBtn, getallbtn;
	JTable booktable;
	JScrollPane tablescroll;
	JPanel panel;
	Font myfont,myfont1;
	
	Book book;
	BookRepo br;
	
	public SearchFrame(Book book)
	{
		super("BOOK SEARCH - Window");
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.book = book;
		
		br = new BookRepo();
		
		panel = new JPanel();
		panel.setLayout(null);
		
		//myfont = main
		myfont = new Font("Cooper Black", Font.PLAIN, 20);
		// myfont1 = label
		myfont1 = new Font("Constantia", Font.PLAIN, 15);
		
		label = new JLabel("SEARCH YOUR FAVOURITE BOOK");
		label.setBounds(270,20,400,30);
		label.setFont(myfont);
		panel.add(label);
		
		String data[][] = {{"", "", "", ""}};
		
		String head[] = {"BOOK ID", "BOOK NAME", "AUTHOR NAME", "EDITION"};
		
		booktable = new JTable(data,head);
		tablescroll = new JScrollPane(booktable);
		tablescroll.setBounds(50,50,790,300);
		booktable.setEnabled(false);
		panel.add(tablescroll);
		
		getallbtn = new JButton("All Available Books");
		getallbtn.setBounds(300,390,300,30);
		getallbtn.addActionListener(this);
		panel.add(getallbtn);
		
		
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
		
		else if(command.equals(getallbtn.getText()))
		{
			String data[][] = br.getAllBook();
			String head[] = {"BOOK ID", "BOOK NAME", "AUTHOR NAME", "EDITION"};
			
			panel.remove(tablescroll);
			
			booktable = new JTable(data,head);
			booktable.setEnabled(false);
			tablescroll = new JScrollPane(booktable);
			tablescroll.setBounds(50,50,790,300);
			panel.add(tablescroll);
			
			panel.revalidate();
			panel.repaint();
			
		}
		
	}
}