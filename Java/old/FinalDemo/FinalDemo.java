import java.lang.*;

public final class FinalDemo
{
	private final int i;
	
	public FinalDemo(){this.i = 20;}
	public FinalDemo(int i){ this.i = i;}
	
	//public void setI(int i){this.i = i;}
	public int getI(){return i;}
	
	public /*final*/ void show(){System.out.println("FD-Show");}
}