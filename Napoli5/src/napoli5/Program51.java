// Michael Napoli 2275778
/* Write a program that uses a while loop to generate 49 random integers, 
   all from 20 to 49, inclusive. The same loop should print the integers 
   in seven rows and right-aligned in columns seven characters wide. The 
   program should report both the count and the total of integers in the 
   20s, 30s, and 40s. See Sample Output. */

package napoli5;

public class Program51 {
	public static void main(String[] args) {

		int count = 0;
		int twentiesCount = 0;
		int thirtiesCount = 0;
		int fortiesCount = 0;
		int twentiesTotal = 0;
		int thirtiesTotal = 0;
		int fortiesTotal = 0;
		int randNum = 0;

		while (count < 7) {
			for(int i=0; i < 7; i++) {
				randNum = 20 + (int) (Math.random() * 29 + 1);
				
				System.out.printf("%7d", randNum);
			
				if (randNum > 19 && randNum < 30) {
					twentiesTotal += randNum;
					twentiesCount++;
				}
				if (randNum > 29 && randNum < 40) {
					thirtiesTotal += randNum;
					thirtiesCount++;
				}
				if (randNum > 39 && randNum < 50) {
					fortiesTotal += randNum;
					fortiesCount++;
				}
			}
			System.out.println("\n");
			count++;
		}
		System.out.println("Found " + twentiesCount + " numbers in the 20s totaling " + twentiesTotal);
		System.out.println("Found " + thirtiesCount + " numbers in the 30s totaling " + thirtiesTotal);
		System.out.println("Found " + fortiesCount + " numbers in the 40s totaling " + fortiesTotal);
	}
}