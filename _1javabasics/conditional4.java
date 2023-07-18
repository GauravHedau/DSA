package _1javabasics;

public class conditional4 {

	public static void main(String[] args) {
		

//		System.out.println("voting started");
//		int age =28;
//		
//		if(age >=18) {
//			System.out.println("you can vote");
//			System.out.println("hurray");
//		}
//		else {
//			System.out.println("go to sleep");
//		}
//		System.out.println("voting end");
		
		
		
		
//		int marks = 98;
//		
//		if(marks>90) {
//			System.out.println("A");
//		}
//		else if (marks>80) {
//			System.out.println("B");
//		}
//		else if (marks>60) {
//		System.out.println("C");
//		}
//		else if (marks>40) {
//			System.out.println("D");
//		}else  {
//		System.out.println("FAIL");
//		}
	
		
		
		
		//nesting of loop

		int a =90;
		int b=95;
		int c=60;

		if(a>b) {
			if(a>c) {
			System.out.println("a");
		    }else {
		    	System.out.println("c");
		    }
		} else {
			if(b>c) {
				System.out.println("b");
			}else {
				System.out.println("c");
			}
		}
	}
	
}
