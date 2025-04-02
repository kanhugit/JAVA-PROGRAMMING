package array2D;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		
		int a[][]={ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
		int b[][]=new int[a[0].length][a.length];
		
		
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
				b[i][j]=a[j][i];
			}
			
		}
		for(int i[]:b) {
			for(int j:i) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
	}
}
