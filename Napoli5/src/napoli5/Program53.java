// Michael Napoli 2275778
/* Write a program that uses a for loop to print a table of the 
   square roots, squares, cubes, and cube roots of the integers 
   from 5 to 15, inclusive...five columns in all. Values in both 
   roots columns should display in columns 9 characters wide with 
   5 decimals. All other columns should display in columns 7 
   characters wide without decimals. */

package napoli5;

public class Program53 {
	public static void main(String[] args) {

		System.out.printf("%-7s %-8s %-6s %-7s %-9s \n", "number|", "|sq rt|", "|square|", "|cube|", "|cube rt|");

		for (int i = 5; i < 16; i++) {

			double squareRoot = Math.sqrt(i);
			int square = i * i;
			int cube = i * i * i;
			double cubeRoot = Math.cbrt(i);

			System.out.printf("%-7d %-9.5f %-7d %-7d %-9.5f \n", i, squareRoot, square, cube, cubeRoot);
		}
	}
}