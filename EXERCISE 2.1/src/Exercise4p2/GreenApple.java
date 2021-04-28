package Exercise4p2;

public class GreenApple extends Apple {

	private String taste;
	private double weight;
	
	public GreenApple() {
		super();
		taste = "";
		weight = 0;
	}
	
	public GreenApple(String n, int q, double p, String t, double w) {
		super(n, q, p);
		taste = t;
		weight = w;
		
		setInfo(n, q, p, t, w);
	}
	
	public void setInfo(String n, int q, double p, String t, double w) {
		if(name.equals(null))
			n = "";
		else
			n = name;
		
		if(taste.equals(null))
			t = "";
		else
			t = taste;
	}
	
	public String getTaste() {
		return taste;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double totalWeight() {
		return quantity * weight;
	}
	
	public String toString() {
		return "Name \t\t: " + name + "\nQuantity \t: " + quantity + "\nPrice \t\t: RM" + price + "\nTaste \t\t: " + taste + "\nWeight \t\t: " + weight + "kg" + "\nTotal Price \t: RM" + totalPrice() + "\nTotal Weight \t: " + totalWeight() + "kg";
	}
}
