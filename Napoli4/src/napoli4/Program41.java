// Michael Napoli   2275778
//
/* Write a program that prompts the user to enter a full name consisting of three names 
   (first middle last) into one String variable. Then use methods of class String to:

print the number of characters in the full name, excluding spaces
print just the middle name and the number of characters in it.
print the three initials of the name
print the last name in all lower case.
print the full name in the usual alphabetical format (Last, First Middle) and proper case.  */
package napoli4;

import java.util.Scanner;

public class Program41{
	public static void main(String[] args) {
		
	// user input
	Scanner fullName = new Scanner(System.in);
	System.out.println("Please enter your full name: ");
	String firstName = fullName.next();
	String middleName = fullName.next();
	String lastName = fullName.next();
	
	// printing length of full name
	int nameLength = firstName.length() + middleName.length() + lastName.length();
	System.out.println(nameLength);
	
	// print just the middle name
	System.out.println(middleName);
	
	// print 3 initials
	System.out.println(firstName.charAt(0) + " , " + middleName.charAt(0) + " , " + lastName.charAt(0));
	
	// print last name in lower case
	System.out.println(lastName.toLowerCase());
	
	// print full name in alphabetical format
	String firstCap = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
	String middleCap = middleName.substring(0, 1).toUpperCase() + middleName.substring(1);
	String lastCap = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
	String fullnamesFormat = String.format("%s, %s %s", lastCap, firstCap, middleCap);
	System.out.println(fullnamesFormat);
	
	}
}