package polymorphism;

public class Test {
public static void main(String[] args) {
	Picture p1;
	
	p1= new Rectangle();
    p1.draw();
    
    p1=new Square();
    p1.draw();
    
    p1=new Hexagon();
    p1.draw();
}
}
