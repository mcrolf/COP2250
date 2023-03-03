// Michael Napoli   2275778
//
/*  Write a program that prints the ordinal for a random 
   integer from 0 to 100, inclusive. Example ordinals might 
   be 31st, 62nd, 43rd, 55th. */
package napoli3;


public class Program34{
	public static void main(String[] args) {
		
		int randNum = (int)(Math.random()*101);
		
		if (randNum >=11 && randNum <=19) {
			System.out.println(randNum+"th");
		}
		switch (randNum) {
	    case 1,21,31,41,51,61,71,81,91:
	        System.out.println(randNum+"st");
	    	break;
	    case 2,22,32,42,52,62,72,82,92:
	        System.out.println(randNum+"nd");
	    	break;
	    case 3,23,33,43,53,63,73,83,93:
	        System.out.println(randNum+"rd");
	    	break;
	    default:
	        System.out.println(randNum+"th");
	    }
	}
}