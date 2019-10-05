package constructorsTest;

public class OLoad {
private int a;
private int b;
private int c;

public OLoad() {
	a=0;
	b=0;
	c=0;
}
public OLoad(int x) {
	a=x;
	b=0;
	c=0;
}
public OLoad(int x, int y) {
	a=x;
	b=y;
	c=0;
}
public OLoad(int x, int y, int z) {
	a=x;
	b=y;
	c=z;
}
public void display() {	
	System.out.println ("a= "+ a + " b= " +b+" c= " +c);
}
}

