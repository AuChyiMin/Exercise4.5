package Exercise4_6;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----------Apple----------");
		Apple a = new Apple("Apple", 1.50, 200);
		System.out.println(a);
		System.out.println();
		
		System.out.println("----------Red Apple----------");
		RedApple r = new RedApple("Red apple", 1.30, 20);
		System.out.println(r);
		System.out.println();
		
		System.out.println("----------Green Apple----------");
		GreenApple g = new GreenApple("Green apple", 1.70, 5);
		System.out.println(g);
		System.out.println();
		
		System.out.println("----------Orange----------");
		Orange o = new Orange("Orange", 2.20, 12);
		System.out.println(o);
		System.out.println();
		
		System.out.println("----------Avocado----------");
		Avocado A = new Avocado("Avocado", 2.90, 140);
		System.out.println(A);
		System.out.println();

	}

}
