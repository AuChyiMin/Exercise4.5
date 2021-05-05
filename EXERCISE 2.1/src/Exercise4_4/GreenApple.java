package Exercise4_4;

public class GreenApple extends Apple {

	private double fiber;
	private double protein;
	private int sodium;
	
	public GreenApple(String n, int q, double p, double f, double P, int s) {
		super(n, q, p);
		this.fiber = f;
		this.protein = P;
		this.sodium = s;
	}
	
	public double getFiber() {
		return this.fiber;
	}
	
	public double getProtein() {
		return this.protein;
	}
	
	public int getSodium() {
		return this.sodium;
	}
	
	public void printBenefit() {
		System.out.println("Green apple can improve heart health.");
	}
	
	public String toString() {
		return super.toString() +
				"\nFiber\t: " + fiber + "g" +
				"\nProtein\t: " + protein + "g" + 
				"\nSodium \t: " + sodium + "mg";
	}
}
