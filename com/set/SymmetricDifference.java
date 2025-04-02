//The symmetric difference is the set of elements that are in either of the sets but not in their intersection.
package com.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifference {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Set-1");
		Set<Integer> set1=new HashSet<>();
		int n1=sc.nextInt();
		System.out.println("Enter the elemnt of set 1");
		for(int i=0;i<n1;i++) {
			set1.add(sc.nextInt());
		}
		System.out.println("SET-1:"+set1);
		
		System.out.println("Enter the Size of Set-2");
		Set<Integer> set2=new HashSet<>();
		int n2=sc.nextInt();
		System.out.println("Enter the elemnt of set-2");
		for(int i=0;i<n1;i++) {
			set2.add(sc.nextInt());
		}
		System.out.println("SET-1:"+set2);
		
		// Symmetric Difference = (set1 - set2) union (set2 - set1)
		Set<Integer> symdiff=new HashSet<>(set1);
		symdiff.addAll(set1);// Union of both sets
		
		Set<Integer> temp=new HashSet<>(set1);
		temp.retainAll(set2);// Intersection of both sets
		
		symdiff.removeAll(temp);//// Remove intersection from the union
		System.out.println("Symmetric Difference:"+symdiff);
	}
}
