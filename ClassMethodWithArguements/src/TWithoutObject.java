
public class TWithoutObject {
public static void main(String[] args) {
	System.out.println (StaticWithoutObject.counter);
	
	StaticWithoutObject.counter=StaticWithoutObject.counter+10;
	
	StaticWithoutObject.counter=StaticWithoutObject.counter+20;
	
	System.out.println (StaticWithoutObject.counter);		
}
}
