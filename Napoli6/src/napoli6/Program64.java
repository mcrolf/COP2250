// Michael Napoli 2275778
/* Write a program that demonstrates method overloading by defining and 
   calling methods that return the area of a triangle, a rectangle, or a square.  */

package napoli6;

public class Program64 {
	
	public static float triangle(float side, float side2, float side3) {
		
		float s = (side + side2 + side3)/2;
		float func = s*(s-side)*(s-side2)*(s-side3);
		float area =(float) Math.sqrt(func);
		
		return area;
	}
	
	public static double triangle(double side, double side2, double side3) {
		
		double s = ((side + side2 + side3)/2);
		double func = (s*(s-side)*(s-side2)*(s-side3));
		double area = Math.sqrt(func);
		
		return area;
	}
	
	public static int square(int side) {
		
		int area = side * side;
		
		return area;
	}
	
	public static double square(double side) {
		
		double area = side * side;
		
		return area;
	}
	
	public static int rectangle(int side, int side2) {
		
		int area = side * side2;
		
		return area;
	}
	
	public static double rectangle(double side, double side2) {
		
		double area = side * side2;
		
		return area;
	}
	
	public static void main(String[] args) {
		
		System.out.println("A triangle with the sides 3, 5.25 and 10 has an area of: " + triangle(3, 5.25, 10));
		
		System.out.println("A square with a side of length 13 has an area of: " + square(13));
		
		System.out.println("A square with a side of length 5.4 has an area of: " + square(5.4));
		
		System.out.println("A rectangle with the sides 4 and 7.8 has an area of: " + rectangle(4, 7.8));
	}
	
}