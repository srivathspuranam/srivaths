package tech;

public class FortyFour {
public static void main(String[] args) {
	int a = 10;
	int b = 20;
	Swap s = new Swap();
	s.setA(a);
	s.setB(b);
	b = s.getA();
	a = s.getB();
	System.out.println("a : " + a);
	System.out.println("b : " + b);
}
}
