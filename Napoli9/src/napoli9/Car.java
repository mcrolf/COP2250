// Michael Napoli   2275778
/* Class Car (data class, no main method)

	-five instance data members, all private: String make, String model, 
	int year, double price, String color.
	-one static, or class, member named unitsSold assigned a value of 
	zero. Make it public.
	-a no-arg constructor, and another parameterized constructor that 
	sets values in all data members when called. Both constructors should 
	increment the unitsSold static data member.
	-has setters and getters for each data member.
	-a toString() method that returns the state of all data members of a Car instance  */

package napoli9;

class Car 
{
	
	// initialize data members
	private String make;
	private String model;
	private int year;
	private double price;
	private String color;
	
	// static units sold
	public static int unitsSold = 0;
	
	// no args constructor
	public Car() 
	{
		make = "make";
		model = "model";
		year = 0;
		price = 0;
		color = "color";
		unitsSold++;
	}
	
	// parameterized constructor 
	public Car(String make, String model, int year, double price, String color) 
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.color = color;
		unitsSold++;
	}
	
	// get and set for make
	public String getMake() 
	{
		return make;
	}
	public void setMake(String newMake) 
	{
		this.make = newMake;
	}
	
	// get and set for model
	public String getModel() 
	{
		return model;
	}
	public void setModel(String newModel) 
	{
		this.model = newModel;
	}
	
	// get and set for year
	public int getYear() 
	{
		return year;
	}
	public void setYear(int newYear) 
	{
		this.year = newYear;
	}
	
	// get and set for price
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double newPrice) 
	{
		this.price = newPrice;
	}
	
	// get and set for color
	public String getColor() 
	{
		return color;
	}
	public void setColor(String newColor) 
	{
		this.color = newColor;
	}
	
	// to string method for Car instances
	public String toString() 
	{
		return make + " , " + model + " , " + year + " , " + price + " , " + color;
		
	}

}