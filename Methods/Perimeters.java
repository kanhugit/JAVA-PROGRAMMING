class Perimeters{

	public static void rectangle(){
		int l=10,b=20;
		System.out.println("Perimeter of rectangle is:"+2*(l+b));
	}

	public static void square(){
		int s=10;
		System.out.println("Perimeter of square is:"+(4*s));


	}
	
	public static void circle(){
		int r=10;
		System.out.println("Perimeter of circle is:"+(2*3.141*r));


	}
	
	public static void triangle(){
		int x=10,y=20,z=30;
		System.out.println("Perimeter of traingle is:"+(x+y+z));


	}
	
		public static void main(String[] args){
		rectangle();
		square();
		circle();
		triangle();
		
	}



}



