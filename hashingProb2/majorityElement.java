package hashingProb2;

import java.util.*;

public class majorityElement {

	public static void majorityElement(int a[]) {

		HashMap<Integer, Integer> map = new HashMap<>();

		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1); // initialize by one
			}
		}
		for (int key : map.keySet()) {
			if (map.get(key) > n / 3) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 3, 2, 1, 5, 2, 3, 2, 5, 1 };
		majorityElement(a);

		int a2[] = { 1, 2 };
		majorityElement(a2);

	}

}
