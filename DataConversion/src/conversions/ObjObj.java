package conversions;

public class ObjObj {
public static void main(String[] args) {	
	
	Main p = new Rectangle();           //upcasting
    p.draw();
    
   Main main = new Rectangle();
   
 //   Rectangle rectangle =  picture; //Not valid, since Parent reference assign to child  

    Rectangle rectangle =  (Rectangle) main;// it is an explicit casting.Down casting
    p.draw();
}
}
