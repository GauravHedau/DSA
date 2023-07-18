package stackBasics;

public class usingArray {

	int a[];
	int capacity;
	int top;

	public usingArray(int capacity) {
		this.capacity = capacity;
		a = new int[capacity];
		top = -1;
	}

	boolean push(int element) {
		if (top == capacity - 1) {
			return false;
		}
		top++;
		a[top] = element;
		return true;
	}

	int pop() throws Exception {
		if (top == -1)
			throw new Exception("Stack is Empty");
		int ans = a[top];
		top--;
		return ans;
 
	}

	public static void main(String[] args) throws Exception {
		usingArray stack = new usingArray(3);
		
		stack.push(2);
		stack.push(4);
		stack.push(3);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
