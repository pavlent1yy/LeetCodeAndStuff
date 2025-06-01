package multithreading;

import java.util.ArrayList;

public class Ex2 {
	public static void main(String[] args) {
		BlockingQueue queue = new BlockingQueue();
		Thread worker = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					Runnable task1 = queue.get();
					task1.run();
				}
			}
		});
		worker.start();

		for (int i = 0; i < 10; i++) {
			queue.put(getTask());
		}
	}

	public static Runnable getTask() {
		return new Runnable() {
			@Override
			public void run() {
				System.out.println("Task started" + this);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("This finished " + this);
			}
		};
	}

	static class BlockingQueue {
		ArrayList<Runnable> tasks = new ArrayList<>();

		public synchronized Runnable get() {
			while (tasks.isEmpty()) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Runnable task = tasks.get(0);
			tasks.remove(task);
			return task;
		}

		public synchronized void put(Runnable task) {
			tasks.add(task);
			notify();
		}
	}


	// public static void test1() {

	// 	Runnable runnable = new Runnable() {
	// 		@Override
	// 		synchronized public void run() {
	// 			counter = 0;
	// 			for (int i = 0; i < 5; i++) {
	// 				counter++;
	// 				System.out.println(Thread.currentThread().getName() + ":" + counter);
	// 			}
	// 		}
	// 	};
	// 	Thread th1 = new Thread(runnable);
	// 	Thread th2 = new Thread(runnable);

	}

