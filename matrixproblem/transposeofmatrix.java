package matrixproblem;

public class transposeofmatrix {

	public static void printMatrix(int a[][]) {
		int n = a.length;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	public static void transposeOfAMatrix(int a[][]) {
		int n = a.length;
		
		for(int i = 0; i<n; i++) {
			for(int j = i; j<n; j++) {
				int swap = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = swap;
			}
		}
	}

	
	public static void main(String[] args) {

		int a[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		printMatrix(a);
		
		transposeOfAMatrix(a);
				
		System.out.println();
		
		printMatrix(a);
		
	}

}
