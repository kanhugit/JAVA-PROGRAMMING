 class AreaWithFormal{

    public static void square(int side){

	System.out.println("Area of square is:"+(side*side));
    }

    public static void rectangle(int l,int b){

	System.out.println("Area of rectangle is:"+(l*b));
    }
    public static void circle(int r){

	System.out.println("Area of square is:"+(3.141*r*r));
    }
  
  public static void main(String[] args){

		square(4);
		rectangle(2,3);
		circle(5);
  }

}