package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TypesOf_Iteration_InArrayList {
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("APPLE");
		l.add("BANANA");
		l.add("GRAPES");
		l.add("ORANGE");
		System.out.println("Iterate using for loop");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("\nItreate using for Each-lopp");
		for(String friutsList:l) {
			System.out.println(friutsList);
		}
		System.out.println("\nIterate using Iterator");
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nUsing ListIterator:forward direction");
		ListIterator<String> ltr=l.listIterator();
		
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		System.out.println("\nUsing ListIterator:Backword direction");
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
		System.out.println("Using Java Streams:");
		l.stream().forEach(System.out::println);
		
	}
}
