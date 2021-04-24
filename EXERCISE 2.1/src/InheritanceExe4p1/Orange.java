package InheritanceExe4p1;

public class Orange extends Fruit {

	private int quantity;
	private int price;
	private String brand;
	
	public Orange (String name, int q, int p, String b) {
		super (name);
		this.quantity = q;
		this.price = p;
		this.brand = b;
		
	}
	
	public int totalPrice() {
		return this.quantity * this.price;
	}
	
	public String toString() {
		return super.toString() + "\nBrand \t\t: " + brand + "\nQuantity \t: " + quantity + "\nPrice \t\t: RM" + price;
	}

}
