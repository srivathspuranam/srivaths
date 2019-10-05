
public class StaticWithoutObject {
private int n;
static int counter;
public void setData(){
n=++counter ;
}
public void display()
{
	System.out.println("currentt object"+n);
	System.out.println("t objects"+counter);
}
}
