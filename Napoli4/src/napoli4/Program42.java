// Michael Napoli   2275778
//
/*  In right triangle ABC below, angle C is 90 degrees, side a = 48 , and side c = 73. 
   Write a Java program that uses class Math to calculate the length of side b and the 
   other two angles (in degrees). Express all measures accurate to two decimal places.
   
   angle C= 90 degrees
   side a= 48
   side c= 73 */
package napoli4;

public class Program42{
	public static void main(String[] args) {
		
	double a = 48;
	double c = 73;
	double C = (Math.PI)/4;
		
	// calculate side b
	double b = Math.sqrt((c*c) - (a*a));
	System.out.printf("The side b is : %.2f", b);
		
	// calculate angle A in degrees
	double A = Math.asin(a/c);
	double degreeA = A*(180/Math.PI);
	System.out.printf("\nThe angle A is : %.2f degrees", degreeA);
			
	// calculate angle B
	double B = Math.asin(b/c);
	double degreeB = B*(180/Math.PI);
	System.out.printf("\nThe angle B is: %.2f degrees", degreeB);
		
	
	}
}