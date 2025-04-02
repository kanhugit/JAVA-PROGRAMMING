class Area{

	public static void rectangle(){
		int l=10,b=20;
		System.out.println("Area of rectangle is:"+(l*b));
	}

	public static void square(){
		int s=10;
		System.out.println("Area of square is:"+(s*s));


	}
	
	public static void circle(){
		int r=10;
		System.out.println("Area of circle is:"+(3.141*r*r));


	}
	
	public static void triangle(){
		int b=10,h=20;
		System.out.println("Area of traingle is:"+(1/2*b*h));


	}
	
		public static void main(String[] args){
		rectangle();
		square();
		circle();
		triangle();
		
	}



}



