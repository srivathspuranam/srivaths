package immutableClass;

final public class Immutable {
final private int a;
final private int b;

public Immutable()
{
	a=0;
	b=0;
	}
//copying one object data into another object.
	public Immutable(Immutable s)
	{
		a=s.a;
		b=s.b;
		}
	// initialization
	public Immutable(int a, int b)
	{
		this.a =a;
		this.b =b;
	}
		public int geta() {
		return a;
	}
		public int getb() {
			return b;
	}
	// cloning 
	public Immutable newInstance()
	{		
		Immutable  temp = new Immutable(a, b) ;			
		return temp;
}
}