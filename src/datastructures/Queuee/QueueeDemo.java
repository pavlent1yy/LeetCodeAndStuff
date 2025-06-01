package datastructures.Queuee;

public class QueueeDemo {
	public static void main(String[] args) {
		Queuee<String> queuee = new Queuee<>();

		queuee.enqueue("A");
		queuee.enqueue("b");
		queuee.enqueue("C");
		queuee.enqueue("d");

		System.out.println(queuee.peek());
	}
}
