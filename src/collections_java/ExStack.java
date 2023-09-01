package collections_java;

import java.util.Stack;

public class ExStack {
	
	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		stack.push("Amora");
		stack.push("Banana");
		stack.push("Amora"); // Duplicado permitido
		System.out.println(stack);
	}
}
