package hashingProb1;

import java.util.HashSet;
import java.util.Set;

public class intrsctionOfTwoArray {

	public static int interSection(int a[], int b[]) {
		Set<Integer> set = new HashSet<>();

		int count = 0;
		for (int x : a) {
			set.add(x);
		}

		for (int x : b) {

			if (set.contains(x)) {
				System.out.print(x + " ");
				count++;
				set.remove(x); //if more than one time same element is present in second array
			}
		}
		System.out.println();
		return count;
	}

	public static void main(String[] args) {

		int a[] = { 5, 10, 15, 5, 10 };
		int b[] = { 15, 10, 4 ,15};

		System.out.println(interSection(a, b));

	} 

}
