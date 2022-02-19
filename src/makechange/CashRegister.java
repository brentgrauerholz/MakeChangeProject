package makechange;

import java.util.Scanner;

public class CashRegister {
	
	public static void main(String[] args) {
		
		double cost = 0;
		double rendered = 0;
		

		int penny = 0;
		int nickel = 0;
		int dime = 0;
		int quarter = 0;

		int oneGeorge = 0;
		int fiveAbe = 0;
		int tenAlex = 0;
		int twentyAndy = 0;
		
		
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
			
			while(change >= 0.01) { //if the change is more than $0.01, give a penny
	            change -= 0.01;
	            penny++;
	        }
			while(change >= 0.05) { //if the change is more than $0.05, give a nickel
	            change -= 0.05;
	            nickel++;
	        }
			while(change >= 0.10) { //if the change is more than $0.10, give a dime
	            change -= 0.10;
	            dime++;
	        }
			while(change >= 0.25) { //if the change is more than $0.25, give a quarter
	            change -= 0.25;
	            quarter++;
	        }
			while(change >= 1) { //if the change is more than $1, give a 1 dollar bill
	            change -= 1;
	            oneGeorge++;
			}
			 while(change >= 5) { //if the change is more than $5, give a 5 dollar bill
		            change -= 5;
		            fiveAbe++;
		        }
			 while(change >= 10) { //if the change is more than $10, give a 10 dollar bill
		            change -= 10;
		            tenAlex++;
		        }
			 while(change >= 20) { //if the change is more than $20, give a 20 dollar bill
		            change -= 20;
		            twentyAndy++;
		        }

			
		}
	
		
		
		
		kb.close();
	}

}
