package arrayproblem1;

public class maximumsumsubarray {
	
	//using kadane's algorithm
	
	public static int maxSumSubArray(int a[] ) {
		int cursum =0 ;
		int maxsum = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++) {
			cursum += a[i];
			if(maxsum < cursum) 
				maxsum = cursum;
			if(cursum < 0)
				cursum = 0;
		}
		
		return maxsum;
	}
	
	// in O(n^3)
	
	public static void maxSubArray(int a[]) {
		
		int maxsum = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++) {
			int start = i;
			for(int j=i; j<a.length; j++) {
				int end = j;
				int cursum =0;
				for(int k=start; k<=end; k++) {
					cursum += a[k];
				}
				if(maxsum < cursum) {
					maxsum =cursum;
				}
			}
		}
		System.out.println("Maxsum = " + maxsum);
	}

	public static void main(String[] args) {

		//sub array = sub part of array 
		
		int a[] = { 3 ,2 , -5 , -9, 4, -9 ,-5 };
		
		System.out.println(maxSumSubArray(a));
		
		maxSubArray(a);

	}

}
