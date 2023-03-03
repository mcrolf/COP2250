// Michael Napoli   2275778
//
// Write a program that prompts the user to enter a temperature in degrees celsius and then converts to fahrenheit.

package napoli1and2;

import java.util.Scanner;

public class Program3{
	public static void main(String[] args) {
		
		Scanner celsius = new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius: ");
		double degreeCelsius = celsius.nextDouble();
		
		double cTof = (degreeCelsius*1.8)+32 ;

		System.out.println(degreeCelsius + "is " + cTof + " degrees Fahrenheit");
		
	}
}
