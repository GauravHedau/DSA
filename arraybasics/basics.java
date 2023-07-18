package arraybasics;

import java.util.Scanner;

public class basics {

	public static void main(String[] args) {
		
		int[] marks = new int[3];
		marks[0] = 97;
		marks[1] = 98;
		marks[2] = 95;
		
		//OR
		
		int[] marks1 = {98, 97, 95};
		
		
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
	
		
		for (int i=0; i<marks.length;i++) {
			System.out.print(marks[i]+ " ");
		}
		
		System.out.println();
		 
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.println("Enter your size of an array");
	       int size = sc.nextInt();
	       int numbers[] = new int[size];
	 
	       for(int i=0; i<size; i++) {
	           numbers[i] = sc.nextInt();
	       }
	 
	       //print the numbers in array
    	   System.out.println("Your numbers array is");

	       for(int i=0; i<numbers.length; i++) {
	           System.out.print(numbers[i]+" ");
	       }

	}

}
