package Exercise4p2;

public class RedApple extends Apple {

	private int calories;
	private String country;
	
	public RedApple() {
		super();
		calories = 0;
		country = "";
	}
	
	public RedApple(String n, int q, double p, int c, String C) {
		super(n, q, p);
		calories = c;
		country = C;
		
		setInfo(n, q, p, c, C);
	}
	
	public void setInfo(String n, int q, double p, int c, String C) {
		if(name.equals(null))
			n = "";
		else
			n = name;
		
		if(country.equals(null))
			C = "";
		else
			C = country;
	}
	
	public double getCalories() {
		return calories;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String toString() {
		return "Name \t\t: " + name + "\nQuantity \t: " + quantity + "\nPrice \t\t: RM" + price + "\nCalories \t: " + calories + "\nCountry \t: " + country + "\nTotal Price \t: RM" + totalPrice();
	}
}
