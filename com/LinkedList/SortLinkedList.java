//Write a program to sort a LinkedList in:
//Natural order.
//Custom order (e.g., descending order using a Comparator).

package com.LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(200);
		l.add(30);
		l.add(400);
		l.add(50);
		l.add(600);
		
		System.out.println("Original list:"+l);
		 // Sort in natural order
		Collections.sort(l);
		System.out.println("Sorted List(Ascending):"+l);
		
		// Sort in reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Soreted List(Descending):"+l);
		
		
		// (custom sort)Sort the LinkedList in descending order using a Comparator
		Collections.sort(l,new Comparator<Integer>(){
			public int compare(Integer num1,Integer num2) {
				return num2-num1;
			}
		});
        System.out.println("Sorted LinkedList in Descending Order: " + l);

	}
}
