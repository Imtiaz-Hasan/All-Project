import java.lang.*;

public class Shape
{
	private String typeOfShape;
	
	

	public void setTypeOfShape(String typeOfShape)
	{
		this.typeOfShape = typeOfShape;
	}
	public String getTypeofShape(){return typeOfShape;}
	
	

	void showDetails()
    {
		System.out.println("Type of Shape: "+typeOfShape);
		
	}
	
	
}	