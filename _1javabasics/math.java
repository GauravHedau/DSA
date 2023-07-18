package _1javabasics;

import java.lang.Math;

public class math {

	public static void main(String[] args) {
		
		//max
		int a = 10;
		int b = 20;
		System.out.println(Math.max(a, b));
		
		// minimum
		
		System.out.println(Math.min(a, b));

		
		// Random
		int randomNumber = (int)(Math.random()*100);
		System.out.println(randomNumber);
	}

}
