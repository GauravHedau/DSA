package sorting;

public class intersectionOfTwoSortedArrays {

	public static void intersectionTwoArray(int a[], int b[]) {
		
		int i =0;
		int j =0; 
		
		while(i < a.length && j < b.length) {
			
			if(a[i] == b[j]) {
				System.out.print(a[i] + " ");
				i++;
				j++;
			} else if(a[i] > b[j]) {
				j++;
			} else if(a[i] < b[j]) {
				i++;
			}
		}
	}
	public static void main(String[] args) {

		int a[] = { 2, 5, 6, 6, 8, 8};
		int b[] = {1, 1, 2, 3, 6, 6, 9};
		
		intersectionTwoArray(a, b);
		
	}

}
