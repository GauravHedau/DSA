package _0Assignment;

public class fibonacciseries {

	public static void main(String[] args) {

		
//		The Fibonacci series is a series where the next term is the sum of the previous two terms. 
//		The first two terms of the Fibonacci sequence are 0 followed by 1.
//
//		Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		
		//fibonacci series
		
		

			    int n = 10, firstTerm = 0, secondTerm = 1;
			    
			    System.out.println("Fibonacci Series till " + n + " terms:");

			    for (int i = 1; i<=n ; i++) {
    		      System.out.print(firstTerm + ", ");

			      // compute the next term
			      int nextTerm = firstTerm + secondTerm;
			      firstTerm = secondTerm;
			      secondTerm = nextTerm;
			    }
			  

	}

}
