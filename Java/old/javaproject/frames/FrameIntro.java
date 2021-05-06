package frames;


import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FrameIntro extends JFrame implements MouseListener, ActionListener
{
	ImageIcon img;
	JLabel userLabel, userLabel1, userLabel2,userLabel3;
	JTextField userTF;
	JPasswordField passPF;
	JButton loginBtn, exitBtn;
	JRadioButton r1, r2, r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
	JCheckBox c1, c2, c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
	ButtonGroup bg1;
	JComboBox combo;
	JPanel panel;
	Color myColor;
	Font myFont;

	public FrameIntro()
	{
		super("My First GUI");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myColor = new Color(210, 230, 135);
		myFont = new Font("Cambria", Font.PLAIN, 28);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		userLabel = new JLabel("PIZZA : ");
		userLabel.setBounds(50,50, 160, 30);
		userLabel.setBackground(Color.BLUE);
		userLabel.setOpaque(true);
		userLabel.setForeground(Color.BLACK);
		userLabel.setFont(myFont);
		panel.add(userLabel);
		
		
		c1 = new JCheckBox("BBQ Pizza");
		c1.setBounds(50, 90, 100, 20);
		panel.add(c1);
		
		c2 = new JCheckBox("SeaFood Pizza");
		c2.setBounds(50, 120, 100, 20);
		panel.add(c2);
		
		c3 = new JCheckBox("Barselona Pizza");
		c3.setBounds(50, 150, 100, 20);
		panel.add(c3);
		
		
		userLabel1 = new JLabel("BURGER: ");
		userLabel1.setBounds(220,50, 160, 30);
		userLabel1.setBackground(Color.BLUE);
		userLabel1.setOpaque(true);
		userLabel1.setForeground(Color.BLACK);
		userLabel1.setFont(myFont);
		panel.add(userLabel1);
		
		
		c4 = new JCheckBox("Chicken Burger");
		c4.setBounds(220, 90, 100, 20);
		panel.add(c4);
		
		c5 = new JCheckBox("Naga Burger");
		c5.setBounds(220, 120, 100, 20);
		panel.add(c5);
		
		c6 = new JCheckBox("Sub Burger");
		c6.setBounds(220, 150, 100, 20);
		panel.add(c6);
		
		userLabel2 = new JLabel("PASTA: ");
		userLabel2.setBounds(390,50, 160, 30);
		userLabel2.setBackground(Color.BLUE);
		userLabel2.setOpaque(true);
		userLabel2.setForeground(Color.BLACK);
		userLabel2.setFont(myFont);
		panel.add(userLabel2);
		
		
		c7 = new JCheckBox("Alfredo Pasta");
		c7.setBounds(390, 90, 100, 20);
		panel.add(c7);
		
		c8 = new JCheckBox("Meatball Pasta");
		c8.setBounds(390, 120, 100, 20);
		panel.add(c8);
		
		c9 = new JCheckBox("Saussage Pasta");
		c9.setBounds(390, 150, 100, 20);
		panel.add(c9);
		
		
		
		userLabel3 = new JLabel("BEVERAGES: ");
		userLabel3.setBounds(560,50, 160, 30);
		userLabel3.setBackground(Color.BLUE);
		userLabel3.setOpaque(true);
		userLabel3.setForeground(Color.BLACK);
		userLabel3.setFont(myFont);
		panel.add(userLabel3);
		
		
		c10 = new JCheckBox("Alfredo Pasta");
		c10.setBounds(560, 90, 100, 20);
		panel.add(c10);
		
		c11 = new JCheckBox("Meatball Pasta");
		c11.setBounds(560, 120, 100, 20);
		panel.add(c11);
		
		c12 = new JCheckBox("Saussage Pasta");
		c12.setBounds(560, 150, 100, 20);
		panel.add(c12);
		
		r1 = new JRadioButton("1");
		r1.setBounds(170, 90, 50, 20);
		r1.setOpaque(false);
		panel.add(r1);
		
		r2 = new JRadioButton("2");
		r2.setBounds(170, 120, 50, 20);
		r2.setOpaque(false);
		panel.add(r2);
		
		r3 = new JRadioButton("3");
		r3.setBounds(170, 150,50, 20);
		r3.setOpaque(false);
		panel.add(r3);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(180, 225, 80, 30);
		loginBtn.setBackground(Color.GREEN);
		loginBtn.addMouseListener(this);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(300, 225, 80, 30);
		exitBtn.setBackground(Color.RED);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		
		
		this.add(panel);
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.BLUE);
			loginBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.BLUE);
			exitBtn.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.GREEN);
			loginBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(loginBtn.getText().equals(command))
		{
			//JOptionPane.showMessageDialog(this, "Hello");
			String s1 = "";
			String s2 = "";
			String s3 ="", s4="";
			
			if(r1.isSelected())
			{
				s1 = r1.getText();
			}
			else if(r2.isSelected())
			{
				s1 = r2.getText();
			}
			else if(r3.isSelected())
			{
				s1 = r3.getText();
			}
			else
			{
				
			}
				
			if(c1.isSelected())
			{
				s2 = c1.getText();
			}
			else if(c2.isSelected())
			{
				s2 = c2.getText();
			}
			else if(c3.isSelected())
			{
				s2 = c3.getText();
			}
			else
			{
				
			}
			
			//String s5 = combo.getSelectedItem().toString();
			
			SecondFrame sf = new SecondFrame(s1,s2,s3,s4, this);
			sf.setVisible(true);
			this.setVisible(false);
			
		}
		else if(exitBtn.getText().equals(command))
		{
			System.exit(0);
		}
		else
		{
			
		}
	}
	
	
	
	
	
	
	
	
}