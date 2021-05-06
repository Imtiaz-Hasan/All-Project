import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameIntro  extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel label;
	JTextField resultTextField;
	JButton btn7,btn8,btn9,btnAdd,btnMul,btnEq,btnClr;
	Double operand1, operand2, result; 
	String operation; 
	
	
	public FrameIntro()
	{
		super("My First GUI");
		this.setSize(300, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //akdom close korae jonno 
		
	  	panel = new JPanel();
		panel.setLayout(null);
				
		label = new JLabel("Calculator");
		label.setBounds(25, 0, 100, 30);
		panel.add(label);
		
		
		resultTextField = new JTextField();
		resultTextField.setBounds(20, 30, 250, 60);
		panel.add(resultTextField);
		
		
		btn7 = new JButton("7");
		btn7.setBounds(20, 100, 50, 50);
		btn7.addActionListener(this);
		panel.add(btn7);
		
		
		btn8 = new JButton("8");
		btn8.setBounds(80, 100, 50, 50);
		btn8.addActionListener(this);
		panel.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(140, 100, 50, 50);
		btn9.addActionListener(this);
		panel.add(btn9);
		
			
		
		btnAdd = new JButton("+");
		btnAdd.setBounds(200, 100, 50, 50);
		btnAdd.addActionListener(this);
		panel.add(btnAdd);
		
		btnMul = new JButton("*");
		btnMul.setBounds(200, 160, 50, 50);
		btnMul.addActionListener(this);
		panel.add(btnMul);
		
		btnEq = new JButton("=");
		btnEq.setBounds(200, 280, 50, 50);
		btnEq.addActionListener(this);
		panel.add(btnEq);
		
		
		btnClr = new JButton("AC");
		btnClr.setBounds(150, 280, 50, 50);
		btnClr.addActionListener(this);
		panel.add(btnClr);
		
		this.add(panel);  
	
	}
	
	
	
	 public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
			
		// Number Buttons
		if(btn7.getText().equals(command)
		|| btn8.getText().equals(command)
		|| btn9.getText().equals(command)
		)
		{
			resultTextField.setText(resultTextField.getText()+command);
		}
		// Arithmatic Buttons
		else if(btnAdd.getText().equals(command)
	 		 || btnMul.getText().equals(command)
			)
		{
			operand1=Double.parseDouble(resultTextField.getText());
			operation = command;
			resultTextField.setText("");
		}
		else if(btnEq.getText().equals(command)){
			operand2 = Double.parseDouble(resultTextField.getText());
			
			if(operation.equals("+")){
			result = operand1+operand2;
			}
			
			else if(operation.equals("*")){
			result = operand1*operand2;
			}
			operand1=result;	
			resultTextField.setText(""+result);
		}
		else if(btnClr.getText().equals(command)){
			resultTextField.setText("");
			operand1=null;
			operand2=null;
			result=null;
			operation=null;
		}
		
	}  
	
}