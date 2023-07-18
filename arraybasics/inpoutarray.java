package arraybasics;

import java.util.Scanner;

public class inpoutarray {

	public static void main(String[] args) {

		// Take an array of names as input from the user and print them on the screen.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = sc.nextInt();

		String name[] = new String[size];

		// input
		System.out.println("Enter name");
		for (int i = 0; i < name.length; i++) {
			name[i] = sc.next();
		}

		// output
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}

	}

}
