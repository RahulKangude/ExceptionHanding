package exception;

import java.io.IOException;//throws checked exception only for to convience to compliar but result is not change 

public class Propogation {
    public static void main(String[] args)throws IOException {
		M1();
	}
     static void M1() throws IOException{
    	 System.out.println("m1 method ");
    	 M2();
     }
     static void M2() throws IOException{
    	 System.out.println("m2 method ");
    	 System.out.println(10/0);
    	 
    	 
     }
    
    
    
}
