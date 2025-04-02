class A{
     int a=10;
	public void m1(){
	System.out.println("A m1 excuted..");
	}

}
class B extends A{
     int b=20;
	public void m2(){
	System.out.println("B m2 excuted..");
	}


}
class C extends B {
	int c=30;
	public void m3(){
	System.out.println("C m3 excuted..");
	}

}
class Main{
	public static void main(String[] args){
		B ob1=new C();
		A ob2=new C();
		A ob3=new B();

		ob1.m2();
		ob2.m1();
		ob3.m1();
		ob1.m1();
		
	System.out.println(ob1.b);
	System.out.println(ob2.a);
	System.out.println(ob3.a);
	System.out.println(ob1.a);

		
	}

}