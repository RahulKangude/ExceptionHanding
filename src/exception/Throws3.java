package exception;

public class Throws3 {
   public static void main(String[] args) throws InterruptedException {
	 m1();
}
   static void m1() throws InterruptedException {
	   m2();
	   System.out.println("m1 method ");
   }
   static void m2()  throws InterruptedException{
	  
	   System.out.println("m2 method ");
	  Thread.sleep(1000);
   }
   
   
   
}
