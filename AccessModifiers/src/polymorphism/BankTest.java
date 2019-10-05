package polymorphism;

public class BankTest {
public static void main(String[] args) {
	        Bank s1 = new BOI();       

	System.out.println (s1.getRateOfInterest());
    
    		s1 = new SBI();
    
	  	System.out.println (s1.getRateOfInterest());        
}
}
