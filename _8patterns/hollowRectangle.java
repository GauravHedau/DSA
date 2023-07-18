package _8patterns;

import java.util.Scanner;

public class hollowRectangle {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	       
		    int m=6;
		    int n=4;
			
		       for(int i=0; i<n; i++) {
		           for(int j=0; j<m; j++) {
		               if(i == 0 || i == n-1 || j == 0 || j == m-1) {
		                   System.out.print("* ");
		               } else {
		                   System.out.print("  ");
		               }
		           }
		           System.out.println();
		       }

	}

}
