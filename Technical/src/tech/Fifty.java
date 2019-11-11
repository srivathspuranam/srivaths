package tech;

import java.util.Scanner;

public class Fifty {
public static void main(String[] args) {
	
	System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	String str =sc.nextLine();
	int m = Integer.parseInt(str);
	int u = 0;
	while(u!= 0)
	{
		int k = u%10;
		m = m + k ;
				u = u/10;
	
	}
				sc. close();
				System.out.println("sum=" + m);				
	}
}

