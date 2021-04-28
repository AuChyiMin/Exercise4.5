package Exercise4p2;

public class Avocado extends Fruit{

	private String size;
	private int fiber;
	
	public Avocado() {
		super();
		size = "";
		fiber = 0;
	}
	
	public Avocado(String n, String s, int f) {
		super(n);
		size = s;
		fiber = f;
		
		setInfo(n, s, f);
	}
	
	public void setInfo(String n, String s, int f) {
		if(name.equals(null))
			n = "";
		else
			n = name;
		
		if(size.equals(null))
			s = "";
		else 
			s = size;
		
		if(f >= 0)
			f = fiber;
		else
			f = 0;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getFiber() {
		return fiber;
	}
	
	public String toString() {
		return "Name \t\t: " + name + "\nSize \t\t: " + size + "\nFiber \t\t: " + fiber + "g";
	}
}
