 package LinkedList;

import java.util.LinkedList;

public class UsingCollctionFrameWork {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("a"); // by default at last
		list.addFirst("is");
		list.addLast("list");
		list.addFirst("this");
		list.add(3, "gaurav");  // add at any index

		System.out.println(list);

		// size
		System.out.println(list.size());

//		print
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " -> ");
		}
		System.out.println("null");

//		search
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == "is") {
				System.out.println("Present at " + i);
			}
		}
		
		//delete 
//		list.remove();  //by default remove first
//		list.removeFirst();
//		System.out.println(list);
//		
//		list.removeLast();
//		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		list.removeAll(list);
		System.out.println(list);

	}

}
