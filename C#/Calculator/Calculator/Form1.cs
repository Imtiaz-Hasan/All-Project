using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculator
{
    public partial class Form1 : Form
    {
        private double compiler = 0;
        private char Operation;

        public Form1()
        {
            InitializeComponent();
        }

        private void User_Pressed(object sender, EventArgs e)
        {
            char operation = (sender as Button).Text[0];
            if (operation == 'C')
            {
                compiler = 0;
            }
            else
            {
                double currentValue = double.Parse(Display.Text);
                switch (Operation)
                {
                    case '+': compiler += currentValue; break;
                    case '-': compiler -= currentValue; break;
                    case '×': compiler *= currentValue; break;
                    case '÷': compiler /= currentValue; break;
                    default: compiler = currentValue; break;
                }
            }

            Operation = operation;
            Display.Text = operation == '=' ? compiler.ToString() : "0";
        }

        private void Number_Pressed(object sender, EventArgs e)
        {
           
            string number = (sender as Button).Text;
            Display.Text = Display.Text == "0" ? number : Display.Text + number;
        }

       

        

    }
}
