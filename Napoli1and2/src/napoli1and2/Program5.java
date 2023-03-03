// Michael Napoli   2275778
//
//  Write a program that prompts the user to enter a length in inches.
//  The program should then express the length in feet and inches. Both units should be integers.

package napoli1and2;

import java.util.Scanner;

public class Program5{
	public static void main(String[] args) {
		
		Scanner inchLength = new Scanner(System.in);
		System.out.println("Enter the length in inches you would like to convert to feet and inches: ");
		int inchLeng = inchLength.nextInt();
		
		int toFeet = (inchLeng/12);
		int remainingInches = (inchLeng % 12); 

		System.out.println(inchLeng + " inches converts to " + toFeet + "ft and " + remainingInches + "in.");
		
	}
}