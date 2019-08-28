package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int amtOfCustomers = scan.nextInt();
		
		for (int i=0; i<amtOfCustomers; i++) {
			String fName=scan.next();
			String lName=scan.next();
			
			int amtOfItems = scan.nextInt();
			
			double totalItemsCost = 0;
			
			for(int b=0; b<amtOfItems; b++) {
				int itemAmt=scan.nextInt();
				scan.next();
				double itemCost=scan.nextDouble();
				
				double totalCost= itemAmt * itemCost;
				
				totalItemsCost = totalItemsCost + totalCost;
			}
			
			System.out.println(fName.charAt(0) + ". " + lName + ": " + String.format("%.2f", totalItemsCost));

		}
		
//		for (int i=0; i<amtOfCustomers; i++) {
//			System.out.println("test");
//		}
		
		scan.close();
		
		
	}
	static void intScanner (int amount) {
		
	}
}
