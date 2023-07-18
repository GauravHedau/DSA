package arrayproblem1;

public class containerwithmostwater {
	
	static int containerWithMostWater(int a[]) {
		
		int maxArea = 0;
		int l =0;
		int r = a.length-1;
		
		while(l < r) {
			int height = Math.min(a[l], a[r]);
			int distance = r-l;
			
			int area = height * distance;
			maxArea = Math.max(maxArea, area);
			
			if(a[l] < a[r]) {
				l++;
			} else {
				r--;
			}
		}
		
		return maxArea;
	}
	
	

	public static void main(String[] args) {

		int a[] = {6, 4, 2, 5, 4, 6, 1, 3, 5};
		int  ans = containerWithMostWater(a);
		System.out.println(ans);

	}

}
