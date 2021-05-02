package Exe4_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a = new Apple("Apple", 4, 1.2);
		System.out.println("--------Apple--------");
		System.out.println(a);
		a.printBenefit();
		System.out.println();
		
		GreenApple g = new GreenApple("Green Apple", 10, 1.8, 4, 1, 2);
		System.out.println("--------Green Apple--------");
		System.out.println(g);
		g.printBenefit();
		System.out.println();
		
		RedApple r = new RedApple("Red Apple", 20, 1.5, 30.8, 239, 6.7);
		System.out.println("--------Red Apple--------");
		System.out.println(r);
		r.printBenefit();
		System.out.println();
		
		Orange o = new Orange("Orange", "Fuji", 35, 6);
		System.out.println("--------Orange--------");
		System.out.println(o);
		o.printBenefit();
		System.out.println();
		
		Avocado A = new Avocado("Avocado", 160, 3);
		System.out.println("--------Avocado--------");
		System.out.println(A);
		A.printBenefit();
		System.out.println();

	}

}
