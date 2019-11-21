package retest;

public class CustomException extends Exception {

	String message;
	
	public CustomException(String string) {
		// TODO Auto-generated constructor stub
		message = string ;
	}
 public String getMessage()
 {
	return message; 
 }	
}
