package Exercise4p2;

public class Orange extends Fruit {

	private String brand;
	private String colour;
	
	public Orange() {
		super();
		brand = "";
		colour = "";
	}
	
	public Orange(String n, String b, String c) {
		super(n);
		brand = b;
		colour = c;
		
		setInfo(n, b, c);
	}
	
	public void setInfo(String n, String b, String c) {
		if(name.equals(null))
			n = "";
		else
			n = name;
		
		if(brand.equals(null))
			b = "";
		else
			b = brand;
		
		if(colour.equals(null))
			c = "";
		else
			c = colour;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getColour() {
		return colour;
	}
	
	public String toString() {
		return "Name \t\t: " + name + "\nBrand \t\t: " + brand + "\nColour \t\t: " + colour;
	}
}
