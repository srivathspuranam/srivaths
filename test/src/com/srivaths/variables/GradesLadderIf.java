package com.srivaths.variables;

public class GradesLadderIf {
public static void main(String[] args) {
	
	int a=55;
	int b=56;
	int c=70;
	
	if (a>=40 && b>=40 && c>=40);
	{
		System.out.println("PASS");
		
		int d=(a+b+c/3);
		
		if (d>=70)
		{
			System.out.println("Grade A with Distinction");	
		}
		else if (d>=60)
		{
			System.out.println("Grade A");
		}
		else if ( d>=50)
		{
			System.out.println("Grade B");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}
}
