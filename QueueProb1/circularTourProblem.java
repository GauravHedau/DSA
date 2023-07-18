package QueueProb1;

public class circularTourProblem {

	public static int circularTourProb(int p[], int d[]) {
		int n = p.length;
		int start = 0;
		int cur = 0;
		int deficet = 0;

		for (int i = 0; i < n; i++) {
			cur += (p[i] - d[i]);
			if (cur < 0) {
				deficet += cur;
				cur = 0;
				start = i + 1;
 
			}
		}
		if (cur + deficet >= 0) {
			return start;
		}
		return -1;
	}

	public static void main(String[] args) {

		int p[] = { 6, 10, 2, 3, 20 };
		int d[] = { 5, 8, 4, 5, 6 };

		System.out.println(circularTourProb(p, d));
	}

}
