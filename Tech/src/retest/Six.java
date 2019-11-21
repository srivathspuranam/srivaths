package retest;

import java.io.PrintWriter;
import java.util.Scanner;

public class Six {
public static void main(String[] args) {
	System.out.println("Enter the text");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int L = s.length();   
	String r="";
	for ( int i = L - 1; i >= 0; i-- )  
       r = r + s.charAt(i);  
     if (s.equals(r))  
        System.out.println("text is a palindrome.");  
     else  
        System.out.println("text is not a palindrome.");   
  }  
}

