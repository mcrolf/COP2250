// Michael Napoli   2275778
// chapter10 Part2
/* 1. Write a Java program that prompts the user to enter a security code 
   that matches a specific pattern. Your program must approve the user's 
   entry. The pattern consists of these characters in this sequence:
	
   A lower case character, two upper case characters, two or three digits, 
   two lower case characters, an upper case character, 2 or 3 lower case 
   characters, 2 digits. */

package napoli10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Part2
{
	public static void main(String[] args) {
		
		// prompt user to enter security code
		Scanner userIn = new Scanner(System.in);
		System.out.println("Enter a security code that matches the following pattern:");
		System.out.println("- One lower case character");
		System.out.println("- Two upper case characters");
		System.out.println("- Two or Three digits");
		System.out.println("- Two lower case characters");
		System.out.println("- One upper case character");
		System.out.println("- Two or Three lower case characters");
		System.out.println("- Two digits");
		String userInput = userIn.nextLine();
		
		if (isMatch(userInput))
		{
			System.out.println("Yes, " + userInput + " matches the pattern.");
		}else
		{
			System.out.println("Sorry, " + userInput + " does not match the patetrn.");
		}
	}
		
	// conditions for valid password
	public static boolean isMatch(String userInput)
	{
		Pattern pattern = Pattern.compile("[a-z][A-Z]{2}[0-9]{2,3}[a-z]{2}[A-Z][a-z]{2,3}[0-9]{2}");
		Matcher matcher = pattern.matcher(userInput);
		return matcher.matches();
	}




}