package exception;

import java.util.Scanner;
class Agenotvalid extends RuntimeException{
	Agenotvalid(String s){
	super(s);
}
}
public class Practice3 {
	static int age;
	
	static{
		Scanner s=new Scanner(System.in);
		System.out.println("plzz enter age");
		age=s.nextInt();
		
		try {
			if(age<18) 
				throw new Agenotvalid ("your age is not valid for voting");
			
        }
        catch (Agenotvalid e) {
//            System.out.println("Caught");
//            System.out.println(e.getMessage());
//           
        }
	}

public static void main(String[] args) {
	System.out.println("main method");
}	
}
