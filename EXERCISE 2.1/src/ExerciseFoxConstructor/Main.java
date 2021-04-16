package ExerciseFoxConstructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fox arctic = new Fox();
		Fox corsac = new Fox("Corsac Fox", "brown-grey", 'M', 'S', 2.5);
		Fox redfox = new Fox("Red Fox", "brown", 'M', 'S', 10);
		
		System.out.println("------Arctic Fox------");
		System.out.println("Breed : " + arctic.breed);
		System.out.println("Colour : " + arctic.colour);
		System.out.println("size : " + arctic.size);
		System.out.println("Coat : " + arctic.coat);
		System.out.println("Weight(kg) : " + arctic.weight);
		System.out.println();
		
		System.out.println("------Corsac Fox------");
		System.out.println("Breed : " + corsac.breed);
		System.out.println("Colour : " + corsac.colour);
		System.out.println("size : " + corsac.size);
		System.out.println("Coat : " + corsac.coat);
		System.out.println("Weight(kg) : " + corsac.weight);
		System.out.println();
		
		System.out.println("------Red Fox------");
		System.out.println("Breed : " + redfox.breed);
		System.out.println("Colour : " + redfox.colour);
		System.out.println("size : " + redfox.size);
		System.out.println("Coat : " + redfox.coat);
		System.out.println("Weight(kg) : " + redfox.weight);
		System.out.println();
	}

}
