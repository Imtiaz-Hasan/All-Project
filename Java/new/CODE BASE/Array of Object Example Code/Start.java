public class Start{
		
	public static void main(String []args){
		//creating some box objects
		Box b = new Box(2,2,2);
		Box b1 = new Box(1,1,1);
		Box b2 = new Box(4,4,4);
		
		//Here we declare an Array for Box type object. 
		Box boxes[] = new Box[3];
		// the default value of object type array is null
		
		//Assigning objects to array
		boxes[0] = b;
		
		//We can also creat an object and place it in array if needed.
		boxes[1] = new Box(3,3,3);
		
		/*we can insert Box object using insertBox method
		to see how insertBox method is created go to Box class
		Here b2 is the object we want to insert in array named boxes*/
		b2.insertBox(boxes);
		
		
		/*
		See Lecture 4.1 - Array slide Page 24 for Example
		
		We can not print data from an index if there 
		is null in that index. The followings steps 
		can be followed to print data of the boxes 
		stored in the array:
		1. Start from the 1st index of the array and check the value of that index.
		2. If it is not null, print data and go to next index. 
			Else, ignore and go to next index.
		3. Repeat until the last index.*/
		
		System.out.println("Using For Loop:");
		
		for(int i=0;i<boxes.length;i++){
			if(boxes[i] != null){
			System.out.println("===== Box at index "+i+" =====");
			boxes[i].showBox();
			
			}
		}
		
		System.out.println("\nUsing For each Loop:");
		
		//We can do same thing using for each Box element in array
		for(Box bb:boxes){
			if(bb != null){
			System.out.println("=============");
			bb.showBox();
			}
		}
	}
}