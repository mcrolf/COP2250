// Michael Napoli   2275778
//
//  Write a program that prompts the user to enter an even multiple of 17 
//    between 200 and 300. Use just ONE boolean expression to test the input 
//    and report the input as acceptable, or not.
package napoli3;

import java.util.Scanner;

public class Program31{
	public static void main(String[] args) {
		Scanner userNumber = new Scanner(System.in);
		System.out.println("Please enter an even multiple of 17 between 200 and 300:");
		int userNum = userNumber.nextInt();
		int factor = userNum/17;
		
		if (200<=userNum && userNum<=300 && factor%2==0) {
			System.out.println("Very good! You've entered a valid number");
		} else {
			System.out.println("Sorry, the input did not meet the specifications.");
		}		
	}
}