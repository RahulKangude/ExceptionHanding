package exception;
import java.util.Scanner;
public class Passcustum {
     public static void main(String[] args) {
    	
		System.out.println("main method ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Amount in lakh ");
		int amount =sc.nextInt();
		
		if(amount<10) {
			throw new ToLowBuget("your buget is to low");}
		else {
			throw new TohighBuget("you  purchase a car");
		}
		
	}
}

class ToLowBuget extends RuntimeException{

	public ToLowBuget(String msg) {
		super(msg);
}
}

class TohighBuget extends RuntimeException{

	public TohighBuget(String msg) {
		super(msg);
}
}




