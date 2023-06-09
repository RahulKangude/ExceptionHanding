package exception;

import java.util.Scanner;

class Agetosmall extends Exception{
	Agetosmall(String age){
		super(age);
	}
}
public class CustamizeException {// for checked exception
   public static void main(String[] args) {
	   try{
		   Licence();
	   }catch(Exception e) {
		   System.out.println(e);
	   }
	}
    static void Licence() throws Agetosmall {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter your age\n");
   int age=s.nextInt();
   if(age<18) {
	   throw new Agetosmall("under age");
   }else {
	   System.out.println("valid age you can apply");
   }   
}
}
