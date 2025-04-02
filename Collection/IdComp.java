//link with school.java
package Collection;

import java.util.Comparator;

public class IdComp implements Comparator<Std> {

	public int compare(Std o1, Std o2) {
		return  o1.id-o2.id;
	}


}
