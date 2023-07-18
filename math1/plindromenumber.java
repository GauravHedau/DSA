package math1;

public class plindromenumber {

	public static boolean palindromenumber(int n) {
		int rev = 0;
		int temp = n;

		while (temp > 0) {
			int ld = temp % 10;
			rev = rev * 10 + ld;
			temp /= 10;
		}

		return n == rev;
	}

//
//	n = 1441
//	rev =0
//	
//	ld = 1441 % 10 = 1,4,4,1
//	rev = 0 * 10 + ld = 1,14,144,1441
//	temp = 1441/10 = 144,14,1

	public static void main(String[] args) {

		int n = 1234321;
		System.out.println(palindromenumber(n));

	}

}
