package exception;

public class Test extends RuntimeException  {
	
	public static void main(String[] args) throws InterruptedException {
		
		m1();
		
	}
static void m1() throws InterruptedException{
	Thread.sleep(1000);
	
}

}
