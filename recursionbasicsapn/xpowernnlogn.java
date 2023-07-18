package recursionbasicsapn;

public class xpowernnlogn {

public static int calPower(int x , int n){
		
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}

		//if n is even
		if(n % 2 == 0) {
			return calPower(x , n/2) * calPower(x , n/2);
		}		
		//if n is odd
		else {
			return calPower(x , n/2) * calPower(x , n/2) * x ;
		}
		
}
	public static void main(String[] args) {

		int n =7 ;
		int x =2;
		int ans =  calPower(x  , n);
		System.out.println(ans);
	}

}
