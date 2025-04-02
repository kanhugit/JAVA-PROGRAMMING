package array2D;

public class SumOfMatrix {
	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		int b[][]={{5,6},{7,8}};
	
		if(a.length==b.length && a[0].length==b[0].length) {
			int c[][]=new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			for(int[] i:c) {
				for(int j:i) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Addition is not possible");
		}
	}
}
