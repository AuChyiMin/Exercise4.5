package Exercise4p2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit f = new Fruit();
		System.out.println(f);
		System.out.println();
		
		Apple a = new Apple("Apple", 5, 1.99);
		System.out.println(a);
		System.out.println();
		
		GreenApple g = new GreenApple("Green Apple", 10, 1.5, "sour", 20);
		System.out.println(g);
		System.out.println();
		
		RedApple r = new RedApple("Red Apple", 12, 1.6, 160, "America");
		System.out.println(r);
		System.out.println();
		
		Orange o = new Orange("Orange", "Fuji", "orange");
		System.out.println(o);
		System.out.println();
		
		Avocado v = new Avocado("Avocado", "medium", 7);
		System.out.println(v);
		System.out.println();
	}

}
