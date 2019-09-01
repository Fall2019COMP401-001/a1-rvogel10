package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Arrays for items and their prices
		int count = scan.nextInt();
		String[] items = new String[count];
		double[] itemAmount = new double[count];
		for (int i = 0; i < count; i++) {
			items[i] = scan.next();
			itemAmount[i] = scan.nextDouble();
		}
		
		
		// Array for counting the people
		int count2 = scan.nextInt();
		String[] firstNames = new String[count2];
		String[] lastNames = new String[count2];
		double[] totalSpent = new double[count2];
		
		for (int i = 0; i < count2; i++) {
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			int totalDifferentItems = scan.nextInt();
			
			String[] itemsPurchased = new String[totalDifferentItems];
			int[] amountOfEachItem = new int[totalDifferentItems];
			for (int x = 0; x < totalDifferentItems; x++) {
				amountOfEachItem[x] = scan.nextInt();
				itemsPurchased[x] = scan.next();
			}
			
			for (int x = 0; x < totalDifferentItems; x++) {
				for (int y = 0; y < count; y++) {
					if (itemsPurchased[x] == items[y]) {
						totalSpent[x] += itemAmount[y] * amountOfEachItem[x];
					}
				}
				
			}
	
	}
	double max = 0;
	double min = 1000000000;
	double sum = 0;
	
	for (int i = 0; i < totalSpent.length; i++) {
		if (totalSpent[i] > max) {
			max = totalSpent[i];
		} else if (totalSpent[i] < min) {
			min = totalSpent[i];
		}
		sum += totalSpent[i];
	}
	
	
	
	System.out.println("Biggest: " + min);
	System.out.println("Smallest: " + max);
	System.out.println("Average: " + String.format("%.2f", ((double) sum) / ((double) count)));
	
	scan.close();
	}
}
	