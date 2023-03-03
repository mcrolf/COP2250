// Michael Napoli   2275778
/* In Class CarsTest 
	code a main method and another value-returning method named carsValue

	In main: 
		-create at least six Car instances, ensuring that at least three have model years less than 2018.
		-create at least four Car instances using the parameterized constructor.
		-create at least two more Car instances with the no-arg constructor
		-use the Car class setter methods to assign values to all data members of these two cars.
		-use the "array initializer" syntax to make an array to hold all Car objects.
		-call the method named carsValue with the array as its sole argument.
		-print the value returned by carsValue and the value in the unitsSold data member. 
	In carsValue:
		-use a foreach loop to process the array passed into the method as follows:
			-reduce the price of all vehicles with model years less than 2018 by 25%.
			-print the state of each Car object using the toString method.
			-calculate the total value of the Car objects in the array.
		-return the total value to main.  */

package napoli9;

class CarsTest {
	
	public static void main(String[] args) 
	{
		// array initializer
		Car inventory[] = new Car[6];
		
		// 2 new cars with no-args constructor
		Car car1 = new Car();
		car1.setMake("Nissan");
		car1.setModel("Sentra");
		car1.setYear(2019);
		car1.setPrice(16000.00);
		car1.setColor("Silver");
		inventory[0] = car1;
		
		Car car2 = new Car();
		car2.setMake("Volvo");
		car2.setModel("XC70");
		car2.setYear(2017);
		car2.setPrice(35500.00);
		car2.setColor("Black");
		inventory[1] = car2;
		
		// 4 new cars with parameterized constructor
		Car car3 = new Car("Toyota", "Tacoma", 2021, 36000.00, "Grey");
		inventory[2] = car3;
		
		Car car4 = new Car("Honda", "Civic", 2020, 17000.00, "Red");
		inventory[3] = car4;
		
		Car car5 = new Car("Volkswagen", "GTI", 2021, 21000.00, "Blue");
		inventory[4] = car5;
		
		Car car6 = new Car("Volkswagen", "Jetta", 2021, 22000.00, "Silver");
		inventory[5] = car6;
		
		System.out.println("______Inventory_______");
		System.out.println(carsValue(inventory));
		System.out.println("Units Sold: " + Car.unitsSold);
		
	}
	
	public static String carsValue(Car[] inventory)
	{
		// initialize total price
		double totalPrice = 0;
		// for each loop to process array
		for (Car c: inventory)
		{
			// 25% price reduce for year < 2018
			if (c.getYear() < 2018)
			{
				c.setPrice(c.getPrice()*.75);
			}
			System.out.println("[" + c.toString() + "]");
			totalPrice += c.getPrice();
		}
		String.valueOf(totalPrice);
		return String.format("Total Price: $%,2.2f ", totalPrice);
	}
	
}