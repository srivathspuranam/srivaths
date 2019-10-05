
public class Counter {
private int n;
private int counter;/*All static members of the class acquire memory with reference of class name without creating an object.
*/

// private static int counter;

public void setData()
{
	n=++counter;
	}
public void display(){
	System.out.println("curent object"+n);
	System.out.println("T objects"+counter);
}
}
