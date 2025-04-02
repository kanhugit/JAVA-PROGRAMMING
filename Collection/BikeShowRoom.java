package Collection;

import java.util.Scanner;
import java.util.TreeSet;

public class BikeShowRoom {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size:");
		TreeSet<BikeTree> bt=new TreeSet<>();
		bt.add(new BikeTree("Yamma","black", 150000,50, 90));
		bt.add(new BikeTree("Hero","White", 50000,55, 100));
		bt.add(new BikeTree("Splender","Red", 45000,60, 110));
		bt.add(new BikeTree("KTM","Yellow", 160000,70, 120));
		bt.add(new BikeTree("Platina","White", 40000,80, 130));
		System.out.println(bt);
		
	}
}
