package makechange;

import java.util.Scanner;

public class CashRegister {
	
	public static void main(String[] args) {
		
		double cost = 0;
		double rendered = 0;
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the cost of this item?");
		cost = kb.nextDouble();
		System.out.println("How much money did you recieve from the customer?");
		rendered = kb.nextDouble();
		if(rendered == cost) {
			
		System.out.println("No change, have a nice day.");
		}
		
		boolean tooLittle = rendered < cost;
		
		if(tooLittle) {
			System.out.println("This is not enough money to purchase this item.");
		}
		
		boolean tooMuch = rendered > cost;
		
		if(tooMuch) {
			float change = (float) (rendered - cost);
			System.out.println("Your change is " + change + ". Thank you for shopping at BrentMart.");
			
			
			
		}
	
		
		
		
		kb.close();
	}

}
