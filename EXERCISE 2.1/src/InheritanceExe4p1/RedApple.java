package InheritanceExe4p1;

public class RedApple extends Apple {

	private char size;
	private int fiber;
	
	public RedApple(String name, int q, double p, char s, int f) {
		super(name, q, p);
		this.size = s;
		this.fiber = f;
		
	}
	
	public String toString() {
		return super.toString() + "\nSize \t\t: " + size + "\nFiber \t\t: " + fiber;
	}
}
