package arraybasics;


public class deleteelement {

	// this key is for index means if key = 2 then deleted element is a[2]

	public static void delete(int a[], int key) {

		int b[] = new int[a.length - 1];

		for (int i = 0; i < a.length; i++) {
			if (i < key) {
				b[i] = a[i];
			} else if (i == key) {
				continue;
			} else {
				b[i - 1] = a[i];
			}
		}
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(b[i] + " ");
		}
	}
	
	

	public static void main(String[] args) {

		int a[] = { 2, 3, 5, 1, 8, 7 };
		int key = 3;

		delete(a, key);

	}

}
