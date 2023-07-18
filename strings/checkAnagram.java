package strings;

import java.util.Arrays;

public class checkAnagram {

	public static boolean checkAnagram(String s1 , String s2) {
		
		//create char array of string 
		char []c1 = s1.toCharArray();
		char []c2 = s2.toCharArray();
		
		//sort the char array
		Arrays.sort(c1);
		Arrays.sort(c2);

		if(c1.length != c1.length) {
			return false;
		}
		for(int i=0; i<c1.length; i++) {
			if(c1[i] != c2[i]) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "olhel";
		
		System.out.println(checkAnagram(s1, s2));
	}

}
