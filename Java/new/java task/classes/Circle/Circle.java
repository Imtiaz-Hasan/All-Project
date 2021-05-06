package classes.Circle;
import java.lang.*;
import interfaces.*;
import classes.Shape.*;
// class keyword and class_name
//if we use public keyword the file_name.java has to be
// class body starts and ends with { }

public class Circle extends Shape {
	// within the class we can define instance variable
    private double radius;

    public Circle(){System.out.println(" Empty Circle");}   
    public Circle(double radius) {this.radius = radius;}
	public void setradius(double radius){this.radius = radius;}
	public double getradius(){return radius;}

    //Override
    public double area() { return 3.1416*getradius()*getradius(); }

    public void showDetails() {System.out.println("Circle area = "+area());}
}