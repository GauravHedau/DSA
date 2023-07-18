package arrayproblem1;

public class BesttimetoBuyandSellStockiI {

	public static int maxProfit(int a[]) {

		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < a.length; i++) {
			if (buyPrice < a[i]) {
				int profit = a[i] - buyPrice;
				maxProfit = Math.max(maxProfit, profit);
			} else {
				buyPrice = a[i];
			}
		}
		return maxProfit;
	}

	public static int totalProfit(int a[]) {
		int totalprofit = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				totalprofit += (a[i] - a[i - 1]);
			}
		}
		return totalprofit;
	}

	public static void main(String[] args) {

		int a[] = { 5, 2, 6, 1, 4, 7, 3, 6 };

		System.out.print("Maximum profit for only 1 trade: ");
		System.out.println(maxProfit(a));

		System.out.print("Total Profit: ");
		System.out.println(totalProfit(a));
	}

}
