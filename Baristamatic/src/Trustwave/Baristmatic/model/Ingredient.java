package Trustwave.Baristmatic.model;

public class Ingredient {
	
	String name;
	double cost;
	int stock;
	

	public Ingredient(String name, double cost, int stock) {
		super();
		this.name = name;
		this.cost = cost;
		this.stock = stock;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	

}
