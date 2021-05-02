package Exe4_2;

public class Orange extends Fruit {

	private String brand;
	private double weight;
	private int quantity;
	
	public Orange(String n, String b, double w, int q) {
		super(n);
		brand = b;
		weight = w;
		quantity = q;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double totalWeight() {
		return weight * quantity;
	}
	
	public double totalWeight(double w) {
		return w * 30;
	}
	
	public double totalWeight(double w, int q) {
		return w * q;
	}
	
	public void printBenefit() {
		System.out.println("Orange lowers cholesterol and control blood sugar level");
	}
	
	public String toString() {
		return super.toString() + 
				"\nBrand\t\t: " + brand +
				"\nTotal Weight\t\t\t: " + totalWeight() + 
				"\nTotal Weight(1 pack(12 pcs))\t: " + totalWeight(12) +
				"\nTotal Weight(1 box(36 pcs))\t: " + totalWeight(40, 36);
	}
}
