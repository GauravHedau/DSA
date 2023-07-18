package matrixproblem;

import java.util.Scanner;

public class basics {

	public static void main(String[] args) {

		int metric [][] =  new int [3][3];
		int n = metric.length;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				metric[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(metric[i][j] +" ");
			}
			System.out.println();
		}
	}

}
