package math2;

public class divisorOfN {

	public static void printDivisor(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				if (n / i != i) {
					System.out.println(n / i);
				}
			}
		}
	}
	
	public static void printSortedDivisors(int n) {
		int i =1;
		for(; i*i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		i--;
		for(; i >= 1; i--) {
			if(n % i == 0) {
				if(n/i != i) 
					System.out.println(n/i);
			}
		}
	}

	public static void main(String[] args) {

		printDivisor(30);
		System.out.println();
		printSortedDivisors(30);
	}

}
