package Exercise4_4;

public class Avocado extends Fruit {

	private char size;
	private double calory;
	private int quantity;
	private String country;
	
	public Avocado(String n, char s, double c, int q, String C) {
		super(n);
		this.size = s;
		this.calory = c;
		this.quantity = q;
		this.country = C;
		
		switch(size) {
		case 'S' :totalCalories();
				  System.out.println("Total calories of size " + size + " avocado is " + totalCalories() + " kcal");
				  break;
		
		case 'M' :double cal = 150;
				  totalCalories(cal);
				  System.out.println("Total calories of size " + size + " avocado is " + totalCalories(cal) + " kcal");
				  break;
		
		case 'L' :double cal1 = 180;
				  int qty = 12;
				  totalCalories(cal1, qty);
				  System.out.println("Total calories of size " + size + "avocado is " + totalCalories(cal1, qty) + " kcal");
				  break;
		}
		
	}
	
	public char getSize() {
		return this.size;
	}
	
	public double getCalory() {
		return this.calory;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public double totalCalories() {
		return this.calory * this.quantity;
	}
	
	public double totalCalories(double cal) {
		return cal * this.quantity;
	}
	
	public double totalCalories(double cal1, int qty) {
		return cal1 * qty;
	}
	
	public void printBenefit() {
		System.out.println("Avocado help to regulate appetie and help keep eyes healthy.");
	}
	
	public String toString() {
		return super.toString() + "\nCountry\t: " + country;
	}
}
