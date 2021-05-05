package Exercise4_4;

public class Fruit {

	protected String name;
	
	public Fruit() {
		this.name = "";
	}
	
	public Fruit(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return name + " constructor is invoked" + "\nFruits\t: " + name;
	}
}
