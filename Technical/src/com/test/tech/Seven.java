package com.test.tech;

import java.util.Scanner;

public class Seven {
public static void main(String[] args) {

	System.out.println("Enter the No.");
	Scanner sc = new Scanner(System.in);
	Integer a = sc.nextInt();
	int n=0,m=1,k,count= a;

	for(int i=0 ; i<count ; ++i)
	{
		k=n+m;
		System.out.println(k);
		n=m;
		m=k;
	}
}
}
