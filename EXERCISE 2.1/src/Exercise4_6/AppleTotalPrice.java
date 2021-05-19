package Exercise4_6;

class AppleTotalPrice implements Price {

	double Ap = 2.00; // Ap = apple price for more than 10 but less than 100
	double Ap2 = 1.50; // Ap2 = apple price for more than 100
	
	public double totalPrice(double q) { //same method as in price
		return Ap * q; //with body
	}
	
	public double totalPrice(double q, double d) { //same method as in price
		return (Ap2 * q) *(1-d); //with body
	}
}

class OrangeTotalPrice implements Price {
	
	double op = 3.00; //op = orange price for more than 10 but less than 100
	double op2 = 2.50; //op2 = orange price for more than 100
	
	public double totalPrice(double q) { //same method as in price
		return op * q; //with body
	}
	
	public double totalPrice(double q, double d) { //same method as in price
		return (op2 * q) * (1-d); //with body 
	}
}

class avocadoTotalPrice implements Price {
	
	double ap = 4.00; //ap = avocado price for more than 10 but less than 100
	double ap2 = 3.00; //ap2 = avocado price for mi=ore than 100
	
	public double totalPrice(double q) { //same method as in price
		return ap * q; //with body
	}
	
	public double totalPrice(double q, double d) { //same method as in price
		return (ap2 * q) * (1-d); //with body
	}
}
