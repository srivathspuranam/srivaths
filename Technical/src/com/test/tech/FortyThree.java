package com.test.tech;

public class FortyThree {
public static void main(String[] args) {
	
	String s1="buffer";
	String s2="buider";
	StringBuffer s3 = new StringBuffer();
	StringBuffer s4 = new StringBuffer();
	for (int i=0; i<s1.length();i++) {
		char a=s1.charAt(i);
		char b= s2.charAt(i);
		if (a == b) {
			s3.append(a);
		} else {
			s4.append(b);
		}
	}
	System.out.println(s3);
	System.out.println(s4);
}
}
