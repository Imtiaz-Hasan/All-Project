package classes.Shape;
import java.lang.*;
import interfaces.*;
// class keyword and class_name
//if we use public keyword the file_name.java has to be
// class body starts and ends with { }
public abstract class Shape {// within the class we can define instance variable
    String typeOfShape;
    public abstract double area();
	public void setTypeofShape(String type){this.typeOfShape = type;}
	public String getTypeofShape(){return typeOfShape;}
    public abstract void showDetails();
}