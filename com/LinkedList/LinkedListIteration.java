//Write a program to iterate over a LinkedList using:

//For-each loop.
//Iterator.
//ListIterator (both forward and backward).

package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add("kanha");
		l.add(20);
		l.add("soumya");
		l.add(30);
		
		//for-each loop
		System.out.println("Using for each loop");
		
		for(Object element:l) {
			System.out.println(element);
		}
		
		//Iterator
		System.out.println("\nUsing Itereator");
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// ListIterator (forward and backward)
		System.out.println("\n Using Forward Direction\n ");
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next() +" ");
		}
		System.out.print("\n using backward Direction \n");
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}

	}
}
