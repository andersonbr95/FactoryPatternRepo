package factoryPackage;

public class SandwichFactory {

	public Sandwich orderSandwich(int newSandwich) {
		
		Sandwich sandwich = null;
		
		
		if(newSandwich == 1)
		{
			sandwich = new TurkeySandwich();
		}
		else if(newSandwich == 2)
		{
			sandwich = new HamSandwich();
		}
		else if(newSandwich == 3)
		{
			sandwich = new ComboSandwich();
		}
		else 
		{
			System.out.println("Please enter a valid type of sandwich");
		}
		
		sandwich.cutBread();
		sandwich.sliceMeat();
		sandwich.addCheese();
		sandwich.finalCost();
		return sandwich;
		
	}//end order sandwich class
}
