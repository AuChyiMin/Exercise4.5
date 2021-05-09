package AbsractAndInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fruit f = new Fruit("Fruit");
		System.out.println();
		
		System.out.println("----------Apple----------");
		Apple a = new Apple("Apple", 200, 1.50, 0.1);
		System.out.println(a.toString());
		System.out.println();
		
		System.out.println("----------Red Apple----------");
		RedApple r = new RedApple("Red apple", 20, 1.30, 0.2);
		System.out.println(r.toString());
		System.out.println();
		
		System.out.println("----------Green Apple----------");
		GreenApple g = new GreenApple("Green apple", 5, 1.70, 0.15);
		System.out.println(g.toString());
		System.out.println();
		
		System.out.println("----------Orange----------");
		Orange o = new Orange("Orange","Fuji", 12, 2.20, 0.2);
		System.out.println(o.toString());
		System.out.println();
		
		System.out.println("----------Avocado----------");
		Avocado A = new Avocado("Avocado", 'M', 2.90, 140, 6, "Mexico", 0.2);
		System.out.println(A.toString());
		System.out.println();

	}

}
