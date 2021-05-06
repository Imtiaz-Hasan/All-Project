package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondFrame extends JFrame implements ActionListener
{
	JLabel label,userLabel, passLabel;
	JButton backBtn,logoutBtn; 
	JPanel panel;
	FrameIntro fi;
	
	public SecondFrame(String s1, String s2, String s3, String s4,  FrameIntro fi)
	{
		super("Second GUI");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.fi = fi;
		
		panel = new JPanel();
		panel.setLayout(null);
		
		label = new JLabel(" "+s2+"             "+s1+" "+s3+" "+s4+"");
		label.setBounds(50,50,300,30);
		label.setBackground(Color.CYAN);
		label.setOpaque(true);
		panel.add(label);
		
		passLabel = new JLabel("Selected Item: ");
		passLabel.setBounds(50, 10, 100, 30);
		panel.add(passLabel);
		
		userLabel = new JLabel("Quantity: ");
		userLabel.setBounds(250, 10, 60, 30);
		panel.add(userLabel);
		
		logoutBtn = new JButton("Logout");
		logoutBtn.setBounds(250, 250, 80, 30);
		logoutBtn.addActionListener(this);
		panel.add(logoutBtn);
		
		
		backBtn = new JButton("Back");
		backBtn.setBounds(350, 250,80, 30);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		/*btnOne = new JButton("1");
		btnOne.setBounds(250, 250,80, 30);
		btnOne.addActionListener(this);
		panel.add(btnOne);
		
		btnTwo = new JButton("2");
		btnTwo.setBounds(350, 250,80, 30);
		btnTwo.addActionListener(this);
		panel.add(btnTwo);
		
		btnClear = new JButton("Clear");
		btnClear.setBounds(450, 250,80, 30);
		btnClear.addActionListener(this);
		panel.add(btnClear);*/
		
		
		this.add(panel);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(backBtn.getText().equals(command))
		{
			//FrameIntro fi = new FrameIntro();
			fi.setVisible(true);
			this.setVisible(false);
		}
		/*else if(btnOne.getText().equals(command))
		{
			//label.setText(label.getText()+btnOne.getText());
			String text = label.getText() + btnOne.getText();
			label.setText(text);
		}
		else if(btnTwo.getText().equals(command))
		{
			String text = label.getText() + btnTwo.getText();
			label.setText(text);
		}
		else if(btnClear.getText().equals(command))
		{
			label.setText("");
		}*/
		else
		{
			
		}
	}
}
