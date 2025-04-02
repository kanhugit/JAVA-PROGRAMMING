package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Rose");
		l.add("Jasmine");
		l.add("CauliFlower");
		l.add("Lily");
		l.add("Tulip");
		l.add("Banana");
		l.add("Lotus");
		System.out.println(l);
		
		ListIterator ltr=l.listIterator();
		
		while(ltr.hasNext()) {
			String s=(String)ltr.next();
			if(s.equals("Banana")) {
				ltr.remove();
			} if(s.equals("cauliFlower")) {
				ltr.set("Hibiscus");
			
		}
		}
		System.out.println(l);
	}

}
