package strings;

import java.util.Scanner;

public class stringBasics {

	public static void printLetter(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");

		}
		System.out.println();
	}

	public static void main(String[] args) {

		char arr[] = { 'a', 'b', 'c', 'd' };
		System.out.println(arr);

		String str = "abcd";
		System.out.println(str);

		String str2 = new String("xyz@1234");
		System.out.println(str2);

		// String are IMMUTABLE

		// concatenation
		String firstName = "Gaurav";
		String lastName = "Hedau";

		System.out.println(firstName + " " + lastName);

		System.out.println(firstName.charAt(3));

		printLetter(lastName);
		
		
		String s1 = "tony";
		String s2 = "tony";
		String s3 = new String("tony");
		
		if(s1 == s2) {
			System.out.println("String are equal");
		} else {
			System.out.println("Stirng are not equal");
		}

		if(s1 == s3) {
			System.out.println("String are equal");
		} else {
			System.out.println("Stirng are not equal");
		}
		
		
		if(s1.equals(s3)) {
			System.out.println("String are equal");
		} else {
			System.out.println("Stirng are not equal");
		}

		Scanner sc = new Scanner(System.in);
		String name;

		name = sc.nextLine();
		System.out.println(name);

		// to count length of string
		System.out.println(name.length());

	}

}
