package _1javabasics;

public class HelloWorld1 {

	public static void main(String[] args) {

		System.out.print("Hello World");
		
		System.out.println("Hello World"); // ln for next line
	
		    byte a = 2;
		    System.out.println(a);
		    
	    	int age = 50;
	    	System.out.println(age);
	    	
	    	float rate =7.89f;
	    	System.out.println(rate);
	    	
	    	double marks =78.999990865;
	    	System.out.println(marks);
	    	
	    	boolean result = true;
	    	System.out.println(result);
	    	
	    	char grade ='B';
	    	System.out.println(grade);
	    	
	    	String name = "Gaurav";
	    	System.out.println(name);
	 
	    	int gaurav ='B';
	    	System.out.println(gaurav);
	    	//in output the value of b is 66 where 66 is ASCII value of B
		
	    	float price = 100.00F;
	    	int gst = 18;
	    	float finalPrice = price + gst;
            System.out.println(finalPrice);
            //implicit casting 
            
            int price1 = 100;
            float gst1 = 18.00F;
            int finalPrice1 = price1 + (int)gst1;
            System.out.println(finalPrice1);
            //explicit casting 
	    	
	}

}
