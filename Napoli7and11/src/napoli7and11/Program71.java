// Michael Napoli   2275778

/* Write a program that 

      Main
   		- creates a 32-element array of random integers all from 1 to 100, inclusive. 

      Function
   		- custom method with the array as argument
   		- The method should begin by using a loop 
  		- print the array elements in 4 rows and 8 columns, 
  		- with all columns 
  		- being five characters wide. 
  		- Duplicates are okay. 
  		- This same loop should 
  		- determine how many integers in the array are odd numbers. 
  		After this loop ends, 
  		- capture odd values in array
  		- process the array again in the method, 
  		- but this time with foreach loop, and add the odd integers to the odds array. 
  		- Return the odds array back to main. 
  		- In main, report the size of the array and sort it ascending. 
  		- Finally use a while loop to print the odd integers all on one line separated by spaces. 
*/


package napoli7and11;

import java.util.Arrays;

class Program71
{

	public static void main(String[] args) 

	{
		int[] numsList = new int[32];

		// populate array with random integers
		for (int i=0; i < numsList.length; i++) {
			numsList[i] = 1 + (int) (Math.random() * 100);
		}

		System.out.println ("Total: [" + numsList.length + "]");

		int[] odds = numsProcess (numsList);		// call the function

		// make sure the odds are good for us :)
		if (odds != null) {
			Arrays.sort(odds);		// sort the odds

			System.out.println("\n-----------------------------------------"); 

			System.out.println("\nThe size of the odds array is: [" + odds.length + "]"); 

			System.out.print("=> ");

			int count3 = 0;

			while (count3 < odds.length) {
				if (odds[count3] != 0) {
					System.out.print(Integer.toString(odds[count3]) + " ");
					count3++;
				}else {
					count3++;
				}
			}
		}
		else {
			System.out.println ("The odds are not good");
		}
	}
	/**
	 * Process the integers
	 * 		print the array elements in 4 rows and 8 columns
	 * 		with all columns 
	 * 		being five characters wide. 
	 * 		duplicates are okay. 
	 * 
	 * 		This same loop should 
	 * 		determine how many integers in the array are odd numbers. 
	 *  
	 * @param 	numsList	the random array 
	 */
	public static int[] numsProcess (final int[] numsList) 
	{
		int count = 0;					// array index (zero-based)
		int row = 1;					// rows (one-based)
		int oddscount = 0;				// track odds (sum)
		

		// use loop 
		// print array elements in 4 rows
		while (row < 5) {													// 4 rows  		1-4 < 5
			// need to process array until there are no more
			// elements.
			// items processed = 0
			// items processed < 100
			for (int i = 0; i < 8 && count <= 32; i++) {					// 8 colums		0-7 = 8
				System.out.printf("%5d",numsList[count]);

				// check to see if the value is odd/even
				if ((numsList[count] % 2) != 0) {
					oddscount++;
				}
				count++;
			} // end for
			row++;
			System.out.printf("\n");
		} // end while

		// initialize odd array with count
		int[] odds = new int[oddscount];		
		int count2 = 0;

		// capture all of the odd numbers 
		for (int i=0; i < numsList.length; i++) {	
			if ((numsList[i] % 2) != 0) {
				odds[count2] += numsList[i];
				count2++;
			}
		}
		return (odds);
	}
}