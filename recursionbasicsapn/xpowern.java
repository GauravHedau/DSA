package recursionbasicsapn;

public class xpowern {

	public static int calPower(int x, int n) {

		if (n == 0) {
			return 1;
		}
		if (x == 0) {
			return 0;
		}
		int xpowernm1 = calPower(x, n - 1);
		int xpowern = x * xpowernm1;
		return xpowern;
	}

	public static void main(String[] args) {

		int n = 4;
		int x = 2;
		int ans = calPower(x, n);
		System.out.println(ans);
		
	}

}
