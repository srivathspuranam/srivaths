package threads;

import org.omg.Messaging.SyncScopeHelper;

public class ThreadClass extends Thread{

	public ThreadClass()
	{
		super("child"); //invoking the constructor
			}
	public void run()
	{
		System.out.println("child thread start");
	try
	{
		for(int i=0;i<5;i++)
		{
			System.out.println ("child : "+i);
			Thread.sleep(200);
		}
	}
	catch (InterruptedException e)
	{
		System.out.println("child interrupted");
			}
	System.out.println("end of child thread");
}
}
