package com.test.tech;

import java.util.Arrays;

public class Nine {
public static void main(String[] args) {
int[] input= {5,34,78,2,45,1,99,23};
 
 Arrays.sort(input, 0, input.length);
	System.out.println("First max no="+input[input.length-1]);
	System.out.println("Second max no="+input[input.length-2]);
}
}
