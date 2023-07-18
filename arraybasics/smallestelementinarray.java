package arraybasics;

import java.util.Scanner;

public class smallestelementinarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int array[] = new int[size];
		
		int smallest = Integer.MAX_VALUE;
		
		//input 
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}

		//output
		for(int i=0; i<array.length; i++) {
			if(array[i]< smallest) {
				smallest = array[i];
			}
		}
		System.out.println(smallest);
	}

}
