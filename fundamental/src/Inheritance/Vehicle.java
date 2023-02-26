package Inheritance;

public abstract class Vehicle {
	
	private String color;
	public int maxSpeed;
	
	public Vehicle(int maxspeed) {
		System.out.println("Vehicle's Constructor");
		this.maxSpeed = maxspeed;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
	System.out.println("Vehicle"+" color "+ color +" maxSpeed "+maxSpeed);
    }
	 
	public abstract boolean isMoterized();
	
}
