package dynaProg;

import java.util.Arrays;

public class fibbonacciSeries {

	public static int fibbDp(int n, int dp[]) {

		if (dp[n] != -1) {
			return dp[n];

		}
		return dp[n] = fibbDp(n - 1, dp) + fibbDp(n - 2, dp);

	}

	public static int fibb(int n) {
		if (n == 0) {
			return 0;
		}
		int dp[] = new int[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		dp[1] = 1;

		fibbDp(n, dp);

		return dp[n];

	}

	public static void main(String[] args) {

		int n = 6;
		System.out.println(fibb(n));
	}

}
