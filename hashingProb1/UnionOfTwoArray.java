package hashingProb1;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {

	public static int union(int a[], int b[]) {
		Set<Integer> set = new HashSet<>();
		for (int x : a) {
			set.add(x);
		}
		for (int x : b) {
			set.add(x);
		}
		System.out.println(set);
		
		System.out.print("Size of Union : ");
		return set.size();
	}

	public static void main(String[] args) {

		int a[] = { 5, 10, 15, 5 };
		int b[] = { 10, 15, 4 };

		System.out.println(union(a, b));
	}

}
