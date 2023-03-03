// Michael Napoli   2275778
//
//Enter item description
//shirts
//Enter item unit price
//29.99
//Enter item quantity
//3
//3 shirts @ $29.99
//Subtotal $89.97
//Sales tax $6.2979
//Total due $96.2679

package napoli1and2;

import java.util.Scanner;

public class Program2{
	public static void main(String[] args) {
		
		double salesTax = .07;
		
		Scanner itemName = new Scanner(System.in);
		System.out.println("Enter item description");
		final String ITEM = itemName.nextLine();
		
		Scanner itemPrice = new Scanner(System.in);
		System.out.println("Enter item unit price");
		final double PRICE = itemPrice.nextDouble();
		
		Scanner itemQuantity = new Scanner(System.in);
		System.out.println("Enter item Quantity");
		final int QUANTITY = itemQuantity.nextInt();
		
		double subtotal = PRICE * QUANTITY;
		double tax = subtotal * salesTax;
		double total = subtotal + tax;
		
		System.out.println(QUANTITY + " " + ITEM + " @" + " $" + PRICE);
		System.out.println("Subtotal " + "$" + subtotal);
		System.out.println("Sales tax " + "$" + tax);
		System.out.println("Total due " + "$" + total);
		
	}
}
