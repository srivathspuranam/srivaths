package com.test.tech;

public class Eight {
	static int a;

	public static void main(String[] args) {
		int i = 259;
		adding(i);
		System.out.println(a);
	}
	public static void adding(int j) {
		if (j != 0) {
			int i = j % 10;
			a = a + i;
			j = j / 10;
			adding(j);
		}
		
	}
}
