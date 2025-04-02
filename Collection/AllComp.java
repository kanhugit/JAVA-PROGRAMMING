//link with school.java
package Collection;
import java.util.Comparator;

public class AllComp implements Comparator<Std>{

	public int compare(Std o1, Std o2) {

		if(o1.marks<o2.marks)
			return 1;
		if(o1.marks>o2.marks)
			return -1;
		
		int n=o1.name.compareTo(o2.name);
		if(n==0) {
			return o1.id-o2.id;
		}
		return n;
		
		
	}

	
}
