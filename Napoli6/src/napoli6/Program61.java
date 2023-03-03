// Michael Napoli 2275778
/* Write a program that prompts an employee to enter his/her hourly pay 
   rate and hours worked last week. Call a method that takes these inputs 
   as arguments. This method should calculate and print the employee's 
   regular pay and overtime pay in currency format. The method should return 
   the gross pay to main. The main method should print the gross pay in currency format. */

package napoli6;

import java.util.Scanner;

public class Program61 {

	// method for payout calculation. calculates regPay, otPay. returns grosspay.
	public static double payout(double rate, double hours) {

		// initializing variables
		double regPay = 0;
		double otPay = 0;
		double grosspay = 0;

		// if hours less or equal to 40
		if (hours <= 40) {
			regPay = hours * rate;
			System.out.printf("Regular Pay: $%,2.2f\n", regPay);
			System.out.println("Overtime Pay: $0.00");
		}

		// hours greater than 40. calc overtime pay.
		else if (hours > 40) {
			double othours = hours - 40;
			double reghours = hours - othours;
			regPay = reghours * rate;
			otPay = othours * (rate * 1.5);
			System.out.printf("Regular Pay: $%,2.2f\n", regPay);
			System.out.printf("Overtime Pay: $%,2.2f\n", otPay);
		}

		// calc gross pay
		grosspay = regPay + otPay;
		return grosspay;
	}

	public static void main(String[] args) {

		// scanner user input for pay rate
		Scanner userpay = new Scanner(System.in);
		System.out.println("Enter your hourly pay rate: ");
		double rate = userpay.nextDouble();

		// scanner user input for hours worked
		Scanner userhours = new Scanner(System.in);
		System.out.println("Enter the number of hours worked in a week: ");
		double hours = userhours.nextDouble();

		// print payout which returns the gross pay.
		System.out.printf("Total Gross Pay: $%,2.2f", payout(rate, hours));
	}
}