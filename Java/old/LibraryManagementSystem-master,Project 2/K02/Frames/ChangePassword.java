package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;

public class ChangePassword extends JFrame implements ActionListener, MouseListener
{
	JLabel main, userid, password;
	JButton updatebtn, backbtn, showbtn;
	JTextField useridTF;
	JPasswordField passwordTF;
	JPanel panel;
	Font myfont, myfont1;
	
	User user;
	UserRepo usr;
	
	public ChangePassword()
	{
		super("Change Password - WIndow");
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		user = new User();
		usr = new UserRepo();
		
		
		//myfont = main
		myfont = new Font("Cooper Black", Font.PLAIN, 20);
		// myfont1 = label
		myfont1 = new Font("Constantia", Font.PLAIN, 20);
		
		main =  new JLabel("CHANGE PASSWORD - WINDOW");
		main.setBounds(300,30,500,30);
		main.setFont(myfont);
		panel.add(main);
		
		userid = new JLabel("User ID: ");
		userid.setBounds(100,100,100,30);
		userid.setFont(myfont1);
		panel.add(userid);
		
		useridTF = new JTextField();
		useridTF.setBounds(200,100,150,30);
		panel.add(useridTF);
		
		password = new JLabel("Password: ");
		password.setBounds(100,150,100,30);
		password.setFont(myfont1);
		panel.add(password);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(200,150,150,30);
		passwordTF.setEchoChar('*');
		panel.add(passwordTF);
		
		showbtn = new JButton("Show");
		showbtn.setBounds(360,150,80,30);
		showbtn.addMouseListener(this);
		panel.add(showbtn);
		
		updatebtn = new JButton("Change Password");
		updatebtn.setBounds(100,300,200,30);
		updatebtn.addActionListener(this);
		panel.add(updatebtn);
		
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
			Libraian lb = new Libraian(user);
			lb.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(updatebtn.getText()))
		{
			User u = new User();
			
			u.setUserId(useridTF.getText());
			u.setPassword(passwordTF.getText());
			
			usr.updateUser(u);
			
			JOptionPane.showMessageDialog(this, "Password Change!!");
			
		}
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me)
	{
		passwordTF.setEchoChar((char)0);
	}
	public void mouseReleased(MouseEvent me)
	{
		passwordTF.setEchoChar('*');
	}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
}