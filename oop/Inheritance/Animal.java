class Animal{

	String name;
	String type;
	String gender;
	
	Animal(String name,String type,String gender){
	        this.name=name;
		this.type=type;
		this.gender=gender;

        }
	
}
class Dog extends Animal{
	String color;
        int age;
	double weight;

	Dog(String color,int age,double weight,String name,String type,String gender){
		super( name, type, gender);
		this.color=color;
		this.age=age;
		this.weight=weight;
        }

}
class Cat extends Animal{
	String  food;
	boolean tail;
	double height;
	
	Cat(String  food,boolean tail,double height,String name,String type,String gender){
		super( name, type, gender);
		this.food=food;
		this.tail=tail;
		this.height=height;
        }
}	
