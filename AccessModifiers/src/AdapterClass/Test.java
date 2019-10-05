package AdapterClass;

public class Test {
public static void main(String[] args) {
	A c1 = new A(); //calling m1 method from A.
	AdapterClass c2= new AdapterClass(); //calling m1 from method AdapterClass
	
	c1.m1();
	c2.m1();
}
}
