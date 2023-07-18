package arraybasics;

import java.util.Scanner;

public class maxmin {

	public static int maxandmin(int numbers[]) {

		int max = Integer.MIN_VALUE; // or int max =0; initialisation step
		int min = Integer.MAX_VALUE; // or int min = - infinity; initialisation step

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Maximum element is " + max);
		System.out.println("Minimum element is " + min);

		return numbers.length;
	}

	public static void main(String[] args) {

		// Find the maximum & minimum number in an array of integers.

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int numbers[] = new int[size];

		// input
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		maxandmin(numbers);

	}

}
