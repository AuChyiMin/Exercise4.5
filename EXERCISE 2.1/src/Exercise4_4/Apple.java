package Exercise4_4;

public class Apple extends Fruit {

	protected int quantity;
	protected double price;
	
	public Apple(String n, int q, double p) { 
		super(n);
		this.quantity = q;
		this.price = p;
	
		if (this.quantity < 10) {
			totalPrice(); 
			System.out.println("If quantity LESS than 10, Total price: RM" + totalPrice());
		
		}
			else if (this.quantity > 10 && this.quantity < 100) {
			double pp = 1.50; 
			totalPrice(pp); 
			System.out.println("If quantity MORE than 10, Total price: RM" + totalPrice(pp));
		}
		
			else {
			double pp = 1.20; 
			double dis = 0.1; 
			totalPrice(dis, pp); 
			System.out.println("If quantity MORE than 100, Total price: RM" + totalPrice(dis,pp));
		}
		
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double totalPrice() {
		return this.quantity * this.price;
		
	}
	
	public double totalPrice(double pp) {
		return this.quantity * pp;
	}
	
	public double totalPrice(double qq, double pp) {
		return (pp * this.quantity) * qq;
	}
	
	public void printBenefit() {
		System.out.println("Substances in apples help to prevent cancer.");
	}
	
	public String toString() {
		return super.toString();
	}
}
