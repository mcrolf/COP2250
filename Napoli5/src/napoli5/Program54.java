// Michael Napoli 2275778
/* Write an inventory program for a small retail firm that sells only 
   4 products. The program should prompt for the unit price and quantity 
   in stock for each product and then print the inventory value of each 
   product. The program should finish by printing the total inventory 
   value. Display commas for thousands as needed in currency outputs 
   as shown. */

package napoli5;

import java.util.Scanner;

public class Program54 {
	public static void main(String[] args) {

		double productsTotal = 0;
		double itemTotal = 0;

		for (int i = 1; i < 5; i++) {

			itemTotal = 0;

			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter the price and quantity in stock for product " + i + ":");
			double productPrice = userInput.nextDouble();
			int productQuantity = userInput.nextInt();

			itemTotal = productPrice * productQuantity;
			System.out.printf("Product " + i + " inventory value is $%,4.2f\n", itemTotal);

			productsTotal += itemTotal;

		}
		System.out.printf("Total Inventory value is $%,4.2f", productsTotal);
	}
}