package _0Assignment;

import java.util.Scanner;

public class average {
	
	
	public static void main(String arg[]) {
		
		// Enter 3 numbers from the user & make a function to print their average.

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    
	    double average = (x + y + z)/3;
	    		
	    System.out.println(average);
	    	    
		
	}

}
