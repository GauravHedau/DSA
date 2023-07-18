package arrayproblem1;

import java.util.HashSet;

public class removedublicatefromarray {

	public static void removeDuplicate(int a[]) {

		int n = a.length;
		int j = 0;
		int count = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j] = a[i];
				j++;
				count++;
			}

		}
		a[j] = a[n - 1];
		j++;

		for (int i = 0; i <= count; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void remove(int a[]) {
		
		HashSet<Integer> list = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			list.add(a[i]);
		}
		System.out.println(list);
	}

	public static void main(String[] args) {

		int a[] = { 2, 2, 3, 3, 3, 4, 55, 55, 7, 7 };

		removeDuplicate(a);

		System.out.println();
		
		remove(a);
	}

}
