package exception;

import java.io.IOException;


 class Student1{ 
	
}


public class Practice2 extends Student1{
	
	static {
		System.out.println(10/0);
	}
	
public static void main(String[] args) {
	System.out.println("statement1"); 
	System.out.println("statement2"); 
	
	/*String s1="rahul";
	Object a1= new Object();//class cast exception 
	String s2=(String) a1;
	
	Practice2 p1=new Practice2();
	Student1 q1=p1;
	System.out.println(q1);
	
	Student1  p2=new Student1();//java.lang.ClassCastException
	Practice2 q2=(Practice2) p2;*/
	
	/*String s3="ten";
	Integer i=new Integer(s3);
	System.out.println(i);//java.lang.NumberFormatException
	*/
	
	/* try {
		 System.out.println("error");
		 getResult ();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	System.out.println("main method end here ");
	
	}
     static void getResult() throws Exception {
    	 System.out.println("statement3"); 
    	 System.out.println("statement4"); 
    	  getresult1();
    	 System.out.println("statement4.1"); 
   }
      static void getresult1()throws ArithmeticException{
    	  System.out.println("statement5"); 
    	  System.out.println("statement6"+10/0);
    	  System.out.println("7");
   }
*/
}
}
