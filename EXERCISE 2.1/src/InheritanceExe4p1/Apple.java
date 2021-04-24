package InheritanceExe4p1;

public class Apple extends Fruit {

	private int quantity;
	private double price;
	
	public Apple(String name, int q, double p) {
		super (name);
		this.quantity = q;
		this.price = p;
		
	}
	
	public double totalPrice() {
		return this.price * this.quantity;
	}

	public String toString() {
		return super.toString() + "\nQuantity\t: " +quantity + "\nPrice \t\t: RM" + price;
	}
}
