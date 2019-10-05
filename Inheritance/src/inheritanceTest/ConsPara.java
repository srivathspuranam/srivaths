package inheritanceTest;

public class ConsPara {

	int a;
	int b;
	
	public ConsPara()
	{
		a=0;
		b=0;
			}
	public ConsPara(int x,int y)
	{
		a=x;
		b=y;
	}
		public void display()
		{
			System.out.println(a+"\t"+b);
		}
	}
