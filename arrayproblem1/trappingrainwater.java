package arrayproblem1;

public class trappingrainwater {
	  
	static int trappingRainWater(int a[]) {

		int n = a.length;
		int left[] = new int [n];
		int right[] = new int [n];
		
		left[0] = a[0];
		for(int i=1; i< n; i++) {
			left[i] = Math.max(left[i-1], a[i]);
		}
		
		right[n-1] = a[n-1];
		for(int i=n-2; i>=0; i--) {
			right[i] = Math.max(right[i+1], a[i]);
		}
		
//		dry run
//	    a[] = { 3, 4, 5, 1, 7, 2, 6, 5, 4, 1}
//		 left[] = { 3, 4, 5 ,5 ,7, 7, 7, 7, 7, 7}
//		right[] = { 7, 7, 7, 7, 7, 6, 6, 5, 4, 1}
		 
		int  ans =0;
		for(int i=0; i<n; i++) {
			ans += (Math.min(left[i], right[i]))-a[i];
		}
	
		return ans;
	} 
	public static void main(String[] args) {
		
	
		int a[] = {3, 4, 5, 1, 7, 2, 6, 5, 4, 1};
		
		int ans = trappingRainWater(a);

		System.out.println(ans);
	

	}

}
