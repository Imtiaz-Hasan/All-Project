import java.lang.*;

public class Burger extends FoodItem
{
	int numberOfPatties;
	
	public Burger()
	{
		System.out.println("Empty-Burger");
	}
	
	public Burger(int numberOfPatties, double price, String name)
	{
		super(price,name);
		this.numberOfPatties = numberOfPatties;
		System.out.println("Pera-Burger");
	}
	public void setNumberOfPatties(int numberOfPatties)
	{
		this.numberOfPatties=numberOfPatties;
	}
	public int getNumberOfPatties( ){return numberOfPatties;}
	
	
}