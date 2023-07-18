package matrixproblem;

public class searchInSortedMatrices {
	
	public static boolean staircaseSearch(int a[][] , int key) {
		int row =0, col = a.length-1;
		
		while(row < a.length && col >= 0) {
			if(a[row][col] == key) {
				System.out.println("Found key At (" + row + "," + col + ")");
				return true;
			}
			else if(key < a[row][col]) {
				col--;
			}
			else {
				row++;
			}
		}
		System.out.println("Key Not Found!");
		return false;
	}

	public static void main(String[] args) {

		int a[][] = {
				{10, 20, 30, 40},
				{15, 25, 35, 45},
				{27, 29, 3, 48},
				{32, 33, 39, 50}
		};
		staircaseSearch(a, 33);
		
	}

}
