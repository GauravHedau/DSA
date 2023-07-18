package hashingProb2;

import java.util.HashSet;

import java.util.Set;

public class longestConsecutiveSubSequence {

	public static int logestConSubSquence(int a[]) {
		Set<Integer> set = new HashSet<>();
		for (int e : a) {
			set.add(e);
		}
		int ans = 0;
		for (int e : set) {
			if (!set.contains(e - 1)) { // if e-1 is not present in set then move forward.
				int len = 1;
				while (set.contains(++e)) {
					len++;
				}
				ans = Math.max(ans, len);
			}
		}
		return ans;

	}

	public static void main(String[] args) {

		int a[] = { 2, 1, 9, 3, 5, 4, 8, 7, 2, 8, 3 };

		System.out.println(logestConSubSquence(a));
	}

}
