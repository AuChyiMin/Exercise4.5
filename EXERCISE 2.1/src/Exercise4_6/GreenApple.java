package Exercise4_6;

public class GreenApple extends Apple {

	public GreenApple(String n, double p, int q) {
		super(n, p, q);
	}
	
	public String printBenefit() { //overriding method
		return "\n******Benefit******" + "\nGreen apple can improve heart health.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
}
