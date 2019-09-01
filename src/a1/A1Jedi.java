package a1;

import java.util.Scanner;

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
			for (int x = 0; x < numberOfItems; x++) {
				int numberOfEachItem = scan.nextInt();
				String itemName = scan.next();
				for (int j = 0; j < numberOfEachItem; j++) {
					for (int y = 0; y < count; y++) {
						if (itemName .equals(items[y])) {
							amountOfEachItem[y]++;
							if (j == numberOfEachItem - 1) {
								numberOfCustomersWhoBought[y]++;
							}
							break;
						}
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
