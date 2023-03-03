// Michael Napoli 2275778
/* Write a program that prompts for a full name 
   (first and last) and assigns it to one string. 
   The program then passes the full name to a void 
   method as its sole parameter. The void method 
   should print the first name, on one line, as many 
   times as indicated by the length of the last name.  */

/* My Comments:
	- I had to do a while loop with scanner class methods to
	  make this work. I'm not sure if it can be done in a more 
	  simple way.*/

package napoli6;

import java.util.Scanner;

public class Program62{
	
	public static void namerepeat(String fullname) 
	{	
		Scanner sc = new Scanner(fullname);
		
		int count = 0;
		String firstname = "";
		String lastname = "";
		while (sc.hasNext())
		{
			if (count == 0)
			{
				firstname = sc.next();	
			}
			if (count == 1)
			{
				lastname = sc.next();
			}
			 
			count++;
		}
		
		for(int i = 0; i < lastname.length(); i++) 
		{
			System.out.print(firstname + " ");
		}
		
	}
	
	
	public static void main(String[] args) 
	{	
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String fullname = userinput.nextLine();	
	
		namerepeat(fullname);
	}
}