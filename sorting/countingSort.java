package sorting;

public class countingSort {
	
	public static void countingSOrt(int a[]) {
		
		int largest = Integer.MIN_VALUE;
		
		for(int i= 0; i<a.length; i++) {
			largest = Math.max(largest, a[i]); 
		}
		
		int count [] = new int[largest + 1];
		
		for(int i=0; i<a.length; i++ ) {
			count[a[i]]++;
		}
		
		//sorting 
		int j= 0;
		for(int i =0; i<count.length; i++) {
			while(count[i] > 0 ) {
				a[j] = i;
				j++;
				count[i]--;
			}
		}
	}
	
	public static void printArray(int a[]) {
		for(int i=0;i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 1, 4, 1, 3, 2,4, 3, 7 };
		
		System.out.println("Original array");
		printArray(a); 
		System.out.println("Sorted Array");
		countingSOrt(a);
		printArray(a);		
	}
                                                
}



