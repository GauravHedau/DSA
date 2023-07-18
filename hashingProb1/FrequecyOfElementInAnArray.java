package hashingProb1;

import java.util.HashMap;
import java.util.Map;

public class FrequecyOfElementInAnArray {

	public static void freqOfElement(int a[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int curr = a[i];
			if (map.containsKey(curr)) {
				int freq = map.get(curr);
				map.put(curr, freq + 1);
			} else {

				map.put(curr, 1);
			}
			System.out.println(curr + " " + map); // this is not require written only for understanding
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 3, 2, 4, 2, 4, 5, 7, 5, 4, 2 };

		freqOfElement(a);

	}

}
