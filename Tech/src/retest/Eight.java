package retest;

public class Eight{
public static void main(String[] args){
   	try
	{
   	 String  s=null;
    if(s == null) {
    	throw new CustomException("Null Value");
    }  
    System.out.println (s.length());
	}
	catch(CustomException e)
	{
		System.out.println(e.getMessage());
	}
}
}
