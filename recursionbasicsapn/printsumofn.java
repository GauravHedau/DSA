package recursionbasicsapn;

public class printsumofn {
	
	public static int printSum(int n) {
	
		if(n==0) {
			return 0;
		}
		int sumOfN = n + printSum(n-1);
		
		return sumOfN;
	}	
	public static void main(String[] args) {

		int n=5 ;

		System.out.println(printSum(n));
				
	}
 
}
