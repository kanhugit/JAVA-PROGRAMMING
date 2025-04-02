//link with school.java
package Collection;
public class Std {

	int id;
	String name;
	double marks;
	int rank;
	public Std(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\nStd [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	 
}
