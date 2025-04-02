package Collection;
//link with stud
import java.util.ArrayList;

public class SchoolWithoutSort {

	public static void main(String[] args) {
		ArrayList<Stud> st=new ArrayList<Stud>();
		st.add(new Stud(2,"Ganesh",78.0));
		st.add(new Stud(3,"Ajay",92.0));
		st.add(new Stud(4,"Kumar",89.0));
		st.add(new Stud(1,"Pavan",66.0));
		
		for(int i=0;i<st.size()-1;i++) {
			for( int j=1;j<st.size()-i;j++) {
				if(st.get(j-1).marks.compareTo(st.get(j).marks)>0) {
					Stud s=st.get(j-1);
					st.set(j-1,st.get(j));
					st.set(j,s);
				}
			}
		}
		System.out.println(st);	
	}

}
