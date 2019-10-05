package inheritanceTest;

public class Test1 extends Sample1 {
	 int c;
	 int d;
	
	public void setData(int x, int y, int z, int k)
	{		
		setData(x,y);		
		c=z;
		d=k;
	}
	
	public void display()
	{
		super.display();
		System.out.println (c+"\t"+d);
	}	

}
