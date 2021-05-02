package Exe4_2;

public class GreenApple extends Apple{

	private double fiber;
	private double protein;
	private int sodium;
	
	public GreenApple(String n, int q, double p, double f, double P, int s) {
		super(n, q, p);
		fiber = f;
		protein = P;
		sodium = s;
	}
	
	public double getFiber() {
		return fiber;
	}
	
	public double getProtein() {
		return protein;
	}
	
	public int getSodium() {
		return sodium;
	}
	
	public String nutrient() {
		return "\nGreen apple contains 3 nutrients.";
	}
	
	public String nutrient(String f) {
		return "\nIt contains " + f + ".";
	}
	
	public String nutrient(String p, String s) {
		return "\nIt also contains " + p + " and " + s + ".";
	}
	
	public void printBenefit() {
		System.out.println("Green apple can improve heart health.");
	}
	
	public String toString() {
		return super.toString() + 
				"\nFiber\t\t: " + fiber + "g" + 
				"\nProtein\t\t: " + protein + "g" + 
				"\nSodium\t\t: " + sodium + "mg" + 
				nutrient() + 
				nutrient("fiber") + 
				nutrient("protein", "sodium");
	}
}
