package AbsractAndInterface;

public abstract class Fruit {
	//define super class as abstract class. This is because we dont need to create instance of fruit.
	//class which declare as abstract cannot create instance object.

	private String name;
	
	public Fruit(String n) {
		name = n;
	}
	
	//declare method that has no implementation
	//only subclass know how to implement the method
	public abstract String toString();//define method as abstract, only have heading with no body, use semicolon(;) with ending.
	public abstract double totalPrice(); 
	public abstract double totalPrice(double pp);
	public abstract double totalPrice(int qq, double pp);
}
