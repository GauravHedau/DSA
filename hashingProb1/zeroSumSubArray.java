package hashingProb1;

import java.util.*;

public class zeroSumSubArray {

	public static boolean zeroSumSubarray(int a[]) {
		Set<Integer> set = new HashSet<>();

		int cs = 0;
		set.add(0);
		for (int i = 0; i < a.length; i++) {
			cs += a[i];
			if (set.contains(cs))
				return true;
			set.add(cs);
		}
		return false;
	}

	public static void main(String[] args) {

		int a[] = { 1, 4, -3, 2, 1, 2 };
		System.out.println(zeroSumSubarray(a));

	}

}
