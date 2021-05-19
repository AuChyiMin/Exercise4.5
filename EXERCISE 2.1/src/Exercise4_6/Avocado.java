package Exercise4_6;

public class Avocado extends Apple {

	public Avocado(String n, double p, int q) {
		super(n, p, q);
	}
	
	public String printBenefit() { //overriding method
		return "\n******Benefit******" + "\nAvocado help to regulate appetie and help keep eyes healthy.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}
}
