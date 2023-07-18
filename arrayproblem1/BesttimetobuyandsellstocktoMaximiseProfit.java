package arrayproblem1;

public class BesttimetobuyandsellstocktoMaximiseProfit {

	public static int maxProfit(int[] a) {

		int maxProfit = 0;
		int minProfit = a[0];

		for (int i = 0; i < a.length; i++) {
			minProfit = Math.min(minProfit, a[i]);
			int profit = a[i] - minProfit;
			maxProfit = Math.max(maxProfit, profit);
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int prices[] = { 2, 4, 7, 1, 5, 3, 6, 4 };

		int ans = maxProfit(prices);

		System.out.println(ans);

	}

}
