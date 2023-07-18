package math2;

public class check_if_prime_or_not {

	public static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isPrimeEfficient(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isPrimeMoreEfficient(int n) {
		if (n == 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i += 6) { // i*i is any random value until we reach to condition
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {

		int n = 89;
		System.out.println(isPrime(n));
		System.out.println(isPrimeEfficient(n));
		System.out.println(isPrimeMoreEfficient(n));
	}

}
