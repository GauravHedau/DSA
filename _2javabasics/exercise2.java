package _2javabasics;

import java.util.Arrays;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//	      //1 greater than the average 
//
//		int array[] = new int[] { 1, 4, 17, 7, 25, 3, 100 };
//		int sum = 0;
//
//		System.out.println("Original Array: ");
//		System.out.println(Arrays.toString(array));
//
//		// for sum
//		for (int i = 0; i < array.length; i++) {
//			sum = sum + array[i];
//		}
//		// for average
//		double average = sum / array.length;
//		System.out.println("The average of the said array is: " + average);
//
//		System.out.print("The numbers in the said array that are greater than the average are: ");
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > average) {
//				System.out.print(array[i] + " ");
//			}
//		}
//		System.out.println();

//			
//		

//		//2 multiplication table upto 10
//	      
//	      System.out.println("Enter the number");
//	      int num = sc.nextInt();
//	      
//	      for(int i =0 ; i<10 ; i++) {
//	    	  System.out.println(num * (i+1));
//	      }

//		//3 sum of an array
//		
//		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int sum =0; 
//		int n = my_array.length;
//		
//		for(int i =0;i<n;i++) {
//			sum = sum +my_array[i];
//		}
//		System.out.println(sum);



		// 4 min AND MAX elment in array

//		int arr[]=new int[10];
//	       System.out.println("Enter elements in array");
//	       int min=Integer.MAX_VALUE;
//	       int max=Integer.MIN_VALUE;
//		
//	       for(int i=0;i<=9;i++)
//	       {
//	         arr[i]=sc.nextInt();
//	         if(arr[i]<min)
//	           {
//	           min=arr[i];
//	           }
//	         if(arr[i]>max)
//	         {
//	           max=arr[i];
//	         }
//	       }
//	       System.out.println("Maximum element is "+max);
//	       System.out.println("Minimum element is "+min);

		

		// 6 smallest number

//		    int a = 20;
//	        int b = 10;
//	        int c = 30;
//	         
//	        int smallest;
//	         
//	        //find the smallest
//	        if(a<b) {
//	            if(c<a) {
//	                smallest = c;
//	            } else {
//	                smallest = a;
//	            }
//	        } else {
//	            if(b<c) {
//	                smallest = b;
//	            } else {
//	                smallest = c;
//	            }
//	        }
//	         
//	        System.out.println(smallest + " is the smallest.");

		// factorial

		int i, fact = 1;
		long num = 5;

		// It is the number to calculate factorial
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);

	}

}
