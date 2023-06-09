package exception;

import java.util.Arrays;

public class Pract1 {
	static int x=10;
	int y=5;
public static void main(String[] args) {
	
	final int z=30;
	System.out.println(z);
	
	
	
	
	Pract1 p2=new Pract1();
	p2.x=888;
	p2.y=999;
	//System.out.println(p2.y);
	Pract1 p1=new Pract1();
	System.out.println(x);
	
	
	
	System.out.println("the value is\r");
	
	System.out.println(" then the \t the value is");
	
	char ch='\uface';
	System.out.println(ch);
	int x=0Xface;
	System.out.println(x);
	String[] s= {"rahul","pranav","a","om"};
	System.out.println(Arrays .toString(s));
	 
	Object []b=new Object[3];
  b[0]= new String("durga");
	b[2]=new Integer(10);
	String[]a=new String [5];
	System.out.println(Arrays .toString(b));
	float c=10.99f;
	int v=(int) c;
	System.out.println(v);
	
	int []a1= {20,15,78,93};
	int []a2= {2,15,7,9};
	a2=a1;

	System.out.println(Arrays .toString(a2
			));
	
}




}
