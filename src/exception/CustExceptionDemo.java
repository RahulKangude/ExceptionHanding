package exception;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
	TooYoungException(String s){
		super(s);
	}
}
class ToooldException extends RuntimeException{
	ToooldException(String s){
		super(s);
	}
}

public class CustExceptionDemo{
	
public static void main(String[] args) {
//   Scanner s1 =new Scanner(System.in);
//   System.out.println("plzz enter your age");
//     int age =s1.nextInt();
	System.out.println("main");
     int age=Integer.parseInt("17");
	if(age >60) {
		throw new TooYoungException("plzz wait for some time you get best match "); 
	}else if (age<18){
		throw new  ToooldException ("your age is already crossed limit do not registor ");
	}else {
		System.out.println("you  are eligible for and you will get your matching detail form mail");
	}
}
}
 