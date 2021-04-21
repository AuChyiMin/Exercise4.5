package Exercise3p2;

import java.util.*;

public class Fox {

	private String breed;
	private String colour;
	private double price, amount;
	
	Scanner s = new Scanner(System.in);
	//default construcctor

	Fox() {
		
		System.out.println("Enter Breed : ");
		this.breed = s.nextLine();
		System.out.println("Enter Colour :");
		this.colour = s.nextLine();	
		System.out.println("Enter Price :");
		this.price = s.nextDouble();	
		System.out.println("Enter Amount :");
		this.amount = s.nextDouble();
	}
	
	Fox (String b, String c, double p, double a) {
		this.breed = b;
		this.colour = c;
		this.price = p;
		this.amount = a;
		
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public double TotalPrice() {
		return this.price * this.amount;
	}
	
	public String toString() {
		return "Breed : " + breed + "\nColour : " + colour + "\nPrice(RM) : " + price + "\nAmount : " + amount;
	}

}
