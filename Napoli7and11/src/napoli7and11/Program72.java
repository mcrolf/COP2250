// Michael Napoli   2275778
/* write a program that takes two double command line arguments 
   representing the sides of a rectangle. The program should 
   then call a void function that reports the area of the 
   rectangle accurate to three decimal places.  */

package napoli7and11;

class Program72 {
	
	public static void main(String[] args) {
		
		System.out.printf("The area is %,2.3f", rectangle(args));
	}
	
	public static double rectangle(String[] args) {
		
		for (int i=0; i<args.length; i++) {
			Double.parseDouble(args[i]);
		}
		
		double side1 = Double.parseDouble(args[0]);
		double side2 = Double.parseDouble(args[1]);
		
		double area = side1 * side2;
		return area;
	}
}