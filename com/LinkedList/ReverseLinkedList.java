//Reverse the elements of a LinkedList using:
//
//Iteration.
//Collections utility (Collections.reverse()).

package com.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(200);
		l.add(30);
		l.add(400);
		l.add(50);
		
		System.out.println("Original list:"+l);
		//Reverse List
		Collections.reverse(l);
		System.out.println("Reverse List:"+l);
	}
}
