package com.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOperations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements in Set1");
		HashSet<Integer> set1=new HashSet<Integer>();
		int n1=sc.nextInt();
		System.out.println("Enter The Set1 Elements:");
		for(int i=0;i<n1;i++) {
			set1.add(sc.nextInt());
		}
		System.out.println(set1);
		
		System.out.println("Enter The no.of elements in Set2:");
		HashSet<Integer> set2=new HashSet<Integer>();
		int n2=sc.nextInt();
		System.out.println("Enter The Set2 Elements:");
		for(int i=0;i<n2;i++) {
			set2.add(sc.nextInt());
		}
		System.out.println(set2);
		
		HashSet<Integer> union=new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("union is:"+union);
		
		HashSet<Integer> intersection=new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection is:"+intersection);
		
		
		HashSet<Integer> diff=new HashSet<>(set1);
		diff.removeAll(set2);
		System.out.println("Difference Is(Set1-Set2):"+diff);
		
		HashSet<Integer> diff2=new HashSet<>(set2);
		diff.removeAll(set1);
		System.out.println("Difference Is(Set2-Set1):"+diff2);
		
	}
	
}
