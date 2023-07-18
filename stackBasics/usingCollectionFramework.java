package stackBasics;

import java.util.ArrayDeque;
import java.util.Stack;

public class usingCollectionFramework {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();

//		 we can also use ArrayDeque to implement in stack
//		ArrayDeque<Integer  > stack =  new ArrayDeque<>();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
