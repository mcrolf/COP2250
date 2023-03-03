// Michael Napoli 2275778
/* Write a program that prompts the user for a binary number 
   (from 3 to 8 bits) as a String and converts it to base-10 
   decimal value. There are several ways to do this in Java but 
   your program must use a for loop and first principles to perform 
   the conversion. Print the base-10 number when the loop ends. */

package napoli5;

import java.util.Scanner;

public class Program52 {
	public static void main(String[] args) {
		Scanner userNum = new Scanner(System.in);
		System.out.println("Enter a binary number from 3 to 8 bits: ");
		String binaryString = userNum.nextLine();

		int convertedDouble = 0;

		for (int i = 0; i < binaryString.length(); i++) {

			if (binaryString.charAt(i) == '1') {
				int len = binaryString.length() - 1 - i;
				convertedDouble += Math.pow(2, len);
			}
		}
		int convertedInt = (int) convertedDouble;
		System.out.println(convertedInt);
	}
}