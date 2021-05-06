public class Box{
	// access_modifiers dataType variableName --> instance variableName
	//an instance variable must be declared inside a class but outside of any method.
	private double length;//instance variable
	private double width;//instance variable
	private double height;//instance variable
	// This is a class variable that counts number of Box's
	public static double BoxCount;
	// This is a static block. it is used to initialize static variables
	static{
		BoxCount = 0;
	}

	
	//We can use constructor to set default values to our properties
	// Constructor is a special type of method
	// Constructor does not have any return type
	// We can have multiple constructor in a single class, it is called constructor overloading
	
	// Default Constructor does not have any parameter
	public Box(){
		BoxCount++;
	}

	// parameterized constructor
	public Box(double l,double w,double h){
		length = l;
		width = w;
		height = h;
		BoxCount++;
	}
	
	
	
	// we can use public methods to access private instance variable
	// setter Methods for Box properties
	// we use setter methods to set values of private instance variables on our demand
	// we also call them instance method
	public void setLength(double l){
		length = l;
	}
	public void setWidth(double w){
		width = w;
	}
	public void setHeight(double h){
		height = h;
	}
	
	public void setDimension(double l, double w, double h){
		length = l;
		width = w;
		height = h;
	}
	
	// getter methods
	// we use getter methods to get values of private instance variables on our demand
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	
	// method to calculate volume of Box
	public double getVolume(){
		double v = length*width*height;
		return v;
	}
	
	//show method helps us to show information
	public void showBox(){
		System.out.println("Length: "+length);
		System.out.println("Width: "+ width);
		System.out.println("Height: "+ height);
	}
	
	// here we declare our main methods to test our class
	public static void main(String [] args){

		// here we have created an object by calling the default constructor
		Box b = new Box(); // new Box() creates a new object
						   // then we assign the address of that object
						   // to a Box type variable.
		
		//setting properties of Box type object b
		b.setLength(5);
		b.setWidth(10);
		b.setHeight(7);
		b.showBox();

		//setting properties of another Box type object b		
		Box b1 = new Box();
		b1.setDimension(4,4,4);
		b1.showBox();
		
		
		System.out.println("Volume of b: "+b.getVolume());
		System.out.println("Volume of b1: "+b1.getVolume());
		
		
		// useing parameterized constructor to created an object
		
		Box bp = new Box(6,6,6);
		bp.setWidth(7);
		bp.showBox();
		
		// Regardless of which object we use to access class/static variable
		// we access the only one copy of that varible.
		// Which is shared among all object.
		System.out.println("Box Count :"+ b.BoxCount);
		System.out.println("Box Count :"+ b1.BoxCount);
		System.out.println("Box Count :"+ bp.BoxCount);
		
		// Class/static variable belongs to a Class not to a specific object
		// Class variable is created at the time of loading class.
		// we can use class name to access class/static variable.
		System.out.println("Box Count :"+ Box.BoxCount);
		
		System.out.println("Box Count :"+ (new Box()).BoxCount);
				
	}

}