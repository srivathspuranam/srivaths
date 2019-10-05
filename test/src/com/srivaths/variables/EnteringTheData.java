package com.srivaths.variables;
import java.util.Scanner;
public class EnteringTheData {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Employee Name");
    String name = sc.next();
	
	System.out.println("Enter the Emp No.");
	int eno= sc.nextInt();
	
	System.out.println("Gender");
	String gender= sc.next();
			
			System.out.println("Enter the Salary");
	double salary=sc.nextDouble();
	
	System.out.println("Emp Name=" + name + "\tEmp no. =" + eno + "\tGender=" + gender + "\tSalary=" + salary);
	sc.close();
}
}
