
package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Showroom {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Bike> al=new ArrayList<Bike>();
		al.add(new Bike("splender+",65000.00,"Blue",70));
		al.add(new Bike("honda",70000.00,"red",68));
		al.add(new Bike("hero",65000.00,"yellow",55));
		al.add(new Bike("avenger",158000.00,"black",70));
		al.add(new Bike("bullet",250000.00,"Blue",45));
		double sum=0;
		int count=0;
		for(Bike b:al) {
			sum+=b.cost;
			count++;
		}
		double avg=sum/count;
		String vowels="aeiouAEIOU"; 
		ArrayList<Bike> res=new ArrayList<Bike>();
		for(Bike b:al) {
			if(b.cost<avg && b.milage>50 ) {
				if(!(vowels.contains(b.brand.charAt(0)+""))) {
					res.add(b);
				}
			}
		}
		System.out.println("Select the Option below");
		System.out.println("1:CostAsc\n2:CostDesc\n3:BrandAsc\n4:BrandDesc\n5:MilageAsc\n6:MilageDesc\n7:CostAsc&MilageDesc\n8:CostDesc&MilageAsc");
		int n=sc.nextInt();
		Comparator<Bike> com=(o1,o2)->{
			if(o1.cost>o2.cost)
				return 1;
			if(o1.cost<o2.cost)
				return -1;
			return 0;
			
		};
		if(n==2) {
			com=(o1,o2)->{
				if(o1.cost<o2.cost)
					return 1;
				if(o1.cost>o2.cost)
					return -1;
				return 0;		
			};
		}
		else if(n==3) {
			com=(o1,o2)->{
				return o1.brand.compareTo(o2.brand);
			};	
		}
		else if(n==4) {
			com=(o1,o2)->{
				return o2.brand.compareTo(o1.brand);
			};
		}
		else if(n==5) {
			com=(o1,o2)->{
				if(o1.milage>o2.milage)
					return 1;
				if(o1.milage<o2.milage)
					return -1;
				return 0;	
			};	
		}
		else if(n==6) {
			com=(o1,o2)->{
				if(o1.milage<o2.milage)
					return 1;
				if(o1.milage>o2.milage)
					return -1;
				return 0;	
			};	
		}
		else if(n==6) {
			com=(o1,o2)->{
				if(o1.cost>o2.cost && o1.milage<o2.milage)
					return 1;
				if(o1.cost<o2.cost && o1.milage>o2.milage)
					return -1;
				return 0;		
			};	
		}
		else if(n==7) {
			com=(o1,o2)->{
				if(o1.cost<o2.cost && o1.milage>o2.milage)
					return 1;
				if(o1.cost>o2.cost && o1.milage<o2.milage)
					return -1;
				return 0;		
			};	
		}
		Collections.sort(res,com);
		System.out.println(res);
	}
}
