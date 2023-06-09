package exception;

public class Throws2 {
	public static void main(String arg[]) throws InterruptedException
	{
		doStuff();
	}
	
	public static void doStuff() throws InterruptedException  
	{
//		try{
			doMoreStuff();
//		}catch(InterruptedException e) {
//			
//		}
	}
	public static void doMoreStuff() throws InterruptedException
	{
	    Thread.sleep(500);
	
		System.out.println("I am in office");
	}
}
