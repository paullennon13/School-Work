package bag;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryBag {
	
	public static void main(String[] args) {
		    ResizableArrayBag <String> groceryBag = new ResizableArrayBag<String>();
		    ArrayList<ItemWithCount<String>> itemArr = new ArrayList<ItemWithCount<String>>();
		    try {
		      File groceryBag1 = new File("C:\\Users\\lennonp\\eclipse-workspace\\DataStructures\\src\\bag\\GroceryBag1.txt");
		      Scanner finBag1 = new Scanner(groceryBag1);
		      while (finBag1.hasNextLine()) {
		        String line = finBag1.nextLine();
				ItemWithCount<String> item = new ItemWithCount<String>(line); 
		        groceryBag.add(line);
		        itemArr.add(item);
		      }
		      
		      
		      Object[] content = groceryBag.toArray();
		      for(int i = 0; i < content.length; i++) {
		    	  System.out.println(content[i]);
		      }
		      System.out.println("++++++++++++++++++++++++++++++++");
		      File groceryBag2 = new File("C:\\Users\\lennonp\\eclipse-workspace\\DataStructures\\src\\bag\\GroceryBag2.txt");
		      Scanner finBag2 = new Scanner(groceryBag2);
		      while (finBag2.hasNextLine()) {
		        String line = finBag2.nextLine();
		        for(int i = 0; i < content.length; i++) {
		        	String[] lineSplit = line.split("\\|");
		        	String[] xSplit = content[i].toString().split("\\|");
		        	if(lineSplit[0].equals(xSplit[0])) {
		        		itemArr.get(i).incrementCount();
		        	}
		        	else {
		        		ItemWithCount<String> item = new ItemWithCount<String>(line); 
				        groceryBag.add(line);
				        itemArr.add(item);
		        	}
		        }
		      }
		      
		      content = groceryBag.toArray();
		      for(int i = 0; i < content.length; i++) {
		    	  System.out.println(content[i]);
		      }
		      System.out.println("++++++++++++++++++++++++++++++++");
		      File groceryNotNeeded = new File("C:\\Users\\lennonp\\eclipse-workspace\\DataStructures\\src\\bag\\GroceryNotNeeded.txt");
		      Scanner finNotNeeded = new Scanner(groceryNotNeeded);
		      while (finNotNeeded.hasNextLine()) {
		        String line = finNotNeeded.nextLine();
		        String[] lineSplit = line.split("\\|");
		        for(int i = 0; i < content.length; i++) {	
		        	String[] xSplit = content[i].toString().split("\\|");
		        	if(lineSplit[0].equals(xSplit[0])) {
		        		itemArr.get(i).decrementCount();
		        	}
		        	if(itemArr.get(i).getCount() == 0) {
		        		itemArr.remove(i);
		        	}
		        }
		      }
		      content = groceryBag.toArray();
		      for(int i = 0; i < content.length; i++) {
		    	  System.out.println(content[i]);
		      }
		      finBag1.close();
		      finBag2.close();
		      finNotNeeded.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    
		    
		  }
}
