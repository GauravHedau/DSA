package recursionbasicsapn;

public class sumofsquareofn {
	
	public static int sumOfSquareOfN(int n) {
		if(n==1) {
			return 1;
		}

		return (n*n + sumOfSquareOfN(n-1));
		
	}

	public static void main(String[] args) {

		System.out.println(sumOfSquareOfN(4));
	}

}
