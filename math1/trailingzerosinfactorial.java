package math1; 

public class trailingzerosinfactorial {
	
	// having end with zero number
	static int trailing_zero(int num){
	      int count = 0;
	      for (int i = 5; num / i >= 1; i *= 5){
	         count += num / i;
	      }
	      return count;
	   }

	public static void main(String[] args) {

		int num =35;
		System.out.println(trailing_zero(num));
	}

}
