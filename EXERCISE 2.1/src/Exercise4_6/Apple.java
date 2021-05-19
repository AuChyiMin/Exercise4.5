package Exercise4_6;

public class Apple extends Fruit {

	private int quantity;
	private double price;
	
	public Apple(String n, double p, int q) {
		super(n);
		price = p;
		quantity = q;
		
		System.out.println("Fruit\t: " + n);
		
		Price ATP = new AppleTotalPrice(); //ATP = apple total price
		Price OTP = new OrangeTotalPrice(); //OTP = orange total price
		Price aTP = new avocadoTotalPrice(); //aTP = avocado total price
		
		if(quantity < 10) {
			System.out.printf("If quantity less than 10, Total Price : RM%.2f", (price*quantity));
		}
		else if(quantity >= 10 && quantity <= 100) {
			if(n == "Apple" || n == "Red Apple" || n == "Green Apple") {
				System.out.printf("If quantity more than 10, Total Price : RM%.2f", ATP.totalPrice(q));
			}
			else if(n == "Orange") {
				System.out.printf("If quantity more than 10, Total Price : RM%.2f", OTP.totalPrice(q));
			}
			else if(n == "Avocado") {
				System.out.printf("If quantity more than 10, Total Price : RM%.2f", aTP.totalPrice(q));
			}
		}
		else {
			if(n == "Apple" || n == "Red Apple" || n == "Green Apple") {
				DiscountRate aa = new AppleDiscount();
				double ad = aa.discountrate(); //ad = apple discount
				System.out.println("If quantity more than 100, You'll get a 10% discount.");
				System.out.printf("Total Price : RM%.2f", ATP.totalPrice(q, ad));
			}
			else if(n == "Orange") {
				DiscountRate oo = new OrangeDiscount();
				double od = oo.discountrate(); //od = orange discount
				System.out.println("If quantity more than 100, You'll get a 30% discount.");
				System.out.printf("Total Price : RM%.2f", OTP.totalPrice(q, od));
			}
			else if(n == "Avocado") {
				DiscountRate AA = new AvocadoDiscount();
				double Ad = AA.discountrate(); //Ad = avocado discount
				System.out.println("If quantity more than 100, You'll get a 20% discount.");
				System.out.printf("Total Price : RM%.2f", aTP.totalPrice(q, Ad));
			}
		}
	}
	
	public String printBenefit() {
		return "\n******Benefit******" + "\nSubstances in apples help to prevent cancer.";
	}
	
	public String toString() {
		return printBenefit();
	}
}
