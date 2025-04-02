package com.LambdaExpression;
//without using Lambda function
//interface Something{
//	public void anything(int a);
//}
//class Things implements Something{
//	public void anything(int x) {
//		for(int i=1;i<=x;i++) {
//			System.out.println("Nothing..");
//		}
//	}
//}
//public class LambdaExpressionExample{
//	public static void main(String[] args) {
//		Something s=new Things();
//		s.anything(5);
//	}
//}

//with Using Lambda Function
interface Something{
	public void anything(int a);
}
public class LambdaExpressionExample{
	public static void main(String[] args) {
		//Lambda Expression
		Something s=(int x) ->{
			for(int i=0;i<=x;i++) {
				System.out.println("Nothing..");
			}
		};
		s.anything(5);
	}
}


