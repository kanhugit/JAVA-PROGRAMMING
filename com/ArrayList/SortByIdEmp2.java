package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortByIdEmp2 {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the List Size");
		ArrayList<Employee2> emp=new ArrayList<>();
		int n=sc.nextInt();
		System.out.println("Enter The List Elements:");
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			double salary=sc.nextDouble();
			Employee2 e1=new Employee2(id,name,salary);
			emp.add(e1);
		}
		System.out.println("Original list of Employee2"+emp);
		Collections.sort(emp);
		System.out.println("\n Sorted list of Employees by Id:"+emp);
		
	}
	
}
