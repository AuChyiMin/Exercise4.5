package Exercise3p2;

public class Arctic extends Fox {

	private double food;
	
	public Arctic(String b, String c, double p, double a, double f) {
		super(b, c, p, a);
		food = f;
	}
	
	public double getFood() {
		return food;
	}
	
	
	public double TotalSales() {
		return super.getPrice();
	}
	
	public double CostOfFood() {
		return food/30;
	}
	
	public String toString() {
		return super.toString() + "\nAmount of food : " + food;
	}
}
