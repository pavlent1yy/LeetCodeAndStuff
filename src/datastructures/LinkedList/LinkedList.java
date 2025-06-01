package datastructures.LinkedList;

public class LinkedList<T> {
	private Node<T> head;

	public void addFirst(T t) {
		Node<T> firstNode = new Node<>(t);
		firstNode.next = head;
		head = firstNode;
	}

	public void addLast(T t) {
		if (head == null) {
			head = new Node<>(t);
			return;
		}

		Node<T> currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new Node<>(t);
	}

	public int get(T t) {
		if (head == null)
			return -1;
		if (head.value == t)
			return 0;

		Node<T> currentNode = head;
		int result = 0;
		while (currentNode.next != null) {
			++result;
			if (currentNode.next.value == toString())
				return result;

			currentNode = currentNode.next;
		}

		return -1;
	}

	public void remove(T t) {
		if (head == null)
			return;

		if (head.value == t) {
			head = head.next;
			return;
		}

		Node<T> currentNode = head;
		while (currentNode.next.value == null) {
			if (currentNode.next.value == t) {
				currentNode.next = currentNode.next.next;
				return;
			}
			currentNode = currentNode.next;
		}

	}

	private static class Node<T> {
		public Node<T> next;
		private final T value;

		public Node(T value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node [next=" + next + ", value=" + value + "]";
		}

	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}
}
