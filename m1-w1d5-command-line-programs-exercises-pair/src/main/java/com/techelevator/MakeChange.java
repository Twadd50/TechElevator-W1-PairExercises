package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then display the change required.
 
 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) { 
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("How much was the bill? "); 
		String restaurantBillString = scanner.nextLine();
		double restaurantBill = Double.parseDouble(restaurantBillString); 
		
		System.out.print("How much did you pay? ");
		String amountPaidString = scanner.nextLine();
		double amountPaid = Double.parseDouble(amountPaidString);
		
		double changeAmount = restaurantBill - amountPaid;
		
		System.out.print("Your change is: " + changeAmount);

		
		
		
		
		
		
		
		
		
		
		 
		 
		
		
		
		
		// System.out.println("Your change amount:");
		

	}

}
