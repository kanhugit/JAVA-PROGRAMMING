package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingStringWithoutSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();//Reads the size of the list (number of strings) as an integer from the user
		sc.nextLine();//Consume newline:After reading the integer, the newline character remains in the input buffer. 
		ArrayList<String> al=new ArrayList<String>();
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++) {
        	al.add(sc.nextLine());//Reads a string input from the user and adds it to the ArrayList using the add() method.
        }
        //Bubble sort 
		for(int i=0;i<size-1;i++) {
			for(int j=1;j<size;j++) {
				if(al.get(j-1).compareTo(al.get(j))<0) {
					//swapping
					String s=al.get(j-1);
					al.set(j-1, al.get(j));
					al.set(j,s);
				}
			}
		}
		System.out.println(al);
	}
}
