class Person{
	private String name;
	private Date dob;
	
	Person(String name,Date dob){
		this.name = name;
		this.dob = dob;
	}
	public void setDob(Date dob){
		this.dob = dob;
	}
	public void showDetails(){
		System.out.println(name);
		dob.showDate();
	}
}