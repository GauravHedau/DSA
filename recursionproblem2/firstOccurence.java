package recursionproblem2;

public class firstOccurence {
	
	public static int firstOccu(int a[],int key, int i) {
		if(i == a.length) {
			return -1;
		}
		
		if(a[i] == key) {
			return i;
		} 
		
		return firstOccu(a, key, i+1);
		
	}

	public static void main(String[] args) {
		
		int a[] = {3, 5, 2, 4, 7, 8, 4, 3, 6};
		int key = 4;
		System.out.println(firstOccu(a, key, 0));
	
	}
}
