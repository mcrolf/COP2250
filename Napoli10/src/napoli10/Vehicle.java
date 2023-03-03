// Michael Napoli  2275778
// Vehicle Class
/* 
   Attributes (all private)
	-String make
	-String model
	-int year
	-double price
	-Motor motor (see below)

	Methods (public)
	- a constructor that can assign values to all attributes
	- a setter for the price
	- a getter for the price
	- a toString method that returns the status of a Vehicle 
	  instance, all attributes. 
*/

package napoli10;

class Vehicle
{
	// Attributes
	String make;
	String model;
	int year;
	double price;
	Motor motor;

	// Vehicle constructor with args
	public Vehicle(String newMake, String newModel, int newYear, double newPrice, Motor newMotor)
	{
		this.make = newMake;
		this.model = newModel;
		this.year = newYear;
		this.price = newPrice;
		this.motor = newMotor;
	}
	
	// getter for price
	public double getPrice()
	{
		return price;
	}
	
	// setter for price
	public void setPrice(double newPrice)
	{
		this.price = newPrice;
	}
	
	// toString method for Vehicle
	public String toString()
	{
		return make + " , " + model + " , " + year + " , " + "$" + price + " , " + motor;
	}
}