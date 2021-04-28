package Exercise4p2;

public class Fruit {

	protected String name;
	
	public Fruit() {
		name = "";
	}
	
	public Fruit(String n) {
		name = "";
		
		setInfo(n);
	}
	
	public void setInfo(String n) {
		if (name.equals(null))
			name = "";
		else
			name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Fruit constructor is invoked";
	}
	
}
