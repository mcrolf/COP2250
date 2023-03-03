// Michael Napoli   2275778
/* In main:
	  Declare an array capable of holding five first names.
	  Populate the array in a for loop by entering five first names all on one line separated by spaces.
	  sort the array alphabetically.
	  Use a foreach loop (see page 255) to process the sorted array and display the names on one line 
	  separated by spaces.
	  Execute a void method with the sorted array as its only argument.
	
	In the void method:
	  Create an arraylist of Strings.
	  Use a loop (of any type) to put the names in the array into the arraylist.
	  Add another name (you choose it) at the end of the arraylist.
	  Remove the name at the start of the arraylist.
	  Add Abdul as the new name at the start of the arraylist.
	  Use a foreach loop to process the arraylist and display the names all on one line separated by spaces. */

package napoli7and11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Program73{
	
	public static void main(String[] args) {
		
		String[] names = new String[5];
		
		Scanner username = new Scanner(System.in);
		System.out.println("Enter 5 names separated by spaces: ");
		String name = username.nextLine();
		names = name.split(" ");
		
		Arrays.sort(names);
		
		System.out.print("Names in sorted Array: ");
		for (String i: names) {	
			System.out.print(i + " ");
		}
		process(names);
	}
	
	public static void process(String[] names) {
		
		ArrayList<String> namelist = new ArrayList<>(5);
		
		for (int i=0; i<names.length; i++) {	
			namelist.add(i, names[i]);	
		}
		
		namelist.add("Carl");
		
		namelist.remove(0);
		
		namelist.add(0, "Abdul");
		
		System.out.println();
		System.out.print("Final names in arraylist: ");
		for (String i : namelist) {
			System.out.print(i + " ");
		}	
	}
}