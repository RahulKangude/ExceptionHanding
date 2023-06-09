package exception;

import java.io.EOFException;

public class Try {
    public static void main(String[] args) {
		try {
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(IllegalAccessError|ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException e){
			 e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
		
    
	}
}
