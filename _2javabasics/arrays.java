package _2javabasics;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {

		
//		//array
		Scanner sc = new Scanner(System.in);

		
		int[] age = new int[5];

		for (int i=0;i<5;i++) {
			age[i] = sc.nextInt();
		}
		for (int i=0;i<5;i++) {
			System.out.println("age of roll no "+ (i+1)  + " is " + age[i]);
		} 

		
		String name [] = { "gaurav" , "rahul", "ram ", "shyam"};
		
		System.out.println(name[2]);
		
		
		//2d array
	 

		int g [][]  = new int [3][4];
		
		int h [][] = {
				{1, 3, 6 , 7},
				{7, 4, 6, 9}
		};
		
		
	}

}
