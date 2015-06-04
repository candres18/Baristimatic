package Trustwave.Baristmatic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Trustwave.Baristmatic.model.Inventory;
import Trustwave.Baristmatic.model.Menu;

public class Baristamatic {
	
		
	final static String[] MENUOPTIONS = {"1","2","3","4","5","6"};
	
	
	public static void main (String args[]) throws IOException {
		
		Inventory.intializeInventory();
		Menu.intializeMenu();
		Inventory.printInventory();
		Menu.printMenu();
		
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String input = null;
	        boolean quitProgram = false;
	        try {
	        	while( quitProgram == false){
	        		input = reader.readLine();	            

	            	if(input.equals("r") || input.equals("R") ){
	        	  		reStock();
	        			Inventory.printInventory();
	        			Menu.printMenu();
		            }
	            	else if (isMenuOption(input) == true){
	            		int menuNum = Integer.parseInt(input);
	            		if(checkAvailability(menuNum) == false){
	            			System.out.println("Out of stock:" + Menu.getMenu().get(menuNum-1).getName());
	            			Inventory.printInventory();
		        			Menu.printMenu();
	            		}
	            		else
	            		{
	            		System.out.println("Dispensing:" + Menu.getMenu().get(menuNum-1).getName());
	            		updateInventory(menuNum);
	            		Inventory.printInventory();
	        			Menu.printMenu();
	            		}
	 	            }
	            	else if (input.equals("q" ) || input.equals("Q")){
	            		quitProgram= true;

	            	}
	 				else
	 				{
	 	            	System.out.println("Invalid selection:" + input);
	 	            } 
	            	            	
	            }   
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        } 
	    
	}
	
	
 public static boolean isMenuOption(String input){
	 
	 Boolean flag = false;
	 for( String option : MENUOPTIONS)
      {
 		 	if(input.contains(option)){
 		 		flag = true;
 		 		break;
 		 	} 
 		 	else{
 		 		flag = false;
 		 	}
      }
	 return flag;
	 
 }
		
  public static void reStock(){
	  for(int i =0; i < Inventory.getInventory().size(); i++){
		  Inventory.getInventory().get(i).setStock(10);
	  }
	  
  }
  
  public static boolean checkAvailability (int drinkNum){
	
	  boolean isAvailable = true;
	   int numCoffee = Menu.getMenu().get(drinkNum-1).getNumCoffee();
	   int numDecafCoffee = Menu.getMenu().get(drinkNum-1).getNumDCoffee();
       int numCream = Menu.getMenu().get(drinkNum-1).getNumCream();  
       int numSugar = Menu.getMenu().get(drinkNum-1).getNumSugar();
       int numSMilk = Menu.getMenu().get(drinkNum-1).getNumSMilk();
       int numFMilk = Menu.getMenu().get(drinkNum-1).getNumFMilk();
       int numEspresso = Menu.getMenu().get(drinkNum-1).getNumEspresso();
       int numCocoa = Menu.getMenu().get(drinkNum-1).getNumCocoa();
       int numWCream = Menu.getMenu().get(drinkNum-1).getNumWhippedCream();
       
       int[] inventoryHit = new int[] {numCocoa,numCoffee, numCream,numDecafCoffee,numEspresso,numFMilk,numSMilk,numSugar,numWCream};
       
       for(int i = 0; i < Inventory.getInventory().size(); i++){

    	   if(Inventory.getInventory().get(i).getStock() < inventoryHit[i] ){
    		   
    		   isAvailable = false;
    		   Menu.getMenu().get(drinkNum-1).setInStock(false);
    	   }
       }

	  return isAvailable;
  }
  
  public static void updateInventory(int drinkNum){
	  
	   int numCoffee = Menu.getMenu().get(drinkNum-1).getNumCoffee();
	   int numDecafCoffee = Menu.getMenu().get(drinkNum-1).getNumDCoffee();
       int numCream = Menu.getMenu().get(drinkNum-1).getNumCream();  
       int numSugar = Menu.getMenu().get(drinkNum-1).getNumSugar();
       int numSMilk = Menu.getMenu().get(drinkNum-1).getNumSMilk();
       int numFMilk = Menu.getMenu().get(drinkNum-1).getNumFMilk();
       int numEspresso = Menu.getMenu().get(drinkNum-1).getNumEspresso();
       int numCocoa = Menu.getMenu().get(drinkNum-1).getNumCocoa();
       int numWCream = Menu.getMenu().get(drinkNum-1).getNumWhippedCream();
       
       int[] inventoryHit = new int[] {numCocoa,numCoffee, numCream,numDecafCoffee,numEspresso,numFMilk,numSMilk,numSugar,numWCream};
       
       for(int i = 0; i < Inventory.getInventory().size(); i++){
    	   int updatedStock = Inventory.getInventory().get(i).getStock() - inventoryHit[i];
    	   Inventory.getInventory().get(i).setStock(updatedStock);
    	   
       }
	  
  }
	

}
