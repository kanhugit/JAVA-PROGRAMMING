class AreaOf{

public static void area(int s){

	System.out.println("Area of square:"+s*s);
}
public static void area(int l,int b){

	System.out.println("Area of Rectangle :"+l*b);
}
public static void area(double r){

	System.out.println("Area of circle :"+3.141*r*r);
}
public static void main(String[] args){

   area(2);
   area(2,3);
   area(2);


}
}