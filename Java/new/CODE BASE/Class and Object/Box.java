// class keyword and class_name
// public keyword is optional
//if we use public keyword the file_name.java has to be
//as same as class_name.
// class body starts and ends with { }
public class Box
{
	// within the class we can define instance variable
	// access_modifier dataType variable_name
	private double length;
	private double width;
	private double height;
	
	// Constructor for Box class
	//Access_modifier No_returnType Constructor_name is as same as Clas_name
	//Constructor may or may not have parameter
	//Constructor is an spacial type of method
	// Constructor is called automatically at the time of creating objects
	public Box(){
		//let us consider default value is 0.5
		length=0.5;
		width=0.5;
		height=0.5;
	}
	
	
	// instance method
	// access_modifier returnType method_name(dataType pramater) 
	
	// Setter Methods for setting values to instance variable
	public void setLength(double l){
	//method body
		length = l;
	}
	public void setWidth(double w){
	//method body
		width = w;
	}
	public void setHeight(double h){
	//method body
		height = h;
	}
	// setting all the dimensions at once.
	public void setDimension(double l, double w, double h){
		length=l;
		width=w;
		height=h;
	}
	
	//Getter Method for getting values from instance variable
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}	
	public double getHeight(){
		return height;
	}

	// get volume of the box
	public double getVolume(){
		return length*width*height;
	}
	
	public static void main(String[] args){
		
	//Now we have to create objects of Box class
	//Class_name variable_name = new Clas_name()
	Box b1 = new Box();
	
	b1.setLength(5.5); // invoking the instance method
	b1.setWidth(4.5);  //invoking the instance method
	b1.setHeight(3.5); // invoking the instance method
	
	System.out.println("Volume = "+ b1.getVolume());
	
	Box b3 = new Box();
	System.out.println("Volume = "+ b3.getVolume());
	
	
	
	/*
	Box b2=null;
	
	b2 = new Box();
	
	if(b2==null){
	System.out.println("B2 is null");
	}
	*/
	}
	
	
}





