public class Start{
	public static void main(String args[]){
		
		Date dob = new Date(5,5,1999);
		
		Person p1 = new Person("P1",dob);
		p1.showDetails();
		
		Date dob1 = new Date(5,5,2000);
		p1.setDob(dob1);
		p1.showDetails();
	}
}