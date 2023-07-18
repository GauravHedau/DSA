package sorting;

public class selectionSort {
	
	public static void selctionSort(int a[]) {
		
		//minPos is a smallest element at that time in array
		
		for(int i=0; i<a.length-1;i++) {
			int minPos = i;
			for(int j=i+1; j<a.length; j++){
				if(a[minPos] > a[j]) {
					minPos = j;  // or minPos++;
				}
			}
			//swap 
			int temp = a[minPos];
			a[minPos] = a[i];
			a[i] = temp;
		}
	}
	
	public static void printArray(int a[]) {
		for(int i=0;i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 5, 4, 1, 3, 2};
		
		System.out.println("Original array");
		printArray(a); 
		System.out.println("Sorted Array");
		selctionSort(a);
		printArray(a);
 		
	}

}
