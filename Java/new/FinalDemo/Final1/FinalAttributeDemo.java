import java.lang.*;

public class FinalAttributeDemo
{
	final double pi=3.1416;

	
	public FinalAttributeDemo()
	{
		//pi=10;
	}
	public FinalAttributeDemo(int p)
	{
		//this.pi = p;
	}
	
	
	public double getPi(){return pi;}
	public void Show(){
		System.out.println(pi);
	}
}