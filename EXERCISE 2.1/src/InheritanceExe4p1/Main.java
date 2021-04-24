package InheritanceExe4p1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fruit f = new Fruit ("Fruits");
		System.out.println();
		
		Apple a = new Apple ("Apples", 6, 3);
		System.out.println("Total Price: RM" + a.totalPrice());
		System.out.println();
		
		Orange o = new Orange ("Oranges", 10, 3, "consul");
		System.out.println(o);
		System.out.println("Total Price : RM" + o.totalPrice());
		System.out.println();
		*/
		Fruit f = new Fruit("Fruits");
		System.out.println(f);
		System.out.println();
		
		Apple a = new Apple("Apple", 10, 1.5);
		System.out.println(a);
		System.out.println("Total price \t: RM" + a.totalPrice());
		System.out.println();
		
		Orange o = new Orange("Orange", 10, 3, "Navel");
		System.out.println(o);
		System.out.println("Total price \t: RM" + o.totalPrice());
		System.out.println();
		
		Avocado v = new Avocado("Avocado", 11, 5, 160, "Mexico");
		System.out.println(v);
		System.out.println("Total price \t: RM" + v.totalPrice());
		System.out.println();
		
		RedApple r = new RedApple("Red Apple", 20, 1.3, 'M', 4);
		System.out.println(r);
		System.out.println("Total price \t: RM" + r.totalPrice());
		System.out.println();
		
		GreenApple g = new GreenApple("Green Apple", 6, 1.1, "sour", 60.55);
		System.out.println(g);
		System.out.println("Total price \t: RM" + g.totalPrice());
		System.out.println();
		
	}

}
