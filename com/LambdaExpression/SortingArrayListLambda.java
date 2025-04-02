package com.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListLambda {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(4);
		System.out.println("Original ArrayList:"+al);
		Collections.sort(al,(a,b)->a-b);
		System.out.println("Sorted in ascending order:"+al);
		Collections.sort(al,(a,b)->b-a);
		System.out.println("Sorted in descending order:"+al);
		
	}
}
