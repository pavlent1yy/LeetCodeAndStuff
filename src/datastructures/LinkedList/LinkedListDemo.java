package datastructures.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.addLast("B");
		linkedList.addLast("C");
		linkedList.addLast("D");
		linkedList.addLast("E");
		linkedList.addLast("L");

		System.out.println(linkedList);
	}

}
