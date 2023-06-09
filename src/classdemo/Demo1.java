package classdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 implements Cloneable {
   public static void main(String[] args)  {
	//int total =gettotal();
	   int  driving=age();
	  
	//System.out.println("toatl number "+total);
}

/* public static int gettotal() throws NullPointerException, CloneNotSupportedException{
	 try {
		 int k=10/0;
		
	} catch (Exception e) {
		System.out.println("cannot devide by zero ");
	}finally {	
		
		
	}
	 Demo1 d1=new Demo1();
	 Demo1 d2=(Demo1) d1.clone();
	return 45252;
}*/
 static int  age () throws NullPointerException {
	 
	 int age1=4;
	 if(age1<18) {
		 System.out.println("not valid for driving lincence");
		 NullPointerException a1=new NullPointerException("not valid age "
				 );
		 throw a1;
	 }else {
		 System.out.println("welcome to driving portal ");
	 }
	 
	return 0;
	 
 }
}  
