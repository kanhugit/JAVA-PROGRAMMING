package com.LambdaExpression;

public class LambdaExp {
	interface FunctionalInterface{
		void showMessage(String message);
	}
public static void main(String[] args) {
	FunctionalInterface msgprint=(message)->System.out.println(message);
	msgprint.showMessage("Heloo,Lamda Expression.");
}
}
