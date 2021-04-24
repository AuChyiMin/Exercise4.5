package InheritanceExe4p1;

public class GreenApple extends Apple {

	private String taste;
	private int quantity;
	private double weight;
	
	public GreenApple(String name, int q, double p, String t, double w) {
		super(name, q, p);
		this.taste = t;
		this.quantity = q;
		this.weight = w;
		
	}
	
	public double totalWeight() {
		return this.quantity * this.weight;
	}
	
	public String toString() {
		return super.toString() + "\nTaste \t\t: " + taste + "\nQuantity \t: " + quantity + "\nWeight(g) \t: " + weight;
	}
}
