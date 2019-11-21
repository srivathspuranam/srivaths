package retest;

import java.util.Scanner;

public class Ten {
public static void main(String[] args) {
	
	System.out.println("Number");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int n=0,m=1,k,count=a;
	for(int i=0;i<count;++i)
	{
		k=n+m;
		System.out.println(k);
		n=m;
		m=k;
	}
}
}
