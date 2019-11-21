package retest;

import java.util.Scanner;

public class Nineteen {
public static void main(String[] args) {
	System.out.println("Number");
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	int a = Integer.parseInt(s1);
	double fact = factorial(a);
	System.out.println(fact);
}

private static double factorial(int a) {
	// TODO Auto-generated method stub
	if(a>=1)
	return a*factorial(a-1);
	else
		return 1;
}
}

