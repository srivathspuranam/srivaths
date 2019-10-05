package threads;

public class ThreadTest {
public static void main(String[] args) {
	System.out.println("parent started");
Thread t = new ThreadClass();
System.out.println("child created");
t.start();
try{
	for(int i=0;i<5;i++)
	{
		System.out.println ("parent : "+i);
		Thread.sleep(200);
	}
}
catch (InterruptedException e)
{
	System.out.println("parent interrupted");
	}
System.out.println("end of parent thread");
}
}
