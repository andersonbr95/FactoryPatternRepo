package factoryPackage;

import java.util.Scanner;

public class SandwichShop {
	public static void main(String[] args) {
		
		SandwichFactory sandwichFactory = new SandwichFactory();
		
		
		Scanner userInput = new Scanner(System.in); 
			System.out.print("Enter the number for the corresponding sandwich \n" 
					+ "1 - Turkey\n"
					+ "2 - Ham\n"
					+ "3 - Combo\n");
			int order = userInput.nextInt();
			
			sandwichFactory.orderSandwich(order);
		
	}
}
