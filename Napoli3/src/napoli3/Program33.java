// Michael Napoli   2275778
//
/*  Write a program that generates a random Fahrenheit oral temperature 
   between 92 and 108, inclusive. Print the temperature, and then report 
   whether the temperature indicates a fever or not using a conditional 
   operator as on page 105. An oral temperature above 100F is feverish.*/
package napoli3;

public class Program33 {
	public static void main(String[] args) {

		int patientTemp = 92 + (int) (Math.random() * (108 - 92) + 1);
		System.out.println("The body temperature is " + patientTemp + " Fahrenheit");

		System.out.println((patientTemp >= 100) ? "The patient has a fever" : "The patient does not have a fever");
	}
}