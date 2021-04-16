package ExerciseFoxConstructor;

import java.util.Scanner;

public class Fox {
	String breed;
	String colour;
	char size;
	char coat;
	double weight;
	
	Scanner s = new Scanner(System.in);
	//default construcctor

	Fox() {
		
		System.out.println("Enter Breed : ");
		this.breed = s.nextLine();
		System.out.println("Enter Colour :");
		this.colour = s.nextLine();		
		System.out.println("Enter Size :");
		this.size = s.next().charAt(0);
		System.out.println("Enter Coat :");
		this.coat = s.next().charAt(0);
		System.out.println("Enter Weight :");
		this.weight = s.nextDouble();	
	}
	
	
	//Parameterized constructor
	Fox(String b, String c, char s, char C, double w){
			this.breed = b;
			this.colour = c;
			this.size = s;
			this.coat = C;
			this.weight = w;
	}

}
