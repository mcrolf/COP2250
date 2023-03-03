// Michael Napoli   2275778
//
//  Write a program that prompts the user to enter the diameter of a circle and then prints the area of that circle.

package napoli1and2;

import java.util.Scanner;

public class Program4{
	public static void main(String[] args) {
		
		Scanner diameter = new Scanner(System.in);
		System.out.println("Enter the diameter of the circle: ");
		double diameter1 = diameter.nextDouble();
		
		double radius = diameter1/2;
		double radiusToArea = (Math.PI * Math.pow(radius, 2)) ;

		System.out.println("Your circle of diameter " + diameter1 + " has an area of " + radiusToArea);
		
	}
}