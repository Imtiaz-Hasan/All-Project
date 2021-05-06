package interfaces;
import java.lang.*;
import classes.Shape.*;
// class keyword and class_name
//if we use public keyword the file_name.java has to be


//interface IShapeSearch{Shape getShapeByTypeOfShape(String typeOfShape);}
public interface IShapeOperation{
	public abstract void insertShape(Shape s);
	void removeShape(Shape s);
	void showAllShapes();
}