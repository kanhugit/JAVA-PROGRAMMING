package arrayss;

public class PrintDifferentSenario {

	public static void main(String[] args) {
		
		int a[]= {5,8,3,2,7,6};
		
		for(int i=0;i<a.length/2;i++) {
			System.out.print(a[i]+" "); //5 8 3
		}
		System.out.println();
		
		for(int i=a.length-1;i>=a.length/2;i--) {
			System.out.print(a[i]+" "); //6 7 2
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
			System.out.print(a[i]+" ");//8 2 6
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1||a[i]==2) {
				System.out.print(a[i]+" ");//5 3 2 7
			}
		}
	}

}
