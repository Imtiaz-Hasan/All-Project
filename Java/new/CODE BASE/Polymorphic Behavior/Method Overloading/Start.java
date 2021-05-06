class TestMethodOverload{
	public void show(){System.out.println();}
	public void show(int a){System.out.println(a);}
	public void show(double a){System.out.println(a);}
	public void show(int a,int b){System.out.println(a+""+b);}
	public void show(double a, double b){System.out.println(a+""+b);}
	public void show(int a, double b){System.out.println(a+""+b);}
	//public int show(int a, double b){System.out.println(a+""+b);return 0;}
}
public class Start{  
	public static void main(String args[]){  
		TestMethodOverload tmo = new TestMethodOverload();
		tmo.show();
		tmo.show(5);
		tmo.show(5.5);
		tmo.show(5,6);
		tmo.show(5.5,6.5);
		tmo.show(5, 6.5);
	}  
}  
