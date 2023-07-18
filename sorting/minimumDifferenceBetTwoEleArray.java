package sorting;

public class minimumDifferenceBetTwoEleArray {
	
	static int findMinDiff(int[] arr, int n)
    {
        int diff = Integer.MAX_VALUE;
 
    
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (Math.abs((arr[i] - arr[j])) < diff)
                    diff = Math.abs((arr[i] - arr[j]));
 
        return diff;
    }

	public static void main(String[] args) {

		int a[] = {6, 18, 1, 9, 14};
		int n = a.length;
		
		System.out.println(findMinDiff(a ,n ));
	}

}
