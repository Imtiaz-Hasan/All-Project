package classes.Rectangle;
import java.lang.*;
import interfaces.*;
import classes.Shape.*;

// class keyword and class_name
//if we use public keyword the file_name.java has to be
// class body starts and ends with { }
public class Rectangle extends Shape {
	// within the class we can define instance variable
    private double length;
	private double width;

    public Rectangle() {System.out.println("Empty Rectangle");}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;}
	
	
	public void setwidth(double width){this.width = width;}
	
	public void setlength(double length){this.length = length;}
	
	public double getwidth(){return width;}
	
	public double getlength(){return length;}

   
    public double area() { return getwidth()* getlength();} //Override

    
    public void showDetails() {System.out.println("Rectangle area = "+area());}

}