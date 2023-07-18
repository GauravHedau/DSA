package hashingProb1;

import java.util.HashSet;
import java.util.Set;

public class pairWithGivenSumInUnsortedArray {

	static class Pair {
		int a, b;

		Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	static Pair pairWithGivenSum(int a[], int sum) {
		Set<Integer> set = new HashSet<>();
		for (int e : a) {
			int comp = sum - e;
			if (set.contains(comp))
				return new Pair(e, comp);
			set.add(e);
		}
		return null;
	}

	// another solution

	static void printpairs(int arr[], int sum) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];

			// checking for condition
			if (s.contains(temp)) {
				System.out.println(temp + " " + arr[i]);
				return;
			}
			s.add(arr[i]);
		}
		System.out.println("Not Found");
	}

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 5, 6, 3, 2 };
		int sum = 10;
		Pair pair = pairWithGivenSum(a, sum);
		if (pair != null)
			System.out.println(pair.a + " " + pair.b);

		printpairs(a, sum);
	}

}
