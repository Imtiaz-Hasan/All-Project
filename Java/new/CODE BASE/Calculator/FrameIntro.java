import java.lang.*;//The package java. lang contains classes and interfaces that are essential to the Java language.
import javax.swing.*;//In javax.swing package and its sub-packages, swing classes are described.
import java.awt.*;//Package java.awt. Contains all of the classes for creating user interfaces and for painting graphics and images.
import java.awt.event.*;//The java.awt.event package provides many event classes and Listener interfaces for event handling.

public class FrameIntro  extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel label;
	JTextField resultTextField;
	JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnMul,btnDiv,btnSub,btnEq,btnClr;
	Double operand1, operand2, result; 
	String operation; 
	
	//Frame
	public FrameIntro()
	{
		super("My First GUI");
		this.setSize(300, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	  	panel = new JPanel();
		panel.setLayout(null);
				
		label = new JLabel("Calculator");//label
		label.setBounds(25, 0, 100, 30);
		panel.add(label);
		
		//Switch
		resultTextField = new JTextField();
		resultTextField.setBounds(20, 30, 250, 60);
		panel.add(resultTextField);
		
		btn0 = new JButton("0");
		btn0.setBounds(20, 280, 100, 50);
		btn0.addActionListener(this);
		panel.add(btn0);
		
		btn1 = new JButton("1");
		btn1.setBounds(20, 220, 50, 50);
		btn1.addActionListener(this);
		panel.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(80, 220, 50, 50);
		btn2.addActionListener(this);
		panel.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(140, 220, 50, 50);
		btn3.addActionListener(this);
		panel.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBounds(20, 160, 50, 50);
		btn4.addActionListener(this);
		panel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(80, 160, 50, 50);
		btn5.addActionListener(this);
		panel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(140, 160, 50, 50);
		btn6.addActionListener(this);
		panel.add(btn6);
		
		
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
		
			
		//Addition
		btnAdd = new JButton("+");
		btnAdd.setBounds(200, 100, 50, 30);
		btnAdd.addActionListener(this);
		panel.add(btnAdd);
		//Substraction
		btnSub = new JButton("-");
		btnSub.setBounds(200, 140, 50, 30);
		btnSub.addActionListener(this);
		panel.add(btnSub);
		//Multiplication
		btnMul = new JButton("*");
		btnMul.setBounds(200, 180, 50, 30);
		btnMul.addActionListener(this);
		panel.add(btnMul);
		//Divition
		btnDiv = new JButton("/");
		btnDiv.setBounds(200, 220, 50, 30);
		btnDiv.addActionListener(this);
		panel.add(btnDiv);
		
        //Answer
		btnEq = new JButton("=");
		btnEq.setBounds(200, 280, 50, 50);
		btnEq.addActionListener(this);
		panel.add(btnEq);
		
		//Clear
		btnClr = new JButton("AC");
		btnClr.setBounds(140, 280, 50, 50);
		btnClr.addActionListener(this);
		panel.add(btnClr);
		
		this.add(panel);  
	
	}
	
	
	
	 public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
			
		// Number Buttons
		if(btn0.getText().equals(command)
		|| btn1.getText().equals(command)
		|| btn2.getText().equals(command)
		|| btn3.getText().equals(command)
		|| btn4.getText().equals(command)
		|| btn5.getText().equals(command)
		|| btn6.getText().equals(command)
		|| btn7.getText().equals(command)
		|| btn8.getText().equals(command)
		|| btn9.getText().equals(command)
		)
		{
			resultTextField.setText(resultTextField.getText()+command);
		}
		// Arithmatic Buttons
		else if(btnAdd.getText().equals(command)
	 		 || btnSub.getText().equals(command)
		     || btnDiv.getText().equals(command)
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
			
			else if(operation.equals("-")){
			result = operand1-operand2;
			}
			
			else if(operation.equals("/")){
			result = operand1/operand2;
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