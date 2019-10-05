package exceptions;

public class TryCatch {
public static void main(String[] args) {
	System.out.println("try catch final");
	try
	{
		int a=10;
		int n=args.length;
		int b=a/n;
		
		System.out.println ("Result ; " + b);

		System.out.println ("First args:" + args[0]);

		System.out.println ("Second args:" + args[1]);

		System.out.println ("Third args:" + args[2]);

		System.out.println ("End of try");
}
	catch(ArithmeticException e)
	{	
	String msg=e.getMessage(); // this is to get message from JVM
	System.out.println("divide by zero error "+msg);			
	e.printStackTrace(); // gives location (line number) of exception.
}
catch(ArrayIndexOutOfBoundsException  e)
{			
	String msg = e.getMessage();// this is to get message from JVM.				
	System.out.println("invalid index "+msg);			
	e.printStackTrace(); // gives location ( line number ) of exception.
}
catch(NumberFormatException   e)
{			
	String msg = e.getMessage();// this is to get message from JVM.				
	System.out.println("Non bumeric value"+msg);			
	e.printStackTrace(); // gives location ( line number ) of exception.
}
System.out.println ("End of main");

}
}
