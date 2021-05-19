package Exercise4_6;

public abstract class Fruit {
	//define super class as abstract class. This is because we dont need to create instance of fruit.
	//class which declare as abstract cannot create instance object.
	
	protected String name;
	
	public Fruit(String n) {
		name = n;
	}
}
