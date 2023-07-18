package matrixproblem;

public class diagonalSum {

	public static int diagonalsum(int a[][]) {

		int leftD =0;
		int rightD = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					leftD += a[i][j];
				} else if ((i + j) == (a.length - 1)) {
					rightD += a[i][j];
				}
			}
		}
		System.out.println("Primary diagonal sum : " + leftD);
		System.out.println("Secondary diagonal sum : " + rightD);

		return leftD + rightD;
	}

	public static int optimizeWay(int a[][]) {
		int primary =0;
		int secondary =0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			
			sum += a[i][i];
			primary += a[i][i];

			if (i != a.length - 1 - i) {
				sum += a[i][a.length - i - 1];
				secondary += a[i][a.length - i - 1];
			}
		}
		System.out.println("Primary diagonal sum : " + primary);
		System.out.println("Secondary diagonal sum : " + secondary);

		return sum;
	}

	public static void main(String[] args) {

		int a[][] = { 
				    { 1, 2, 3, 4 }, 
				    { 5, 6, 7, 8 },
				    { 9, 10, 11, 12 },
				    { 13, 14, 15, 16 } };
		
		System.out.println(diagonalsum(a));

		System.out.println(optimizeWay(a));
	}

}
