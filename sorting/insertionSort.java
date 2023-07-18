package sorting;

import java.util.Arrays;

public class insertionSort {
	
	public static void inserTionSort(int a[]) {
	
		for(int i = 1; i<a.length; i++) {
			int current = a[i];
			int prev = i-1;
			
			//find out the current position of insertion
			
			while(prev >= 0 && a[prev] > current) {
				a[prev+1] = a[prev];
				prev--;
			}
			
			//insertion
			a[prev+1] = current;
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
		inserTionSort(a);
		printArray(a);
 		
		
		//inbuilt sorting
		Arrays.sort(a);
		printArray(a); 
		
		int b[] = {  4, 6, 3, 5, 7, 2, 1};
//		from starting index to ending index
		Arrays.sort(b, 0 ,4);
		printArray(b); 

	
	}

}