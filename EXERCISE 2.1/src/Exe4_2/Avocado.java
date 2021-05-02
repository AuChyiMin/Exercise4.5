package Exe4_2;

public class Avocado extends Fruit {

	private double calory;
	private int quantity;
	
	public Avocado(String n, double c, int q) {
		super(n);
		calory = c;
		quantity =q;
	}
	
	public double getCalory() {
		return calory;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalCalory() {
		return calory * quantity;
	}
	
	public double totalCalory(double c) {
		return c * quantity;
	}
	
	public double totalCalory(double c, int q) {
		return c * q;
	}
	
	public void printBenefit() {
		System.out.println("Avocado help to regulate appetie and help keep eyes healthy.");
	}
	
	public String toString() {
		return super.toString() + 
				"\nTotal Calories\t: " + totalCalory() +
				"\nTotal Calories\t: " + totalCalory(160) +
				"\nTotal Calories\t: " + totalCalory(160, 8);
	}
}
