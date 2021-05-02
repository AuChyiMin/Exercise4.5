package Exe4_2;

public class Apple extends Fruit {

	protected int quantity;
	protected double price;
	
	public Apple(String n, int q, double p) {
		super(n);
		quantity = q;
		price = p;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double totalPrice() {
		return quantity * price;
	}
	
	public double totalPrice(int q) {
		return q * 2.3;
	}
	
	public double totalPrice(int q, double p) {
		return q * p;
	}
	
	public void printBenefit() {
		System.out.println("Substances in apples help to prevent cancer.");
	}
	
	public String toString() {
		return super.toString() + 
				"\nPrice\t\t: RM" + price + 
				"\nQuantity\t: " + quantity + 
				"\nTotal price\t: RM" + totalPrice() + 
				"\nTotal Price(1 pack(6 pcs)): RM" + totalPrice(6) + 
				"\nTotal Price(1 box(36 pcs)): RM" + totalPrice(36, 2) ;
	}
}
