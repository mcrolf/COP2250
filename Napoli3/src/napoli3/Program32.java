// Michael Napoli   2275778
//
/*  Write a program that prompts the user for any day of the week. 
   Report the entered day as either a weekend day, or not. Use a 
   switch and "stack" cases that require the same report as shown 
   on page 103. Your program should handle bad inputs, too.*/
package napoli3;

import java.util.Scanner;

public class Program32{
	public static void main(String[] args) {
		Scanner userDay = new Scanner(System.in);
		System.out.println("Please enter a day of the week: ");
		String useDay = userDay.nextLine();
		useDay = useDay.toLowerCase();
		
		switch (useDay) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println( useDay + " is not the weekend");
			break;
		case "saturday":
		case "sunday":
			System.out.println( useDay + " is the weekend! Woo Hoo");
			break;
		default:
			System.out.println("Invalid entry");
		}
	}
}