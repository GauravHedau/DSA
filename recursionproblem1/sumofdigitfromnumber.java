package recursionproblem1;

public class sumofdigitfromnumber {
	
	static int sumOfDigits(int n) {
//		System.out.println(n);
		if(n == 0) return 0;
		
		int lastDigit = n % 10;
		
		return lastDigit + sumOfDigits(n/10);
		
	}

	public static void main(String[] args) {

		int n= 2314;
		System.out.println(sumOfDigits(n));
	}

}
