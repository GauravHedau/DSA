package _8patterns;

import java.util.Scanner;

public class solidrectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Length of rectangle : ");
		int a = sc.nextInt();
		System.out.println("Enter breadth of rectangle ");
		int b = sc.nextInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
