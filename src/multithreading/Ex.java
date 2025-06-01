package multithreading;

public class Ex {
	public static void main(String[] args) throws InterruptedException {

		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		thread.start();

		Runnable task = () -> {
			for (int i = 100; i >= 0; i--) {
				System.out.println(i + " " + Thread.currentThread().getName());
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread thread1 = new Thread(task);
		thread1.start();
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
			Thread.sleep(10);
		}

	}
}
