class Petshop{

   public static void main(String[] args){

	Dog dog=new Dog("Brown",10,25,"charlie","Dog","male");
	Cat cat=new Cat("milk",true,1,"micky-mouse","cat","female");

	System.out.println(dog.name);
	System.out.println(dog.color);
	System.out.println(dog.age);
	System.out.println(dog.weight);

	System.out.println("==================================");

	System.out.println(cat.name);
	System.out.println(cat.food);
	System.out.println(cat.tail);
	System.out.println(cat.height);



   }

}