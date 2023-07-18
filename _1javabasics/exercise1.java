package _1javabasics;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		//  1 product of two number 
//		System.out.println("Enter first no");
//		int a = sc.nextInt();
//		System.out.println("Enter Second no");
//		int b = sc.nextInt();
//		System.out.println("product of no given no is "+(a*b));
//		
		
//		// 2  area and Perimeter of circle
//		
//		System.out.println("Enter the value of radius of circle");
//		double r = sc.nextDouble();
//		double PIE = 3.142;
//		System.out.println("area of circle");
//		System.out.println(PIE*r*r);
//		System.out.println("Perimeter of circle");
//		System.out.println(2*PIE*r);
		
//		//3 inches to meter 
//		System.out.print("Input a value for inch: ");
//        double inch = sc.nextDouble();
//        double meters = inch * 0.0254;
//        System.out.println(inch + " inch is " + meters + " meters");
//        
//        //4 greatest no of 3 number
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		double c = sc.nextDouble();
//		
//		if(a>b) {
//			if(a>c) {
//			System.out.println("a " + a);
//		    }else {
//		    	System.out.println("c " + c);
//		    }
//		} else {
//			if(b>c) {
//				System.out.println("b " + b);
//			}else {
//				System.out.println("c " + c);
//			}
//		}
		
//		//5 leap year
//		int year =sc.nextInt();
		
//        if (year % 400 == 0) {
//            System.out.println(year + " is a leap year.");
//        } else if (year % 100 == 0) {
//            System.out.println(year + " is not a leap year.");
//        } else if (year % 4 == 0) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }
//        

//
//		//6 swap two number
//		System.out.println("Enter the value of X and Y");  
//	      int  x = sc.nextInt();  
//	      int  y = sc.nextInt();
//	      int t ;
//	       System.out.println("before swapping numbers: "+x +"  "+ y);  
//	       t = x;  
//	       x = y;  
//	       y = t;  
//	       System.out.println("After swapping: "+x +"   " + y);  
//	       System.out.println( );  
		
		
		//7 grade student based on the marks
		
		System.out.println("enter your marks");
		int marks = sc.nextInt();
		
		if(marks>=90) {
			System.out.println("Excellient A");
		}
		else if (marks>=80) {
			System.out.println(" satisfactory B");
		}
		else if (marks>=60) {
		System.out.println("Work hard C");
		}
		else if (marks>=40) {
			System.out.println("Just Passed D");
		}else  {
		System.out.println("FAIL");
		}
		
			

	}

}
