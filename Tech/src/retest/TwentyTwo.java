package retest;

import java.util.Scanner;

public class TwentyTwo {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	String str =sc.nextLine();
	int m = Integer.parseInt(str);
	int sum = 0;
	while(m> 0)
	{
		int add = m%10;
		sum = sum + add;
		m = m/10;
	}
	System.out.println("sum="+ sum);
}
}
