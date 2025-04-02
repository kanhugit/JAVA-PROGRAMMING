package Collection;


import java.util.ArrayList;
import java.util.Scanner;

public class ListString {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		System.out.println("enter arraysize");
		int n=sc.nextInt();
		System.out.println("enter array data");
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String ss=sc.nextLine();
			s.add(ss);
		}
		System.out.println(s);
		
		ArrayList<String> sss=new ArrayList<String>();
		
		String m="aeiouAEIOU";
		for(String i:s) {
			char k=i.charAt(0);
			if(k>='a'&&k<='z'||k>='A'&&k<='Z') {
				if(!(m.contains(k+""))) {
					char l=k,h=k;
					while(!(m.contains((h)+""))){
						if(h=='z'){
							h='a';
						}
						else if(h=='Z'){
							h='A';
						}
						else {
							h++;
						}
					}
					while(!(m.contains((l)+""))){
						l--;
					}
					int d1=k-l;
					int d2=h-k;
					if(d2<0) {
						d2=d2+26;
					}
					System.out.println(d1+" "+d2);
					if(d1<=d2) {
						sss.add(l+i.substring(1));
					}else {
						sss.add(h+i.substring(1));
					}
				}
			}
		}
		System.out.println(sss);
		
	}
}