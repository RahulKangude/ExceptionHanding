package exception;

public class Throws  {
     public static void main(String[] args)   {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			
		}
    	 System.out.println(10/0);
    	 
    	// Thread.sleep(1000);
    	 System.out.println("main");
	
    	
    	 
		
	}
}
