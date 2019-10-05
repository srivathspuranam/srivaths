package inheritanceTest;

public class Test2 extends Sample2 {
	private int a;
	private int b;
	private int c;
		
	public void setData(int x, int y , int z, int k,int l)
	{	
		setData(x,y);
//super.a=x; invalid, since these are private in sample2
//super.b=y; invalid, since these are private sample2
		a=z;  // own members 
		b=k; //own members
	c=l;
	}
		public void display()
	{	
		super.display();
		System.out.println(a+"\t"+b+"\t"+c);
	}	

}
