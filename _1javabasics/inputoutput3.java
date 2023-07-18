package _1javabasics;

import java.util.Scanner;

public class inputoutput3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter your age");
		int age = sc.nextInt();
		System.out.println("your age is "+ age);
		
		System.out.println("please enter your name");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("your name is "+ name);
	
		
		
	}

}


