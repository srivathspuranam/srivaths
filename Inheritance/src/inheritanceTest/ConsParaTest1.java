package inheritanceTest;

public class ConsParaTest1 extends ConsParaTest {
    int i;
		int j;
		public ConsParaTest1()
	{
		i=0;
		j=0;
	}
		public ConsParaTest1(int x, int y, int z, int k, int l, int m)
	{
		super(x,y,z,k);
		i=l;
		j=m;
	}
	public void display()
	{
		super.display();
		System.out.println(i+"\t"+j);
	}

}
