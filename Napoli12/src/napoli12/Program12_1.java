// Michael Napoli    2275778
// Program 12_1
/* Write a program as follows:
	-prompt the user to enter a positive value of type byte.
	-cast this input first to type int and then to type char.
	-if the char is a printable ASCII character (from 32 to 122 ), display it.
	-if the user's input is bad, the program should end gracefully with an error 
	 message. 
*/

package napoli12;

import java.util.InputMismatchException;
import java.util.Scanner;

 class Program12_1 {
	
	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		
		try {
			System.out.println("Enter a positive byte value: ");
			byte bytVal = userIn.nextByte();
			rangeTest(bytVal);
			int myInt = Integer.valueOf(bytVal);
			char myCh = (char)myInt;
			System.out.println("In ASCII, that is character " + myCh);
		}
		// catch for input type mismatch
		catch(InputMismatchException ex) {
			System.out.println("Bad input. Run the program again...");
		}
		// catch for rangeTest
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	// range test throws exception for value not in bounds
	public static void rangeTest(byte bytVal) throws Exception {
		if (bytVal > 122 || bytVal < 32) {
			throw new Exception("Bad input. Run the program again...");
		}
	}
	
	// class for range test exception
	class MyRangeException extends Exception {
		
	}

}