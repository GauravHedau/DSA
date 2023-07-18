package recursionproblem1;

public class checkarrayissortedstrictlyincrese {

	//strictly increasing next element is always greater than current element not equal or smaller 
	//example = 12345678 
	
	public static boolean isorted (int a[] , int i) {
		
		if(i == a.length-1) {
			return true;
		}
		
		if(a[i] <= a [i + 1]) {
			//array is sorted till now
			return isorted(a , i +1);
		} else {
			return false;
		}
	}
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5};
	
		System.out.println(isorted(a, 0));
		
	}

}
