class Student{
	String name;
	String course;
	int id;
	int age;
	long contact;

	public void details(){
		System.out.println("Name:"+name);
		System.out.println("Course:"+course);
		System.out.println("ID:"+id);
		System.out.println("Age:"+age);
		System.out.println("Contact:"+contact);
	}
        public void attendingClass(){
		System.out.println(name+"come to the class");
	}	
 	public void study(){
		System.out.println(name+"strats studying immediately in the  class");
	}
	 public void goingHome(){
		System.out.println(name+"Happly going to the Home/PG");
	}
	 public void sleep(){
		System.out.println(name+"thinking of sleep but chatting with GF/Bf with full Exicement");
	}			
}