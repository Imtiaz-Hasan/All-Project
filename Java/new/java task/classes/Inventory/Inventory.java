package classes.Inventory;
import java.lang.*;
import interfaces.*;
import classes.Shape.*;
import java.lang.*;
// class keyword and class_name
//if we use public keyword the file_name.java has to be
// class body starts and ends with { }

public class Inventory implements IShapeOperation// within the class we can define instance variable
{
	Shape shapes[];
	static int numberOfShapes=0;
	
	public Inventory(){}
	public Inventory(int sizeOfInventory){shapes = new Shape[sizeOfInventory];}
	public void insertShape(Shape s){
		numberOfShapes++;
		int flag = 0;
		for(int i=0; i<shapes.length; i++){
			if(shapes[i] == null)
			{
				shapes[i] = s;
				flag =1;
				break;}
		}
		if(flag == 1){System.out.println("Inserted");}
		else {System.out.println("Can't Insert");}
	}

	public void removeShape(Shape s){
		numberOfShapes--;
		int flag =0;
		for(int i=0; i<shapes.length; i++){
			if(shapes[i] == s){
				shapes[i] = null;
				flag =1;
				break;
			}
		}
		if(flag==1){System.out.println("Removed");}
		else{System.out.println("Can't remove");}
	}
	
	
	public void showAllShapes(){
		for(int i=0; i<shapes.length; i++){
			if(shapes[i] != null)
			{
				System.out.println("     "+(i+1)+"");
				shapes[i].showDetails();}
		}
		System.out.println("Total Number Of Shape= "+numberOfShapes);
	}
	
	public void showShapesByType(String type){
		int flag = 0;
		for(int i=0; i<shapes.length; i++){
			if(shapes[i] != null){
			if(shapes[i].getTypeofShape().equals(type)){
				shapes[i].showDetails();
				flag=1;}
			}
		}
		if(flag==1){System.out.println("Found");}
	    else{System.out.println("Not Found");}
	}
}