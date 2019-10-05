package polymorphism;

public class Test1 {
public static void main(String[] args) {
	display(new Rectangle());
	display(new Square());
	display(new Hexagon());
}
public static void display(Picture s1)
{
	s1.draw();
	}
}
