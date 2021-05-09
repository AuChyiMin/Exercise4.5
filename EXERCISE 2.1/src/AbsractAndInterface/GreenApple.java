package AbsractAndInterface;

public class GreenApple extends Apple {
	
	public GreenApple(String n, int q, double p, double d) {
		super(n, q, p, d);
	}
	
	public String printBenefit() { //overriding method
		return "\n******Benefit******" + "\nGreen apple can improve heart health.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
}
