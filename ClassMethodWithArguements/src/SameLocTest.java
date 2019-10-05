
public class SameLocTest {
public static void main(String[] args) {
	
	SameLocSample s1=new SameLocSample();
	s1.setData(10, 20);
	SameLocSample s2=s1;
	s1.display();
	s2.display();
	}
}
