package array2D;

//find the sum off all elements in the 2d array
public class SumOfEachRowIn2D {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
		for (int i[] : a) {
			int sum = 0;
			for (int j : i) {
				sum += j;
			}
			System.out.println(sum+" ");
		}

	}
}
