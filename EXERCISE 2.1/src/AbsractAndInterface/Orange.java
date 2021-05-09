package AbsractAndInterface;

public class Orange extends Fruit implements Discount {

	private String brand;
	private double weight;
	private double price;
	private double discount;
	
	public Orange(String n, String b, double w, double p, double d) {
		super(n);
		brand = b;
		weight = w;
		price = p;
		discount = d;
		
		System.out.println("Fruit\t: " + n);
		System.out.println("Brand\t: " + b);
		
		if(weight < 2) {
			totalPrice();
			System.out.printf("Weight LESS than 2 kg, Total Price : RM%.2f", totalPrice());
		}
		
		else if(weight > 2 && weight < 10) {
			double pr = price * (1-discountRate());
			totalPrice(pr);
			System.out.printf("Weight MORE than 2 kg and LESS than 10 kg, Total Price : RM%.2f", totalPrice(pr));
			System.out.println("\nYou got 20% discount!");
		}
		else {
			double pr = price * (1-discountRate());
			double ww = weight;
			totalPrice(pr, ww);
			System.out.printf("Weight MORE than 10 kg, Total Price : RM%.2f", totalPrice(pr, ww));
			System.out.println("\nYou got 30% discount!");
		}
		
	}
	
	public double discountRate() {
		if(weight < 2) {
			if(weight > 2 && weight < 10) 
				discount = 0.2;
			else 
				discount = 0.3;
		}
		return discount;
	}
	
	public double totalPrice() { // overloading without parameter
		return weight * price;
	}
	
	public double totalPrice(double pr) { // overloading with 1 parameter
		return weight * pr;
	}
	
	public double totalPrice(double pr, double ww) { // overloading with 2 parameter
		return ww * pr;
	}
	
	public String printBenefit() { // overriding method
		return "\n******Benefit******" + "\nOrange lowers cholesterol and control blood sugar level.";
	}
	
	public String toString() { // overriding method
		return printBenefit();
	}
}
