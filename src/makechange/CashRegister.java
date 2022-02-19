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
		if (rendered == cost) {

			System.out.println("No change, have a nice day.");
		}

		boolean tooLittle = rendered < cost;

		if (tooLittle) {
			System.out.println("This is not enough money to purchase this item.");
		}

		boolean tooMuch = rendered > cost;

		if (tooMuch) {
			double change = rendered - cost;
			System.out.println("Your change is " + change + ". " + "\nYou will recieved the following demoninations:");

			while (change >= 20) {
				change -= 20;
				twentyAndy++;
			}
			while (change >= 10) {
				change -= 10;
				tenAlex++;
			}
			while (change >= 5) {
				change -= 5;
				fiveAbe++;
			}
			while (change >= 1) {
				change -= 1;
				oneGeorge++;
			}
			while (change >= 0.25) {
				change -= 0.25;
				quarter++;
			}
			while (change >= 0.10) {
				change -= 0.10;
				dime++;
			}
			while (change >= 0.05) {
				change -= 0.05;
				nickel++;
			}
			if (change >= 0.01) {
				change += .005;     //needed this because sometime the penny would be off by one cent
				while (change >= 0.01) {
					change -= 0.01;
					penny++;
				}
			}
			if (twentyAndy > 0) {
				System.out.println(twentyAndy + " twenty dollar bills");
			}
			if (tenAlex > 0) {
				System.out.println(tenAlex + " ten dollar bills");
			}
			if (fiveAbe > 0) {
				System.out.println(fiveAbe + " five dollar bills");
			}
			if (oneGeorge > 0) {
				System.out.println(oneGeorge + " one dollar bills");
			}

			if (quarter > 0) {
				System.out.println(quarter + " quarters");
			}

			if (dime > 0) {
				System.out.println(dime + " dimes");
			}
			if (nickel > 0) {
				System.out.println(nickel + " nickels");
			}
			if (penny > 0) {
				System.out.println(penny + " pennies");
			}

			System.out.println("Thank you for shopping at BrentMart.");

		}

		kb.close();
	}

}
