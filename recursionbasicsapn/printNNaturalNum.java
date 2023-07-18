package recursionbasicsapn;

public class printNNaturalNum {

	public static void printNNatNum (int n) {
		if(n==0) {
			return ;
		}
		printNNatNum(n-1);
		System.out.print(n + " ");
	}
	public static void main(String[] args) {

		int n =5;
		printNNatNum(n);
	}

}
