package arrayproblem1;

public class leadersinarray {

	public static void leader(int a[]) {
		   
		int largest  = Integer.MIN_VALUE;
		
		for(int i=a.length-1 ; i>=0; i--) {
			if (a[i] > largest){
				largest =a[i];
				System.out.print(a[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		//leader : the element which do not have larger element on their right side
		//input =[2, 7, 6, 1, 4, 3 ]
		//leader =[7, 6, 4, 3]
		
		int a[] = { 2, 7, 6, 4, 1, 3};
		leader(a);
	}

}
