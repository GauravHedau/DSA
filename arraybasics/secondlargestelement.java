package arraybasics;

import java.util.Scanner;

public class secondlargestelement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int size = sc.nextInt();
		int array[] = new int[size];
		
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		//input 
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		//output
		
		//for largest
	
		for(int i=0; i<array.length; i++) {
		if(array[i] >largest) {
			largest = array[i];
			}
		}
		
		// for second largest
		for(int i=0; i<array.length; i++) {
			if(array[i] > secondlargest) {
				if(array[i] < largest) {
					secondlargest = array[i];
				}
			}
		}

		System.out.println(secondlargest);

	}

}
