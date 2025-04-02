//Find the minimum element in a stack at any point.
//Without altering the main stack, maintain a secondary stack for minimum values.

package com.stack;

import java.util.Stack;

public class MinimumElement {
	private Stack<Integer> mainstack = new Stack<>();
	private Stack<Integer> minstack = new Stack<>();

	public void push(int x) {
		mainstack.push(x);
		if (minstack.isEmpty() || x <= minstack.peek()) {
			minstack.push(x);

		}
	}

	public int pop() {
		if (mainstack.peek().equals(minstack.peek())) {
			minstack.pop();
		}
		return mainstack.pop();
	}

	public int getMin() {
		return minstack.peek();
	}

	public static void main(String[] args) {

		MinimumElement stk = new MinimumElement();
		stk.push(10);
		stk.push(5);
		stk.push(20);
		System.out.println("Minmum element :" + stk.getMin());
		stk.pop();
		System.out.println("Minimum element after pop:" + stk.getMin());
	}

}
