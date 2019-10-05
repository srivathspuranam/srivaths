package collectionFrame;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(new Integer(10));
		al.add(215);
		al.add(95);
		al.add(65);
		al.add(55);
		al.add(45);
		
		System.out.println("array elements"+al);
		System.out.println();
		
		//using for loop
		for(int i = 0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		//for each loop
		for(Integer i:al)
		{
			System.out.println(i);
		}
       // using interator
		Iterator <Integer> iterator = al.iterator();
		while(iterator.hasNext())
		{
			Integer nextInteger = iterator.next();
			System.out.println(nextInteger);
		}
		// no. of elements
		System.out.println("no. of elements"+al.size());
		// to display first element
		System.out.println("First element"+al.get(0));
		// last element
		System.out.println("last element"+al.get(al.size()-1));
		// adding a no. in the string
		al.add(0, 144);
		// removing element
		Integer i1= al.remove(4);
		{
			System.out.println("after removing"+al);
		}
		Integer i2 = al.get(0);// read only, will not remove physically
		
		System.out.println(i2);
		
		System.out.println(al);		
		//clear the array list
		al.clear();
		{
			System.out.println(al);
		}
			}
}
