package hashingProb1;

import java.util.HashSet;
import java.util.Set;

//T.C O(N)
public class countDistinctElement {

	public static int countDisElement(int a[]) {
		Set<Integer> set = new HashSet<>();
		for(int i =0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		return set.size();
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 1, 3, 2, 4, 2, 4, 5, 7, 5, 4, 2 };
		System.out.println(countDisElement(a));

	}

}
