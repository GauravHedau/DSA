package recursionproblem2;

public class friendPairingProblem {
	
	public static int friendsPairing(int n) {
		if(n == 1 || n ==2) {
			return n;
		}
		
		//choices 
		//single 
		int fnm1 = friendsPairing(n-1);
		
		//pair
		int fnm2 = friendsPairing(n-2);
		int pairWays = (n -1) * fnm2;
		
		//totalWays
		int totWays = fnm1 + pairWays;
		return totWays;
		
	}

	public static void main(String[] args) {

		System.out.println(friendsPairing(3));
		
	}

}
