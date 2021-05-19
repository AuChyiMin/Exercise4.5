package Exercise4_6;

class AppleDiscount implements DiscountRate { //AppleDiscount is a sub class for interface DiscountRate

	public double discountrate() { //same method as in discount rate
		return 0.1; //with body
	}
}

class OrangeDiscount implements DiscountRate { //OrangeDiscount is a sub class for interface DiscountRate
	
	public double discountrate() { //same method as in discount rate
		return 0.3; // with body
	}
}

class AvocadoDiscount implements DiscountRate { //AvocadoDiscount is a sub class for interface DiscountRate
	
	public double discountrate() { //same method as in discount rate
		return 0.2; //with body
	}
}