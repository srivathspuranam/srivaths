package com.test.tech;

import java.util.ArrayList;

public class QS9 {
	public static void main(String[] args) {
ArrayList<String> al= new ArrayList<String> ();
ArrayList<String> al2= new ArrayList<String> ();
		al.add("Java");
		al.add("Servlets");
		al.add("JDBC");
		al.add("CoreJava");
		al.add("Hibernate");	
		al2.add("Java");
		al2.add("Servlets");
		al2.add("JDBC");
		al2.add("CoreJava");
		al2.add("Spring");
		al2.add("JSP");
	          		
if(al.retainAll(al2))
	{
	System.out.println(al);
}
}
}

