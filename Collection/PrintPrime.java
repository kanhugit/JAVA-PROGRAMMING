package Collection;

import java.util.ArrayList;

public class PrintPrime {
	public static boolean prime(int n) {
		if(n<2)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(11);
		al.add(9);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(31);
		System.out.println(al);
		for(Object i:al) {
			int a=(Integer)i;
			if(prime(a))
				System.out.println("Prime number:"+a);
		}
	}
	
}
