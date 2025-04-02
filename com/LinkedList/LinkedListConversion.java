//Convert Between LinkedList and Array:
//Convert a LinkedList to an array.
//Convert an array to a LinkedList.

package com.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListConversion {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		
		System.out.println("Linkedlist:"+l);
		String[] arr=l.toArray(new String[0]);
		System.out.println("Linked List to Array:"+Arrays.toString(arr));
		
		// Array to LinkedList
		String[] arr2= {"X","Y","Z"};
		List<String> l2=new LinkedList<>(Arrays.asList(arr2));
		System.out.println("Array to Linked List:"+l2);
	}
}
