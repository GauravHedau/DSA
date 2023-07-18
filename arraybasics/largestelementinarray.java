package arraybasics;

import java.util.Scanner;

public class largestelementinarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int array[] = new int[size];
		
		int largest = Integer.MIN_VALUE;
		
		//input 
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}

		//output
		for(int i=0; i<array.length; i++) {
			if(array[i]> largest) {
				largest = array[i];
			}
		}
		System.out.println(largest + " is the largest element in your array");
		
	}

}
