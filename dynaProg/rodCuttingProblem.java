package dynaProg;

import java.util.Arrays;

public class rodCuttingProblem {

	public static int rodCuttingPr(int price[], int n) {
		int dp[] = new int[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;

		rodCutPrDP(price, n, dp);

		for (int i = 0; i < price.length; i++) {
			System.out.print(price[i] + " ");
		}
		return dp[n];
	}

	public static int rodCutPrDP(int price[], int n, int dp[]) {

		if (n == 0) {
			return 0;
		}
		if (n < 0) {
			return -100000000;
		}
		if (dp[n] != -1) {
			return dp[n];
		}
		int max = -1;
		for (int i = 0; i < price.length; i++) {

			max = Math.max(max, price[i] + rodCutPrDP(price, n - i - 1, dp));
		}

		return dp[n] = max;
	}

	public static void main(String[] args) {

		int n = 5;
		int prices[] = { 3, 6, 10, 9, 12 };

		System.out.println(rodCuttingPr(prices, n));
	}

}
