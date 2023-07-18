package arrayproblem1;

public class frequencyOfElement {

	static int countFreq(int a[] , int key ) {
		
		int count =0;
		for(int i=0; i<a.length;i++) {
			if(key == a[i]) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 6, 1, 3, 6 , 7, 3};
		int key =3;
		System.out.println(countFreq(a, key) + " times in given array");
	}

}
