package recursionproblem1;

import java.util.HashSet;
import java.util.Set;

public class generatesubstsofstring {

	static void generateAllSubsets(String s) {
		Set<String> set = new HashSet<>();
		
		utilGenerateAllSubsets(s, 0, "", set);
		for (String st : set) {
			System.out.println(st);
		}
	}

	static void utilGenerateAllSubsets(String s, int i, String cur, Set<String> set) {
		if (i == s.length()) {
//			System.out.println(cur);
			set.add(cur);
			return;
		}

		utilGenerateAllSubsets(s, i + 1, cur, set);
		utilGenerateAllSubsets(s, i + 1, cur + s.charAt(i), set);
	}

	public static void main(String[] args) {

		generateAllSubsets("abc");
	}

}
