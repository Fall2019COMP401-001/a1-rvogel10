package a1;

import java.util.Scanner;
// import java.util.Arrays;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Arrays for items and their prices
		
		int count = scan.nextInt();
		String[] items = new String[count];
		int[] numberOfCustomersWhoBought = new int[count];
		int[] amountOfEachItem = new int[count];
				
		for (int i = 0; i < count; i++) {
			items[i] = scan.next();
			scan.nextDouble();
		}
		int numberOfPeople = scan.nextInt();
		for (int i = 0; i < numberOfPeople; i++) {
			
			scan.next();
			scan.next();
			int numberOfItems = scan.nextInt();
			
			String[] purchasedItems = new String[numberOfItems];
			for (int x = 0; x < numberOfItems; x++) {
				int numberOfEachItem = scan.nextInt();
				String itemName = scan.next();
				purchasedItems[x] = itemName;
				
				
				// For loop for seeing if it is the first item of that kind that was purchased
				
				for (int j = 0; j < items.length; j++) {

						if (itemName.equals(items[j])) {
							amountOfEachItem[j] += numberOfEachItem;
							numberOfCustomersWhoBought[j]++;
							// break;
						}
					
					
				
				}
			
			}
			// System.out.println(Arrays.toString(purchasedItems));
			int[] rep = new int[numberOfItems];
			for (int s = 0; s < purchasedItems.length; s++) {
				for (int f = s + 1; f < purchasedItems.length; f++) {
					if (purchasedItems[s].equals(purchasedItems[f])) {
						rep[s] = 1;
					}
				}
			// if (rep[s] == purchasedItems.length - 1) {
			// 	rep[s]--;
			//  }
			}
			
			
			// System.out.println(Arrays.toString(rep));
			for (int q = 0; q < purchasedItems.length; q++) {
				for (int v = 0; v < items.length; v++) {
					if (purchasedItems[q].equals(items[v])) {
						numberOfCustomersWhoBought[v] = numberOfCustomersWhoBought[v] - rep[q];
					}
				}
			
			}	
		}	
		for (int z = 0; z < items.length; z++) {
			if (amountOfEachItem[z] == 0 | numberOfCustomersWhoBought[z] == 0) {
				System.out.println("No customers bought " + items[z]);
			} else {
				System.out.println(numberOfCustomersWhoBought[z] + " customers bought " + amountOfEachItem[z] + " " + items[z]);
			}
		}
		
	
		scan.close();	
	}
}

