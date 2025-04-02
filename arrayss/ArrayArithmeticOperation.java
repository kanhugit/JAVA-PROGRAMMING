package arrayss;

public class ArrayArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };

		// sum of all elements
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("SUM OF ALL ELEMENTS :" + sum);// SUM OF ALL ELEMENTS :15

		// substraction of all elements

		int sub = a[0];
		for (int i = 1; i < a.length; i++) {
			sub = sub - a[i];
		}
		System.out.println("Substraction of Elements:" + sub);// Substraction of Elements:-13

		// multiplication of elements
		int mul = a[0];
		for (int i = 0; i < a.length; i++) {
			mul = mul * a[i];
		}
		System.out.println("Multiplication of Array Elemnts:" + mul);// Multiplication of Array Elemnts:120

		// increase all elements by 3

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + 3 + " ");// 4 5 6 7 8
		}

		System.out.println();
		// multiply all elements by 3
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] * 3 + " ");// 3 6 9 12 15
		}

		System.out.println();
		// find all odd numbers
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");// 1 3 5
			}
		}		

	}

}
