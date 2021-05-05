package Exercise4_4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fruit f = new Fruit("Fruit");
		//System.out.println(f);
		//System.out.println();
		
		System.out.println("----------Apple----------");		
		Apple a = new Apple("Apple", 5, 1.60);
		System.out.println(a.toString());
		a.printBenefit();
		System.out.println();
		
		System.out.println("----------Green Apple----------");		
		GreenApple g = new GreenApple("Green Apple", 20, 1.30, 4, 1, 2);
		System.out.println(g.toString());
		g.printBenefit();
		System.out.println();
		
		System.out.println("----------Red Apple----------");		
		RedApple r = new RedApple("Red Apple", 110, 1.40, 30.8, 239, 6.7);
		System.out.println(r.toString());
		r.printBenefit();
		System.out.println();
		
		System.out.println("----------Orange----------");		
		Orange o = new Orange("Orange", "Fuji", 12, 2.20);
		System.out.println(o.toString());
		o.printBenefit();
		System.out.println();
		
		System.out.println("----------Avocado----------");		
		Avocado A = new Avocado("Avocado", 'M', 140, 6, "Mexico");
		System.out.println(A.toString());
		A.printBenefit();
		System.out.println();
	}

}
