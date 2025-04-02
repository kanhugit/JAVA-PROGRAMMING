package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class School {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Choose the below Option:");
		System.out.println("1:ID\n2:name\n3:Marks\n4:All");
		int op=sc.nextInt();
		System.out.println("Enter the List size");
		Comparator<Std> com=new IdComp();
		if(op==2)
			com=new NameComp();
		else if(op==3)
			com=new MarksComp();
		else if(op==4)
			com=new AllComp();
		ArrayList<Std> st=new ArrayList<Std>();
		int n=sc.nextInt();
		System.out.println("Enter the list elemnts(ID,NAME,MARKS)");
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String name= sc.nextLine();
			double marks=sc.nextDouble();
			Std s1=new Std(id,name,marks);
			st.add(s1);
		}
		System.out.println(st);
		Collections.sort(st, com);
		int m=1;
		for( Std i:st) {
			i.rank=m++;
		}
		System.out.println(st);
		
	}

	
}
