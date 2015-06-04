package Trustwave.Baristmatic.model;

public class Drink {
	
	String name;
	boolean inStock;
	double cost;
	int numCoffee;
	int numDCoffee;
	int numSugar;
	int numCream;
	int numSMilk;
	int numFMilk;
	int numEspresso;
	int numCocoa;
	int numWhippedCream;
	
	
	
	
	public Drink(String name, boolean inStock, double cost, int numCoffee,
			int numDCoffee, int numSugar, int numCream, int numSMilk,
			int numFMilk, int numEspresso, int numCocoa, int numWhippedCream) {
		super();
		this.name = name;
		this.inStock = inStock;
		this.cost = cost;
		this.numCoffee = numCoffee;
		this.numDCoffee = numDCoffee;
		this.numSugar = numSugar;
		this.numCream = numCream;
		this.numSMilk = numSMilk;
		this.numFMilk = numFMilk;
		this.numEspresso = numEspresso;
		this.numCocoa = numCocoa;
		this.numWhippedCream = numWhippedCream;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getNumCoffee() {
		return numCoffee;
	}
	public void setNumCoffee(int numCoffee) {
		this.numCoffee = numCoffee;
	}
	public int getNumDCoffee() {
		return numDCoffee;
	}
	public void setNumDCoffee(int numDCoffee) {
		this.numDCoffee = numDCoffee;
	}
	public int getNumSugar() {
		return numSugar;
	}
	public void setNumSugar(int numSugar) {
		this.numSugar = numSugar;
	}
	public int getNumCream() {
		return numCream;
	}
	public void setNumCream(int numCream) {
		this.numCream = numCream;
	}
	public int getNumSMilk() {
		return numSMilk;
	}
	public void setNumSMilk(int numSMilk) {
		this.numSMilk = numSMilk;
	}
	public int getNumFMilk() {
		return numFMilk;
	}
	public void setNumFMilk(int numFMilk) {
		this.numFMilk = numFMilk;
	}
	public int getNumEspresso() {
		return numEspresso;
	}
	public void setNumEspresso(int numEspresso) {
		this.numEspresso = numEspresso;
	}
	public int getNumCocoa() {
		return numCocoa;
	}
	public void setNumCocoa(int numCocoa) {
		this.numCocoa = numCocoa;
	}
	public int getNumWhippedCream() {
		return numWhippedCream;
	}
	public void setNumWhippedCream(int numWhippedCream) {
		this.numWhippedCream = numWhippedCream;
	}
	

}
