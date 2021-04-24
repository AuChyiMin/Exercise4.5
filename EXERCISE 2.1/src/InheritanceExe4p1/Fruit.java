package InheritanceExe4p1;

public class Fruit {

	private String name;
	
	public Fruit(String name) {
		this.name = name;
		System.out.println(name + " constructor is invoked");
	}
	
	public String toString() {
		return "Fruit \t\t: " + name;
	}
	
}
