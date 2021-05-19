package Exercise4_6;

public class Orange extends Apple{

	public Orange(String n, double p, int q) {
		super(n, p, q);
	}
	
	public String printBenefit() { // overriding method
		return "\n******Benefit******" + "\nOrange lowers cholesterol and control blood sugar level.";
	}
	
	public String toString() { // overriding method
		return printBenefit();
	}
}
