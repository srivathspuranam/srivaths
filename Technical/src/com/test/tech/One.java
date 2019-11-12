package com.test.tech;

import java.util.Arrays;

public class One {
public static void main(String[] args) {
	String s1 = "cat";
	String s2= "acts";
	char[] a = s1.toCharArray();
	char[] b = s2.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	StringBuffer sb = new StringBuffer().append(a);
	StringBuffer sb1 = new StringBuffer().append(b);
	if (sb.toString().equals(sb1.toString())) {
		System.out.println("Strings are anagram");
	} else {
		System.out.println("Strings are not anagram");
	}
}
}



