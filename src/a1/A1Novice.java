package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// variable that counts which customer we are looking at 
		int countCustomers = scan.nextInt();
			
		// Arrays to keep track of the customers' first initial, last name, and total cost
		
		char[] firstInitial = new char[countCustomers];
		String[] lastName = new String[countCustomers];
		double[] totalCost = new double[countCustomers];
			
		for (int i = 0; i < countCustomers; i++) {
			String tmp = scan.next();
			firstInitial[i] = tmp.charAt(0);
			lastName[i] = scan.next();
			int totalItems = scan.nextInt();
		
			double sum = 0;
			for (int j = 0; j < totalItems; j++) {
				int amount = scan.nextInt();
				
				double price = scan.nextDouble();
				sum = (amount * price) + sum;
			}
			totalCost[i] = sum;
			System.out.println(firstInitial[i] + ". " + lastName[i] + ": " + String.format("%.2f", totalCost[i]));
		}
		scan.close();
		
	}
	
}
