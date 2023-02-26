package Inheritance;

public class Truck extends Vehicle {

	public Truck(int maxspeed) {
		super(maxspeed);
		// TODO Auto-generated constructor stub
	}
	public void printTruck() {
		System.out.println("Truck "+"color "+getColor()+" maxSpped "+maxSpeed);
	}
	public  boolean isMoterized() {
		return true;
	}
}
