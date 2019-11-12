package com.test.tech;

import java.util.Scanner;

public class FortySix {
public static void main(String[] args) {
	System.out.println("Text");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String s1 = str.substring(0, str.length() / 2);
	String s2 = str.substring(str.length() / 2, str.length());
	StringBuffer sb = new StringBuffer();
	for (int i = s2.length() - 1; i >= 0; i--) {
			sb.append(s2.charAt(i));
		}
	 String st = sb.toString();
		if (s1.equals(st)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("It is not a Palindrome");
		}
		sc.close();
}
}

