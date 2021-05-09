package AbsractAndInterface;

public class Apple extends Fruit implements Discount {

	private int quantity;
	private double price;
	private double discount;
	
	public Apple(String n, int q, double p, double d) { 
		super(n);
		quantity = q;
		price = p;
		discount = d;
		
		System.out.println("Fruit\t: " + n);
	
		if (quantity < 10) {
			totalPrice(); // overloading with no arguments 
			System.out.printf("If quantity LESS than 10, Total price: RM%.2f", totalPrice());
		
		}
			else if (quantity > 10 && quantity < 100) {
			double pp = price * (1-discountRate()); 
			totalPrice(pp); // overloading with 1 arguments
			System.out.printf("If quantity MORE than 10, Total price: RM%.2f", totalPrice(pp));
			System.out.println("\nYou got 10% discount!");
		}
		
			else {
			double pp = price * (1-discountRate()); 
			int qq = quantity;
			totalPrice(qq, pp); //overloading with 2 arguments
			System.out.printf("If quantity MORE than 100, Total price: RM%.2f", totalPrice(qq,pp));
			System.out.println("\nYou got 30% discount!");
		}
		
	}
	
	public double discountRate() {
		if(quantity < 10) {
			if(quantity > 10 && quantity < 100)
				discount = 0.1;
			else 
				discount  = 0.3;
		}
		return discount;
	}
	
	public double totalPrice() { // overloading without parameter
		return quantity * price;
		
	}
	
	public double totalPrice(double pp) { // overloading with 1 parameter
		return quantity * pp;
	}
	
	public double totalPrice(int qq, double pp) { // overloading with 2 parameter
		return pp * qq;
	}
	
	public String printBenefit() { //overriding method
		return "\n******Benefit******" + "\nSubstances in apples help to prevent cancer.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}

}
