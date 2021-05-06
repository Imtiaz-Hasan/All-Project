class Box extends Rectangle{
	private double z;
	Box(double x,double y, double z){
		super(x,y);
		this.z = z;
		System.out.println("Parameterized-Box");
	}
	
	public double getVolume(){
		return getArea()*z;
	}
	
	public void showDetails(){
		System.out.println("Volume: "+getVolume());
		System.out.println("X: "+x);
		System.out.println("Y: "+getY());
		System.out.println("Z: "+z);
		
	}
	
}