package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Item List
		int i = scan.nextInt();
		String[] nameHolder = new String[i];
		double[] priceHolder = new double[i];
					
		for (int l = 0; l < i; l++) {
			nameHolder[l] = scan.next();
			priceHolder[l] = scan.nextDouble();
		}
		
		//Consumer
		int z = scan.nextInt();
		int itemNumber = 0;
		String[] customerNames = new String[z];
		double[] customerTotal = new double[z];
		
		for (int a = 0; a < z; a++)	{
			//Stores Names
			String firstName = scan.next();
			String lastName = scan.next();			
			customerNames[a] = firstName + " " + lastName;
		
			
			int cartAmt = scan.nextInt();
				
			//Cart Amount
			for (int c = 0; c < cartAmt; c++) {
				itemNumber = scan.nextInt();
				String itemName = scan.next(); 
					
				
				for (int d = 0; d < nameHolder.length; d++) {


					if (itemName.compareTo(nameHolder[d]) == 0) {
						customerTotal[a] += itemNumber * priceHolder[d];
					}
					
				}
				
			}
		} 
			
		//Algo
		
		int bigCustomer = 0;
		int smallCustomer = 0;
		double bigPrice = 0.0;
		double smallPrice = 10000.0;
		double cumulativePrice = 0.0;
		double avgPrice = 0.0;
			
		for (int a = 0; a < customerNames.length; a++) {
			if (customerTotal[a] > bigPrice) {
				bigPrice = customerTotal[a];
				bigCustomer = a;
				
			} 
			if (customerTotal[a] < smallPrice) {
				smallPrice = customerTotal[a];
				smallCustomer = a;
			}
			
			cumulativePrice = customerTotal[a] + cumulativePrice;
		}
			
		avgPrice = cumulativePrice / customerNames.length;

				
		System.out.println("Biggest: " + customerNames[bigCustomer] + " ("+ String.format("%.2f", bigPrice) +")");
		System.out.println("Smallest: " + customerNames[smallCustomer] + " ("+ String.format("%.2f", smallPrice) + ")");
		System.out.println("Average: " + String.format("%.2f", avgPrice));	
		
		scan.close();

	}
}
