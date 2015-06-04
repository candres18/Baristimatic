package Trustwave.Baristmatic.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	static List<Ingredient> Inventory;
	
public static void printInventory(){
		
		System.out.println("Inventory:");
		for(int i =0; i < Inventory.size(); i++){
			System.out.println(""+ Inventory.get(i).getName() + "," + Inventory.get(i).getStock());
		}
	}


public static void intializeInventory(){
	
	Ingredient coffeeIng = new Ingredient("Coffee",0.75,10);
	Ingredient decafCoffeeIng = new Ingredient("Decaf Coffee",0.75,10);
	Ingredient sugar = new Ingredient("Sugar", 0.25, 10);
	Ingredient cream = new Ingredient("Cream", 0.25, 10);
	Ingredient steamedMilk = new Ingredient("Steamed Milk", 0.35, 10);
	Ingredient foamedMilk = new Ingredient("Foamed Milk", 0.35, 10);
	Ingredient espresso = new Ingredient("Espresso", 1.10, 10);
	Ingredient cocoa = new Ingredient("Cocoa", .90, 10);
	Ingredient whippedCream = new Ingredient("Whipped Cream", 1.00, 10);
	
	Inventory = new ArrayList<Ingredient>();
	Inventory.add(cocoa);
	Inventory.add(coffeeIng);
	Inventory.add(cream);
	Inventory.add(decafCoffeeIng);
	Inventory.add(espresso);
	Inventory.add(foamedMilk);
	Inventory.add(steamedMilk);
	Inventory.add(sugar);
	Inventory.add(whippedCream);		
}


public static List<Ingredient> getInventory() {
	return Inventory;
}


public static void setInventory(List<Ingredient> inventory) {
	Inventory = inventory;
}

}
