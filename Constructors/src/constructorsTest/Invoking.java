package constructorsTest;

public class Invoking {

	public Invoking()
	{
		System.out.println("Default constructor");
			}
	public Invoking(int x,int y)
	{
		this();
		System.out.println("Two args");
	}
	public Invoking(int x,int y, int z)
	{
		this(10,10);
		System.out.println("Three args");
	}
}
