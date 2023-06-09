package exception;

import java.io.IOException;
import java.util.Scanner;
class Depthisnotvalid extends RuntimeException{
	Depthisnotvalid (String s){
		super(s);
	}
}
public class CustamExcep {
     public static void main(String[] args)   {
	  Scanner s=new Scanner(System.in);
	 System.out.println("Enter your depth");
	 int depth=s.nextInt();
	 
	 if(depth<400) {
		 System.out.println("depth is valid ");
	 }
	 else {
		 throw new Depthisnotvalid ("large depth");
	 }
	 
	}
}
