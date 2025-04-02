package com.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortWithComparableByLambda  {
	
	public static void main(String[] args){
		ArrayList<String> l=new ArrayList<>();
		l.add("Kanha");
		l.add("Malaya");
		l.add("Balaram");
		l.add("Jiten");
		
		System.out.println("Original Arraylist:"+l);
		Collections.sort(l,(a,b)->a.compareTo(b));
		System.out.println("Sorted ArrayList Alphbetically :"+l);
		
		Collections.sort(l,(a,b)->b.compareTo(a));
		System.out.println("Reverse sorted Alphabetically:"+l);
	}

	

	
}
