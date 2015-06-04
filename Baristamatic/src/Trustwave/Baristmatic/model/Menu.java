package Trustwave.Baristmatic.model;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	static List<Drink> Menu;
	
	public static void printMenu(){
		   NumberFormat formatter = new DecimalFormat("#0.00");  
			System.out.println("Menu:");
			for(int i =0; i < Menu.size(); i++){
				System.out.println((i+1) +","+ Menu.get(i).getName() + ",$" +formatter.format( Menu.get(i).getCost()) +"," + Menu.get(i).isInStock() );
			}
		}
	
	  public static void intializeMenu(){
		  
			 Drink drinkCoffee = new Drink("Coffee", true, 2.75,3,0,1,1,0,0,0,0,0);
			 Drink drinkDecafCoffee = new Drink("Decaf Coffee", true, 2.75,0,3,1,1,0,0,0,0,0);
			 Drink drinkCafeLatte = new Drink("Caffe Latte", true, 2.55,0,0,0,0,1,0,2,0,0);
			 Drink drinkCafeAmericano = new Drink("Caffe Americano", true,3.30,0,0,0,0,0,0,3,0,0);
			 Drink drinkCafeMocha = new Drink("Caffe Mocha", true,3.35,0,0,0,0,1,0,1,1,1);
			 Drink drinkCappuccino = new Drink("Cappuccino", true, 2.90,0,0,0,0,1,1,2,0,0);
			 
			 Menu = new ArrayList<Drink>();
			 Menu.add(drinkCafeAmericano);
			 Menu.add(drinkCafeLatte);
			 Menu.add(drinkCafeMocha);
			 Menu.add(drinkCappuccino);
			 Menu.add(drinkCoffee);
			 Menu.add(drinkDecafCoffee);
				  
		  }

	public static List<Drink> getMenu() {
		return Menu;
	}

	public static void setMenu(List<Drink> menu) {
		Menu = menu;
	}

}
