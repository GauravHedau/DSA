package dynaProg;

import java.util.Arrays;

public class minNumOfCoin {

	static int minCoin(int a[], int n) {

		int dp[] = new int[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;

		minCoinDP(a, n, dp);

		// for print 1 to n coin
//		for (int i = 0; i < dp.length; i++) {
//			System.out.print(dp[i] + " ");
//		}
		return dp[n];
	}

	public static int minCoinDP(int a[], int n, int dp[]) {
		if (n < 0) {
			return Integer.MAX_VALUE;
		}

		if (dp[n] != -1) {
			return dp[n];
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, minCoinDP(a, n - a[i], dp));
		}
		return dp[n] = min + 1;
	}

	public static void main(String[] args) {

		int a[] = { 8, 6, 1 };
		int n = 13;
 
		System.out.println(minCoin(a, n));
	}

}
