package com.LambdaExpression;

interface Sum{
	public int add(int a,int b);
}

public class AdditionByLambdaExpression {
	
	public static void main(String[] args) {
		System.out.println("First way ");
		
		Sum s1=(int x,int y) ->{
			return x+y;
		};
		System.out.println(s1.add(10,20));
		
		
		System.out.println("Second way ");
		Sum s2=(x,y)->{
			return x+y;
		};
		System.out.println(s2.add(30,40));
		
		System.out.println("Third way");
		 Sum s3=(x,y)->x+y;
		 System.out.println(s3.add(100, 200));
	}
}
