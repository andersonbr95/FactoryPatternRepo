package factoryPackage;

public abstract class Sandwich {
	String bread;
	String protein;
	String cheese;
	double cost;
	
	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getProtein() {
		return protein;
	}

	public void setProtein(String protein) {
		this.protein = protein;
	}

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}
		
	//end getters and setters
	
	
	public void cutBread() {
		System.out.println("slicing fresh " + getBread() + " for sandwich.");
	}
	
	public void sliceMeat() {
		System.out.println("Using meat slicer to get " + getProtein() + " cuts.");
	}
	
	public void addCheese() {
		System.out.println("adding thin slices of " + getCheese() + " on top.");
	}

	public void finalCost() {
		System.out.println("Your total comes out to be : $" + getCost());
	}

	
}
