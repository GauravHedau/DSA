package recursionproblem1;

public class towerofhanoi {

	public static void solveHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
		if (n == 1) {
			System.out.println("Move disk 1 from peg " + fromPeg + " to peg " + toPeg);
			return;
		}
		
		// move disk from fromPg to auxPeg using toPeg
		solveHanoi(n - 1, fromPeg, auxPeg, toPeg);
		System.out.println("Move disk " + n + " from peg " + fromPeg + " to peg " + toPeg);

		// move disk from auxPeg to toPeg using fromPeg
		solveHanoi(n - 1, auxPeg, toPeg, fromPeg);
	}

	public static void main(String[] args) {
		int n = 3; // number of disks
		solveHanoi(n, 'S', 'D', 'A'); // solve the puzzle
	}

}
