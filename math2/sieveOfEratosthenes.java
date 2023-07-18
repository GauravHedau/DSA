package math2;

import java.util.Arrays;

public class sieveOfEratosthenes {

	public static void sieve_Of_Eratosthenes(int n) {

		boolean isPrime[] = new boolean[n + 1];
		Arrays.fill(isPrime, true);

		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = 2 * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {

		sieve_Of_Eratosthenes(20);

	}

}
