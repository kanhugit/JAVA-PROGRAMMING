package com.LinkedList;

import java.util.LinkedList;

public class LinkedListOperation {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		
		//Adding Elements
		l.add("A");//add to end
		l.add("B");//add to end
		l.add("C");//add to end
		l.addFirst("a");//add to the beginning
//		l.addFirst("b");//it replace the a add b
		l.add(4,"D");//add at index 4
		System.out.println("After adding the elements :"+l);//[a,A, B, C,D]
		
		//removing elements
		l.removeFirst();//a removes [A, B, C,D]
		l.removeLast();//D removes [A, B, C]
		l.remove(1); //removes element at index 1 i.e B [A, C]
		System.out.println("After Removing Elements:"+l);
		//Accessing the elements
		System.out.println("First Elements:"+l.getFirst());//A
		System.out.println("Last Elements:"+l.getLast());//B
		System.out.println("Elements at Index 0:"+l.get(0));//A
		
		
	}
}

