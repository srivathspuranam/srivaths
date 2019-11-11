package tech;

import java.util.Scanner;

public class FortySix {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,sum=0,temp;
	int b = 1441;
	temp = b;
      
	while (b>0)
   {
	a=b%10;
	sum=(sum*10)+a;
	b=b/10;
   }
    if (temp==sum)
	System.out.println("Palindrome");
    else
	System.out.println("not palindrome");
}
}

