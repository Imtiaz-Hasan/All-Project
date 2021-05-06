import java.lang.*;

public class Pizza extends FoodItem
{
	String size;
	
	public Pizza()
	{
		System.out.println("Empty-Pizza");
	}
	
	public Pizza(String size, double price, String name)
	{
		super(price,name);
		
		this.size = size;
		System.out.println("Pera-Pizza");
	}
	public void setSize(String size)
	{
		this.size=size;
	}
	public String getSize(){return size;}
	
	
}