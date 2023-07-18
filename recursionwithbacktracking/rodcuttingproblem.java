package recursionwithbacktracking;

public class rodcuttingproblem {
	
	public static int maxrod(int N, int a, int b, int c) {
		if(N == 0) {
			return 0;
		}
		if(N < 0) {
			return -1;
		}
		
		int cutA = maxrod(N-a, a, b, c);
		int cutB = maxrod(N-b, a, b, c);
		int cutC = maxrod(N-c, a, b, c);
		
		return maxrod(N, cutA, cutB, cutC);

	}

	public static void main(String[] args) {

		
	}

}
