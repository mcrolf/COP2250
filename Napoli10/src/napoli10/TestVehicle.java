// Michael Napoli  2275778
// TestVehicle Executable Class
/* 
   This is the executable class. In the main method, make 
   an arraylist of five or six Vehicle instances and then 
   use a foreach loop to display them. 
*/

package napoli10;

import java.util.ArrayList;

class TestVehicle
{
	public static void main(String[] args) {
		
		// initialize arraylist
		ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
		
		// populate arraylist
		Vehicle car1 = new Vehicle("Toyota", "Camry", 2021, 29800.00, new Motor(4,186, "Gasoline"));
		inventory.add(car1);
		
		Vehicle car2 = new Vehicle("BMW", "530i", 2020, 46300.00, new Motor(6, 276, "Gasoline"));
		inventory.add(car2);
		
		Vehicle car3 = new Vehicle("Volkswagen", "Golf TDI", 2021, 22600.00, new Motor(4, 142, "Diesel"));
		inventory.add(car3);
		
		Vehicle car4 = new Vehicle("Honda", "Civic", 2008, 9800.00, new Motor(4, 197, "Gasoline"));
		inventory.add(car4);
		
		Vehicle car5 = new Vehicle("Ford", "F 250", 2013, 32000.00, new Motor(8, 230, "Diesel"));
		inventory.add(car5);
		
		Vehicle car6 = new Vehicle("Subaru", "Impreza WRX", 2019, 23000.00, new Motor(4, 260, "Gasoline"));
		inventory.add(car6);
		
		System.out.println("__________List Of Cars___________");
		System.out.println();
		
		// foreach to display inventory
		for (Vehicle v: inventory)
		{
			System.out.println("[" + v.toString() + "]");
		}
	}
}