package matrixproblem;

public class Searchelementinmatrix {
	
	static boolean searchInAMatrix(int a[][], int key) {
		
		//this was easily done n*m but we do it in n+m
		
		int row = 0;
		int col = a.length-1;
		
		for(int i =0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i][j] == key) {
					return true;
				}
			}
		}
		return false;
		
	}
	

	public static void main(String[] args) {

		//search element in sorted matrix
		

		int a[][] = {
				{1, 4, 5, 7},
				{2, 5, 6, 9},
				{6, 10, 11, 13},
				{8, 12, 15, 18}
		};
		
		int key = 10;
		 
		System.out.println(searchInAMatrix(a, key));
	}

}
