package Exe4_2;

public class RedApple extends Apple{

	private double carbohydrate;
	private int potassium;
	private double folate;
	
	public RedApple(String n, int q, double p, double c, int P, double f) {
		super(n, q, p);
		carbohydrate = c;
		potassium = P;
		folate = f;
	}
	
	public double getCarbohydrate() {
		return carbohydrate;
	}
	
	public int getPotassium() {
		return potassium;
	}
	
	public double getFolate() {
		return folate;
	}
	
	public String nutrient() {
		return "\nRed apple contains 3 nutrients.";
	}
	
	public String nutrient(String c) {
		return "\nIt contains " + c;
	}
	
	public String nutrient(String p, String f) {
		return "\nIt also contains " + p + " and " + f + ".";
	}
	
	public void printBenefit() {
		System.out.println("Red apple can weight loss and lower the risk of obesity.");
	}
	
	public String toString() {
		return super.toString() +
				"\nCarbohydrate\t: " + carbohydrate + "g" +
				"\nPotassium\t: " + potassium + "mg" +
				"\nFolate\t\t: " + folate + "mcg" +
				nutrient() + 
				nutrient("carbohydrate") +
				nutrient("potassium", "folate");
	}
}
