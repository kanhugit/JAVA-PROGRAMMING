package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Nthmax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list size:");

		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			al.add(sc.nextInt());
		}
        System.out.println("Enter the value of n:");

		int n = sc.nextInt();
		int pm = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int cm = Integer.MIN_VALUE;
			for (int j = 0; j < al.size(); j++) {
				int k = al.get(j);
				if (k > cm && k < pm)
					cm = k;
			}
			pm = cm;

		}
	System.out.println(n+"th Maximum Element:"+pm);

	}
}
