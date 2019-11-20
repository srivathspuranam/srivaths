package retest;

public class Two {
public static void main(String[] args) {
	
	for(int i=1; i<=7;i++)
	{
		for(int j=i-1; j>=1 ; j--)
		{
		System.out.print(0);
		}
		System.out.print(i-1);
		for(int j=i;j<=7;j++)
		{
			System.out.print(0);
		}
		System.out.println();
	}
}
}
