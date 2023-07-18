package arraybasics;

import java.util.Scanner;

public class searchelement {

	public static int searchElement(int a[] , int x) {
		
		for(int i =0 ; i<a.length; i++) {
			if(a[i] == x) {
				System.out.println(" Found at " + i);
			} 
		}
		return a.length;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a[] = { 1 , 3, 23, 67, 32};
		int x = 23;
		
		searchElement(a , x);
	}

}
