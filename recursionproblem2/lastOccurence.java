package recursionproblem2;

public class lastOccurence {
	
	public static int lastOccur(int a[], int key, int i) {
		
		if(i == a.length) {
			return -1;
		}
		
		int isFound = lastOccur(a, key, i+1);
		if(isFound == -1 && a[i] == key) {
			return i;
		}
		
		return isFound;
	}
	
	
	//better approach
	public static int last(int a[] , int key, int i) {
		
		if(i == 0) {
			return -1;
		}
		if(a[i] == key) {
			return i;
		}
		return last(a, key,i-1);
	}

	public static void main(String[] args) {

		int a[] = { 5, 5, 2, 4,2 ,2 ,3 ,4 ,2 ,2 ,3};
		System.out.println(last(a, 4, a.length-1));
	}

}
