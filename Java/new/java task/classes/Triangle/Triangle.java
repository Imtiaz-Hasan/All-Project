package classes.Triangle;
import java.lang.*;
import interfaces.*;
import classes.Shape.*;

// class keyword and class_name
//if we use public keyword the file_name.java has to be
// class body starts and ends with { }
public class Triangle extends Shape {// within the class we can define instance variable
    private double base;
	private double height;

    public Triangle() {System.out.println("Empty Triangle");}
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;}
	public void setbase(double base){this.base = base;}
	public void setheight(double height){this.height = height;}
	public double getbase(){return base;}
	public double getheight(){return height;}

  
    public double area() {return 0.5*getbase()*getheight();}//triangle rules

    
    public void showDetails() {System.out.println("Triangle area = "+area());}
}