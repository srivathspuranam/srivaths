package threads;

public class Run implements Runnable
{
	Thread t;

	public Run()
	{
		t=new Thread(this,"child");
		t.start();
	}

	public void run()
	{
		System.out.println ("Child thread started");
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println ("child : "+i);
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println ("Child Interrupted");
		}
		
		System.out.println ("end of child thread");		
	}
}

