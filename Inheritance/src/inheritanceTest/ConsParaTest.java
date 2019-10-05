package inheritanceTest;

public class ConsParaTest extends ConsPara {
	int c;
	int d;
		public ConsParaTest()
	{
		c=0;
		d=0;
	}
		public ConsParaTest(int x, int y, int z, int k)
	{
		super(x,y);		
		c=z;
		d=k;
		
	} 
	public void display()
	{
		super.display();
		System.out.println(c+"\t"+d);
			}

	
}
