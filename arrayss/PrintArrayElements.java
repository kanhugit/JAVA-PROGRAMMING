package arrayss;

public class PrintArrayElements {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int b[]= {60,70,80,90,100};
	int c[]= {110,120,130,140,150};
	int d[]= {160,170,180,190,200};
	
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i] +" ");
	}
	System.out.println();
	for(int i=0;i<c.length;i++) {
		System.out.print(c[i] +" ");
	}
	System.out.println();
	
	for(int i=0;i<a.length;i++) {
		System.out.print(d[i] +" ");
	}
}
}
