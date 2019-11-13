package com.test.tech;

import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
	
	System.out.println("Enter a No.");
	Scanner sc = new Scanner(System.in);
	String s1 =sc.nextLine();
	int m = Integer.parseInt(s1);

	int a = 0;
    int b;
	int temp;
	
	temp=m;
	while(m>0) {
		b=m%10;
		m=m/10;
		a= a+ (b*b*b*b);
	}
	if(temp==a)
		System.out.println("Armstrong No.");
	else
		System.out.println("It is not Armstrong no.");
}
}
