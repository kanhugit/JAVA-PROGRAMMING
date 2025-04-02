package arrayss;
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciInReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int x=0,y=1;
	

		for (int i = n - 1; i >= 0; i--) {
			a[i]=x;
			int z=x+y;x=y;y=z;
		}
		System.out.println(Arrays.toString(a));

	}
}
