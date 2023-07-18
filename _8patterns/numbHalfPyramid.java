package _8patterns;

public class numbHalfPyramid {

	public static void main(String[] args) {

		int n =5;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		//inverted numb Half Pyramid
		
	int m =5;
		
	 for(int i=m; i>=1; i--) {
         for(int j=1; j<=i; j++) {
             System.out.print(j +" ");
         }
         System.out.println();
     }
 
	}

}
