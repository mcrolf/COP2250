// Michael Napoli  2275778
// Motor Class
/* 
   Attributes (all private)
	- int cylinders
	- int hp
	- String type (possible values being gas, deisel, electric etc)
   
   Methods (all public)
	- a constructor that can assign values to all attributes
	- getters and for each attribute (setters not needed)
	- a toString method that returns the status of a Motor 
	  instance, all attributes. */

package napoli10;

class Motor
{
	private int cylinders;
	private int hp;
	private String fuel;

	public Motor(int cylinders, int hp, String fuel)
	{
		this.cylinders = cylinders;
		this.hp = hp;
		this.fuel = fuel;
	}
	
	public int getCylinders()
	{
		return cylinders;
	}
	
	public int getHp()
	{
		return hp;
	}
	
	public String getFuel()
	{
		return fuel;
	}
	
	public String toString()
	{
		return "{" + cylinders + "cyl" + " , " + hp + "hp" + " , " + fuel + "}";
	}

}