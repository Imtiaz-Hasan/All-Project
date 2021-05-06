import java.lang.*;

public class FoodItem
{
	double price;
	
	String name;
	
	public FoodItem()
	{
		System.out.println("Empty-FoodItem");
	}
	
	public FoodItem(double price,String name)
	{
		System.out.println("Pera-FoodItem");
		this.price=price;
		this.name=name;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getPrice(){return price;}
	public String getName(){return name;}
	
	public void showDetails()
	{
		System.out.println("Price: "+price);
		System.out.println("Name: "+name);
	}
}