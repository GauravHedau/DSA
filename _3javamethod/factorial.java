package _3javamethod;

import java.util.Scanner;

public class factorial {


	public static int printFactorial(int n) {
		
		if (n<0) {
			System.out.println("Invalid Number");
			return 1;
		}
		 int factorial = 1;
		 for(int i=1 ; i<=n;i++) {
			 factorial = factorial * i;
		 }
		 
		 System.out.println(factorial);
		 return 1;
	}
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		
		printFactorial(n);
	}

}
