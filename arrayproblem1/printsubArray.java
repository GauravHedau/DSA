package arrayproblem1;

public class printsubArray {
	
	public static void printSubArray(int a[]) {
		
		int count =0;
		int n = a.length;
		
		for(int i=0; i<n; i++) {
			int start =i;
			for(int j=i; j<n; j++) {
				int end =j;
				for(int k=start; k<=end; k++) {
					System.out.print(a[k] + " ");
				}
				count++;
				System.out.println();
			}
		}
		System.out.println("Total Subarrays = " + count);

	}

	public static void main(String[] args) {

		int a[] = {2, 4, 6, 8, 10};
		printSubArray(a);
	}

}
