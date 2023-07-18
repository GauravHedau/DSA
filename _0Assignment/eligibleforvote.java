package _0Assignment;

import java.util.Scanner;

public class eligibleforvote {

	public static boolean eligibleForVote (int age) {
		
		if(age < 18) {
			return false;
		} else {
			return true;
		}
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age");

		int age = sc.nextInt();
		
		System.out.println(eligibleForVote(age));
		
		
		//Q2
		//6. Write an infinite loop using do while condition.

		do {
			
			
		} while(true);
		
	}

}
