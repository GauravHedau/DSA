package _0Assignment;

import java.util.Scanner;

public class circumferenceofcircle {

	public static double circumference (double radius) {
	
		return 2 * 3.142 * radius;
	}
	
	public static void main(String[] args) {

		// Write a function that takes in the radius as input and returns the circumference of a circle.
		

		Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        
        System.out.println("Circumference of Circle " + circumference (radius));
	
	}

}
