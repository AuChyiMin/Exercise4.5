package Exercise4_4;

public class RedApple extends Apple {

	private double carbohydrate;
	private int potassium;
	private double folate;
	
	public RedApple(String n, int q, double p, double c, int P, double f) {
		super(n, q, p);
		this.carbohydrate = c;
		this.potassium = P;
		this.folate = f;
	}
	
	public double getCarbohydrate() {
		return this.carbohydrate;
	}
	
	public int getPotassium() {
		return this.potassium;
	}
	
	public double getFolate() {
		return this.folate;
	}
	
	public void printBenefit() {
		System.out.println("Red apple can weight loss and lower the risk of obesity.");
	}
	
	public String toString() {
		return super.toString() + 
				"\nCarbohydrate: " + carbohydrate + "g" +
				"\nPotassium: " + potassium + "mg" +
				"\nFolate\t: " + folate + "mcg";
	}
}
