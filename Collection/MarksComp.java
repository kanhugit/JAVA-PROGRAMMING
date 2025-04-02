//link with school.java
package Collection;

import java.util.Comparator;

public class MarksComp  implements Comparator<Std>{

	@Override
	public int compare(Std o1, Std o2) {
		if(o1.marks>o2.marks)
			return 1;
		if(o1.marks<o2.marks)
			return -1;
		
		return 0;
	}

}
