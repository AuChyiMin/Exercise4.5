package Exercise4_6;

public class RedApple extends Apple {

	public RedApple(String n, double p, int q) {
		super(n, p, q);
	}
	
	public String printBenefit() { //overriding method
		return "\n******Benefit******" + "\nRed apple can weight loss and lower the risk of obesity.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
}
