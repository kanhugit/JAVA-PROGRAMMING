package com.ArrayList;

import java.util.ArrayList;

public class AddRetriveElements {
	public static void main(String[] args) {
		
	
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("Array list : "+list);
		System.out.println("Third Elemnts :"+list.get(2));
		System.out.println("Remove 3rd Elemnts :"+list.remove(2));
		System.out.println("Length of Arraylist is:"+list.size());
		System.out.println("Index of Elements:"+list.indexOf(30));
		System.out.println("Index of 50 is:"+list.indexOf(50));
	}
}
