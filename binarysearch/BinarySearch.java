package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size :");
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("Enter element to search :");
		int ele = sc.nextInt();
		Arrays.sort(a);
		int f = 0, l = n - 1;
		while (f <= l) {
			int mid = (f + l) / 2;
			if (ele == a[mid]) {
				System.out.println(ele + " is  found ");
				break;
			} else if (ele > a[mid]) {
				f = mid + 1;
			} else {
				l = mid - 1;
			}
		}
		if (f > l)
			System.out.println(ele+ " is not found ");
		sc.close();
	}
}
