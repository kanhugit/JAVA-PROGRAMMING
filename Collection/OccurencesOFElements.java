package Collection;

import java.util.ArrayList;
import java.util.Scanner;

class OccurencesOFElements {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list size:");
		int n = sc.nextInt();

		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			al.add(sc.nextInt());
		}
		System.out.println("Input List: " + al);

		ArrayList<Integer> res = new ArrayList<>();

		for (int i = 0; i < al.size(); i++) {
			int currentElement = al.get(i);
			int count = 0;

			if (!res.contains(currentElement)) {
				for (int j = 0; j < al.size(); j++) {
					if (al.get(j).equals(currentElement)) {
						count++;
					}
				}
				res.add(currentElement);

				System.out.println("Occurrences of " + currentElement + ": " + count);
			}
		}
	}
}
