package a1;

import java.util.Scanner;

public class A1Jedi {
	
	public static void print (String[] itemName, int[] customerItemTotal, int[] itemTotal) {
		String[] array = new String[itemName.length];
		for (int i=0; i<itemName.length; i++) {
			array[i] = creatorOne(customerItemTotal[i]) + "customers bought" + creatorTwo(itemTotal[i]) + itemName[i];
			System.out.println(array[i]);
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Item List
		int itemList = scan.nextInt();
		String[] nameHolder = new String[itemList];
		double[] priceHolder = new double[itemList];
					
		for (int l = 0; l < itemList; l++) {
			nameHolder[l] = scan.next();
			priceHolder[l] = scan.nextDouble();
		}
		
		//Consumer
		int[] customerItemsTotal = new int[itemList];
		int[] itemTotal = new int [itemList];
		
		int consumerLists = scan.nextInt();
		int itemNumber = 0;
		String[] customerNames = new String[consumerLists];
		double[] customerTotal = new double[consumerLists];
		
		String[] masterItemList = new String[consumerLists];
//		for (int k=0; k<nameHolder.length; k++) {
//		masterItemList[k] = "";
//		}
		int[] totalItemList = new int[consumerLists];
		
		
		//consumerLists = 3
		for (int a = 0; a < consumerLists; a++)	{
			//Stores Names
			String firstName = scan.next();
			String lastName = scan.next();			
			customerNames[a] = firstName + " " + lastName;
			
			
			int cartAmt = scan.nextInt();
			
			int[] itemQuantity =new int[cartAmt];
			String[] itemName = new String[cartAmt];
			
			int tracker = 0;
			
			for (int f = 0; f < cartAmt; f++) {
				itemQuantity[f] = scan.nextInt();
				itemName[f] = scan.next();
				
			}
			
			
			String[] repeats = new String[cartAmt];
			for (int z = 0; z>itemQuantity.length; z++) {
				for (int c = 0; c < cartAmt; c++) {
					itemNumber = scan.nextInt();
					itemName[a] = scan.next(); 
						
					
					for (int d = 0; d < nameHolder.length; d++) {
						if (contain(itemName[d], repeats)) {
							int modifiedValue = 0; 
							for (int i=0; i<nameHolder.length; i++) {
								if (nameHolder[i].equals(itemName[d])) {
									modifiedValue = i;
									break;
								}
							}
						itemTotal[modifiedValue] += itemQuantity[d];
						}
				   }
			   }
			}
			for (int u=0; u<cartAmt; u++) {
				if (contain(itemName[u], repeats)) {
					int index = 0; 
					for (int i=0; i<nameHolder.length; i++) {
						if (nameHolder[i].equals(itemName[u])) {
							index = i;
							break;
						}
					}
					//itemQuantity index could be wrong
					itemTotal[index] += itemQuantity[u];
				} else {
					int index = 0; 
					for (int i=0; i<nameHolder.length; i++) {
						if (nameHolder[i].equals(itemName[u])) {
							index = i;
							break;
						}
					}
					//itemQuantity index could be wrong
					itemTotal[index] += itemQuantity[u];
					
					int findex = 0;
					
					for (int i=0; i<nameHolder.length; i++) {
						if (nameHolder[i].equals(itemName[u])) {
							findex = i;
							break;
						}
					}
					customerItemsTotal[findex]++;
					
					repeats[tracker] = itemName[u];
					tracker++;
				}
			}
			
			String[] strings = new String[itemName.length];
			
			for (int i=0; i<itemName.length; i++) {
				strings[i] = creatorOne(customerItemsTotal[i]) + " customers bought" + creatorTwo(itemTotal[i]) + itemName[i];
				
			}			

			}
			
		print(nameHolder, customerItemsTotal, itemTotal);
	}
	
	
	public static String creatorOne (int input) {
		
		if (input == 0) {
			return "No ";
		} else {
		return input + " "; }
	}
	
	public static boolean contain(String name, String[] repeat) {
		for (int i=0; i<repeat.length; i++) {
			if (name.equals(repeat[i])) {
				return true;
			}
		}  
		return false;
	}
	
	public static String creatorTwo (int input) {
		if (input == 0) {
			return " ";
		} else {
		return " " + input + " "; }
	}
}