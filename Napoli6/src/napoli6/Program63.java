// Michael Napoli 2275778
/* Write a program that estimates the cost of carpet for one or more rooms with rectangular 
   floors. Begin by prompting for the price of carpet per square yard and the number of rooms 
   needing this carpet. Use a loop to prompt for the floor dimensions of each room in feet. 
   In this loop, call a value-returning method with the dimensions and carpet price as arguments. 
   The method should return the carpet cost for each room to main, where it will be printed and 
   accumulated. After all rooms have been processed, the program should display the total cost 
   of the job.  */

package napoli6;

import java.util.Scanner;

public class Program63 {
	
	// method for getting the cost of carpet per room
	public static double getCost(double dimensions, double carpetcost) {
		
		double roomcost = dimensions * carpetcost;
		
		return roomcost;
	}
	
	// main. user input for unit cost and number of rooms
	public static void main(String[] args) {
		
		Scanner carpetCost = new Scanner(System.in);
		System.out.println("What is the carpet cost per square yard? ");
		double carpetcost = carpetCost.nextDouble();
		
		Scanner userRoom = new Scanner(System.in);
		System.out.println("How many rooms require this carpet? ");
		int rooms = userRoom.nextInt();
		
		double totalcost = 0;
		
		// loop for number of rooms. prompt dimensions. return cost per room.
		for(int i=1; i < rooms + 1; i++) {
			
			Scanner userwidth = new Scanner(System.in);
			System.out.println("Enter the width of room " + i + ": ");
			double width = userwidth.nextDouble();
			
			Scanner userlength = new Scanner(System.in);
			System.out.println("Enter the length of room " + i + ": ");
			double length = userlength.nextDouble();
			
			double lengthYards = length*0.33333;
			double widthYards = width*0.33333;
			
			double dimensions = lengthYards * widthYards;
			
			System.out.printf("Carpet cost for room " + i + " is $%,2.2f \n", getCost(dimensions, carpetcost));
			totalcost += getCost(dimensions, carpetcost);
		}
		// print calculated total cost.
		System.out.printf("The total cost for " + rooms + " rooms is $%,2.2f \n", totalcost);
	}
}