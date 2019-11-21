package retest;

import java.util.Scanner;

public class Thirteen {
public static void main(String[] args) {
	System.out.println("Enter a No.");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	int m = Integer.parseInt(s);
	int a = 0;
    int b;
	int temp;
	
	temp=m;
	while(m>0) {
		b=m%10;
		m=m/10;
		a= a+ (b*b*b);
	}
	if(temp==a)
		System.out.println("Armstrong No.");
	else
		System.out.println("Not Armstrong no.");
}
}
