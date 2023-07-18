package _0Assignment;

import java.util.Scanner;

public class sumofoddnumber {
	
	public static void sumOfOddNumber(int n) {
		int sum =0;
		
		for(int i=1; i<=n; i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);

	}

	public static void main(String[] args) {

		// Write a function to print the sum of all odd numbers from 1 to n.

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sumOfOddNumber(n);
	
	}

}
