package com.srivaths.variables;
import java.util.Scanner;
public class SwitchCases {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the value of a");
	int a= sc.nextInt();
	
			 switch (a)
			 {
						 case 10:
				 System.out.println("Ten");
				 break;
			 case 20:
				 System.out.println("Twenty");
				 break;
			default:
				System.out.println("Invalid value");
			 }
			 sc.close();
			 }
			}



