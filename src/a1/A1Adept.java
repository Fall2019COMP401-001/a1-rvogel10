package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Arrays for items and their prices
		int count = scan.nextInt();
		String[] items = new String[count];
		double[] itemPrice = new double[count];
		for (int i = 0; i < count; i++) {
			items[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
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
					if (itemsPurchased[x] .equals(items[y])) {
						totalSpent[i] += itemPrice[y] * amountOfEachItem[x];
					}
				}
				
			}
			// System.out.println(Arrays.toString(totalSpent));
	
	}
	double max = Integer.MIN_VALUE;
	double min = Integer.MAX_VALUE;
	double sum = 0;
	String maxName = "";
	String minName = "";
	
	for (int i = 0; i < totalSpent.length; i++) {
		if (totalSpent[i] > max) {
			max = totalSpent[i];
			maxName = firstNames[i] + " " + lastNames[i];
		}
		if (totalSpent[i] < min) {
			min = totalSpent[i];
			minName = firstNames[i] + " " + lastNames[i];
		}
		sum += totalSpent[i];
	}
	
	
	
	System.out.println("Biggest: " + maxName + " (" + String.format("%.2f", ((double) max)) + ")");
	System.out.println("Smallest: " + minName + " (" + String.format("%.2f", ((double) min)) + ")");
	System.out.println("Average: " + String.format("%.2f", ((double) sum) / ((int) totalSpent.length)));
	
	scan.close();
	}
}
	