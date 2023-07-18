package recursionproblem1;

public class findnoofpathinnxmmatrixs {
	
	public static int calpathOfMatrixs(int n , int m ) {
		if( n==1 || m==1) {
			return 1;
		}
		int rightPath = calpathOfMatrixs(n , m-1);
		int leftPath = calpathOfMatrixs(n-1, m);
	
		return rightPath + leftPath;

	}

	public static void main(String[] args) {

		System.out.println(calpathOfMatrixs(3, 4));
	}

}
