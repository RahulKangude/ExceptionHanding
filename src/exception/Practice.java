package exception;

public class Practice {
public static void main(String[] args) {
	
	int a=10;
	try {
		System.out.println("statement 1");
		System.out.println("statement 2    "+a/0);
		System.out.println("statement 3");
     	try {
     		System.out.println("1" );
     		//System.out.println("2  "+a/0);
     	}	
		catch(ArithmeticException e) {
			System.out.println("3");
			System.out.println("4");
		}finally {
			System.out.println("5");
			System.out.println("6");
	}
	}
	catch(NullPointerException e) {
		
		System.out.println("statement 12 " +a/2);
		System.out.println("statement 13 ");
	}
	finally {
		System.out.println("statement 7");
		System.out.println("statement 8");
		System.out.println("statement 9");
	}

	System.out.println("statement 10");
}
}
