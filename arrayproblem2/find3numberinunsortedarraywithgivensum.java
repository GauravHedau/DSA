package arrayproblem2;

import java.util.Arrays;

public class find3numberinunsortedarraywithgivensum {

	public static boolean twoSum(int a[], int sum) {
		int l = 0;
		int r = a.length - 1;

		while (l < r) {
			int curSum = a[l] + a[r];
			if (curSum > sum) {
				r--;
			} else if (curSum < sum) {
				l++;
			} else {
				return true;
			}
		}
		return false;
	}

	static boolean threeSum(int a[], int sum) {
		int n = a.length;
		Arrays.sort(a); // function in system use to sort the array
		for (int i = 0; i < n; i++) {
			boolean found = twoSum(a, sum - a[i]);

			if (found) { 
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int a[] = { 4, 3, 5, 1, 4, 2, 1 };
		int sum = 9;
		System.out.println(threeSum(a, sum));
	}

}
