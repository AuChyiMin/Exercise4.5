package AbsractAndInterface;

public class Avocado extends Fruit implements Discount {

	private char size;
	private double price;
	private double calory;
	private int quantity;
	private String country;
	private double discount;
	
	public Avocado(String n, char s, double p, double c, int q, String C, double d) {
		super(n);
		size = s;
		price = p;
		calory = c;
		quantity = q;
		country = C;
		discount = d;
		
		System.out.println("Fruit\t: " + n);
		System.out.println("Country\t: " + C);
		
		switch(size) {
		case 'S' :totalPrice();
				  totalCalories();
				  System.out.printf("Total Price : RM%.2f", totalPrice());
				  System.out.println("Total calories of size " + size + " avocado is " + totalCalories() + " kcal");
				  break;
		
		case 'M' :double pp = price * (1-discountRate());
				  double cal = 150;
				  totalPrice(pp);
				  totalCalories(cal);
				  System.out.printf("Total Price : RM%.2f", totalPrice(pp));
				  System.out.println("\nYou got 15% discount!");
				  System.out.println("Total calories of size " + size + " avocado is " + totalCalories(cal) + " kcal");
				  break;
		
		case 'L' :double pp1 = price * (1-discountRate());
				  double cal1 = 180;
				  int qq = quantity;
				  totalCalories(cal1, qq);
				  System.out.printf("Total Price : RM%.2f", totalPrice(qq, pp1));
				  System.out.println("You got 25% discount!");
				  System.out.println("Total calories of size " + size + "avocado is " + totalCalories(cal1, qq) + " kcal");
				  break;
		}
		
	}
	
	public double discountRate() {
		if(size==('S')) {
			if(size==('M'))
				discount = 0.15;
			else if(size==('L'))
				discount = 0.25;
		}
		return discount;
	}
	
	public double totalPrice() { // overloading without parameter
		return quantity * price;
	}
	
	public double totalPrice(double pp) { // overloading with 1 parameter
		return quantity * pp;
	}
	
	public double totalPrice(int qq, double pp1) { // overloading with 2 parameter
		return qq * pp1;
	}
	
	public double totalCalories() { // overloading without parameter
		return calory * quantity;
	}
	
	public double totalCalories(double cal) { // overloading with 1 parameter
		return cal * quantity;
	}
	
	public double totalCalories(double cal1, int qq) { // overloading with 2 parameter
		return cal1 * qq;
	}
	
	public String printBenefit() { //overriding method
		return "\n******Benefit******" + "\nAvocado help to regulate appetie and help keep eyes healthy.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
}
