package stringToken;

import java.util.StringTokenizer;

public class Token {
public static void main(String[] args) {
	System.out.println("Constructor");
	StringTokenizer s1= new StringTokenizer ("srivaths tanay abhiram amani ks");
while (s1.hasMoreTokens()) 
{
	System.out.println (s1.nextToken());
}

System.out.println ("Using Constructor 2");

StringTokenizer st2 = new StringTokenizer("engineer:analyst:software:marketing:engineer:sales", " :");

while (st2.hasMoreTokens()) 
{
	System.out.println (st2.nextToken());
}
}
}

