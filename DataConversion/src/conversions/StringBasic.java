package conversions;

public class StringBasic {
public static void main(String[] args) {
	String s1 = "40";                            //string to basic conversion like double char int using parse.
			int a = Integer.parseInt(s1);
			
			
			
			int b = 95;                          //Basic to string using valueof()
			String s2= String.valueOf(b); 
			
			
			{
				System.out.println(s1);
				System.out.println(s2);
			}
	}
}
