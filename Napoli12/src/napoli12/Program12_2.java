// Michael Napoli   2275778
// Program 12_2
/* Write a program that creates a small (6-10) array of ints. 
   Display your array elements, all on one line, using a foreach 
   loop. In a try block, prompt the user to enter an index for 
   the array and attempt to print the element with that index. 
   Follow the try block with two catch blocks; one that detects 
   an index out of bounds, and another that catches other bad 
   inputs. 
*/

package napoli12;

import java.util.InputMismatchException;
import java.util.Scanner;

class Program12_2 {
	
	public static void main(String[] args) {
		
		// create array with ints
		int[] myArr = {3, 10, 11, 5, 24, 4, 23};
		
		// for each loop to show array
		for (int i : myArr) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		
		Scanner userIn = new Scanner(System.in);
		
		try {
			System.out.println("Enter any index of your array: ");
			int myIndex = userIn.nextInt();
			indexTest(myIndex);
			System.out.println("Element at index " + myIndex + " is " + myArr[myIndex]);
		}
		// catch for input type mismatch
		catch(InputMismatchException ex) {
			System.out.println("Bad input... Try again");
		}
		// catch for input test
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	// range test throws exception if input is not in range
	public static void indexTest(int myIndex) throws Exception {
		if (myIndex > 6) {
			throw new Exception("Error... Array index out of bounds.");
		}
	}
	
	// class for custom exception 
	class MyIndexException extends Exception {
		
	}
	
}