package Collection;

public  class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	double sal;
	String doj;
	
	Employee(int id,String name,double sal,String doj){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.doj=doj;
	}

	public String toString() {
		return "\n Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", doj=" + doj + "]";
	}
	public int compareTo(Employee e) {
		return this.name.compareTo(e.name);
	}
	
}
