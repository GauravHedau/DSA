package recursionbasicsapn;

public class factorialcal {
	
	public static int calfactorial(int n ) {
		if (n==1) {
			return 1;
		}
		int fact_nm1 = calfactorial(n-1);
		int fact_n = n * fact_nm1;
		return fact_n;
	}


	public static void main(String[] args) {

		int n = 5;
		
		System.out.println(calfactorial(n));
		
	}

}
