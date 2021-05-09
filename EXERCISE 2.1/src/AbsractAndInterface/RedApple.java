package AbsractAndInterface;

public class RedApple extends Apple {
	
	public RedApple(String n, int q, double p, double d) {
		super(n, q, p, d);
	}
	
	public String printBenefit() { //overriding method
		return "\n******Benefit******" + "\nRed apple can weight loss and lower the risk of obesity.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
}
