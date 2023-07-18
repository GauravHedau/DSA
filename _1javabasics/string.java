package _1javabasics;

public class string {

	public static void main(String[] args) {

		//concatenation
		
		
		String name = new String("Aman"); 
		String description = new String(" is a good boy.");
		
		String sentence = name + description;
		System.out.println(sentence);
		System.out.println(name.concat(description));
		
		// CharAt
		
		String name1 = new String("Aman");
		System.out.println(name1.charAt(2));
		
		// Length
		
		String name2 = new String("Aman");
		System.out.println(name2.length());
		
		// Replace
		
		String name3 = new String("Aman");
		System.out.println(name3.replace('a', 'b'));
		
		//Substring
		String name4 = new String("AmanAndAkku");
		System.out.println(name4.substring(0, 8));
		//substring means its a part of word
	}

}
