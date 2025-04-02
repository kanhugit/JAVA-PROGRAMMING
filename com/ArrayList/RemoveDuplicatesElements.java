package com.ArrayList;

import java.util.ArrayList;

public class RemoveDuplicatesElements {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(20);
		al.add(40);
		al.add(30);
		al.add(50);
		
		ArrayList<Integer> unique=new ArrayList<>();
		for(Integer element:al) {
			if(!unique.contains(element))
				unique.add(element);
		}
		System.out.println("ArrayList After Removing Duplicates:"+unique);
	}
}
