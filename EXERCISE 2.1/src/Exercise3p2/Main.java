package Exercise3p2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fox objFox = new Fox();
		Arctic obj = new Arctic("Arctic Fox", "white", 900, 5, 200);
		
		System.out.println("--------Corsac Fox--------");
		System.out.println(objFox);
		System.out.println("Total Price : RM" + objFox.TotalPrice());
		System.out.println();
		
		System.out.println("--------Arctic Fox--------");
		System.out.println(obj);
		System.out.println("Total Price : RM" + obj.TotalSales());
		System.out.printf("Cost Of Food : RM%.2f", obj.CostOfFood());

	}

}
