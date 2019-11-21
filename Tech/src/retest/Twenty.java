package retest;

public class Twenty {
	static int a;
public static void main(String[] args) {
	int i =259;
	sum(i);
	System.out.println(a);
}

private static void sum(int j) {
	// TODO Auto-generated method stub
if(j!=0) {
	int i = j%10;
	a=a+i ;
	j= j/10;
	sum(j);		
}
}
}
