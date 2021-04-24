package InheritanceExe4p1;

public class Avocado extends Fruit {

	private int quantity;
	private double price;
	private int calories;
	private String country;
	
	public Avocado(String name, int q, double p, int c, String C) {
		super(name);
		this.quantity = q;
		this.price = p;
		this.calories = c;
		this.country = C;
	}
	
	public double totalPrice() {
		return this.quantity * this.price;
	}
	
	public String toString() {
		return super.toString() + "\nQuantity \t: " + quantity + "\nPrice \t\t: RM" + price + "\nCalories \t: " + calories + "\nCountry \t: " + country;
	}
	
}
