package Inheritance;

public class Car extends Vehicle{
	
	public Car(int numDoors,int maxspeed) {
		super(maxspeed);
		System.out.println("Car's Constructor");
		this.numDoors = numDoors;
		// TODO Auto-generated constructor stub
	}

	int numDoors;
	
	
	
	public void print() {
		super.print();
		System.out.println("Car "+" numdoors "+numDoors);
	}
	public  boolean isMoterized() {
		return true;
	}
   
}
