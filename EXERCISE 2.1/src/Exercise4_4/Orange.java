package Exercise4_4;

public class Orange extends Fruit {

	private String brand;
	private double weight;
	private double price;
	
	public Orange(String n, String b, double w, double p) {
		super(n);
		this.brand = b;
		this.weight = w;
		this.price = p;
		
		if(this.weight < 2) {
			totalPrice();
			System.out.println("Weight LESS than 2 kg, Total Price : RM" + totalPrice());
		}
		
		else if(this.weight > 2 && this.weight < 10) {
			double pr = 1.30;
			totalPrice(pr);
			System.out.println("Weight MORE than 2 kg and LESS than 10 kg, Total Price : RM" + totalPrice(pr));
		}
		else {
			double pr = 0.90;
			double dis = 0.2;
			totalPrice(pr, dis);
			System.out.println("Weight MORE than 10 kg, Total Price : RM" + totalPrice(pr, dis));
		}
		
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double totalPrice() {
		return this.weight * this.price;
	}
	
	public double totalPrice(double pr) {
		return this.weight * pr;
	}
	
	public double totalPrice(double pr, double dis) {
		return (this.weight * pr) * dis;
	}
	
	public void printBenefit() {
		System.out.println("Orange lowers cholesterol and control blood sugar level.");
	}
	
	public String toString() {
		return super.toString() + "\nBrand\t: " + brand;
	}
	
}
