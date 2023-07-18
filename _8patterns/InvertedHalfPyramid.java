package _8patterns;

public class InvertedHalfPyramid {

	public static void main(String[] args) {

		int h =4;
		
		for(int i=h; i>=1; i--) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//inverted half pyramid rotated by 180 degree

		int k = 4;
	       	
		for(int i=1; i<=k; i++) {
			
			for(int j=1; j<=k-i; j++) {
				System.out.print(" ");
			}

			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

