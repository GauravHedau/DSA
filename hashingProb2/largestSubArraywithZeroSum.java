package hashingProb2;

import java.util.*;

public class largestSubArraywithZeroSum {

	public static int largestSubArray(int a[]) {

		Map<Integer, Integer> map = new HashMap<>();
	//put -1 at 0th index
		map.put(0, -1);
		
		int ans = 0;

		
		//Cumulative sum
		int cs = 0;
		for (int i = 0; i < a.length; i++) {
			int e = a[i];
			cs += e;
			if (map.containsKey(cs)) {
				int prev = map.get(cs);
				ans = Math.max(ans, i - prev);
			} else {
				map.put(cs, i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int a[] = { 2, 5, -3, -4, 2, 3, 2};
		System.out.println(largestSubArray(a));
	}

}
