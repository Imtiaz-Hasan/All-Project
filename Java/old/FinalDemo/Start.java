import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		FinalDemo fd1 = new FinalDemo();
		
		//fd1.setI(10);
		System.out.println(fd1.getI());
		
		FinalDemo fd2 = new FinalDemo(200);
		System.out.println(fd2.getI());
		
		
		MyClass mc = new MyClass();
		mc.show();
		
	}
}