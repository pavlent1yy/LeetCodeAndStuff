package datastructures.StackI;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		System.out.println(stack.isEmpty());

		stack.push(1);
		stack.push(1);
		stack.push(1);
		stack.push(1);
		stack.push(1);
		stack.push(1);
		stack.push(1);

		System.out.println(stack);
	}
}
