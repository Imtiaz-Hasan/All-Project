import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Burger b1 = new Burger();
		
		b1.setNumberOfPatties(2);
		b1.setPrice(240);
		b1.setName("Big King");
		
		System.out.println("B1 NumberOfPatties: "+b1.getNumberOfPatties());
		System.out.println("B1 Price: "+b1.getPrice());
		System.out.println("B1 Name: "+b1.getName());
		
		System.out.println("          Burger 1st Object");
		
		Burger b2 = new Burger(3,260,"Double Whopper");
		
		System.out.println("B2 NumberOfPatties: "+b2.getNumberOfPatties());
		System.out.println("B2 Price: "+b2.getPrice());
		System.out.println("B2 Name: "+b2.getName());
		
		System.out.println("          Burger 2nd Object");
		
		Pizza p1 = new Pizza();
		
		p1.setSize("9");
		p1.setPrice(800);
		p1.setName("BBQ Blast");
		
		System.out.println("P1 Size: "+p1.getSize());
		System.out.println("P1 Price: "+p1.getPrice());
		System.out.println("P1 Name: "+p1.getName());
		
		System.out.println("          Pizza 1st Object");
		
		Pizza p2 = new Pizza("9",800,"BBQ Blast");
		
		System.out.println("P2 Size: "+p2.getSize());
		System.out.println("P2 Price: "+p2.getPrice());
		System.out.println("P2 Name: "+p2.getName());
		
		System.out.println("          Pizza 2nd Object");
		
		
	}
}