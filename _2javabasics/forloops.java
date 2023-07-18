package _2javabasics;

public class forloops {

	public static void main(String[] args) {

//		//for loop
		
//		// i+=1 == i++ == i=i+1
//		
//		for(int i=1;i<=10;i=i+1) {
//			System.out.println("gaurav");
//		}
//		
//		
		//nested loop is mergeing of two loops in a loop called nested loop
		
		int n = 5;
		for (int i=1 ; i<=n; i++) {
			for (int j=1 ; j<=i; j++) {
				System.out.print("* ");
				//removed ln 
			}
			System.out.println();
		}
	}

}

