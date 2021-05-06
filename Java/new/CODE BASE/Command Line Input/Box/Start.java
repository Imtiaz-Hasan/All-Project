public class Start
{
	public static void main(String args[])
	{			
		Box b1 = new Box();
		b1.setLength(1.5);
		b1.setWidth(1.2);
		b1.setHeight(1.3);
		b1.showBox();
		
		System.out.println("\n--------------------");
		
		double l,w,h;
		l = Double.parseDouble(args[0]);
		w = Double.parseDouble(args[1]);
		h = Double.parseDouble(args[2]);
		
		Box b2 = new Box();
		b2.setLength(l);
		b2.setWidth(w);
		b2.setHeight(h);
		b2.showBox();	
	}
}




