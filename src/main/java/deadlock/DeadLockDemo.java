package deadlock;

public class DeadLockDemo implements Runnable {

	private final boolean flag;

	public DeadLockDemo(boolean flag) {
		super();
		this.flag = flag;
	}

	public void run() {
		if (flag) {
			while (true) {
				synchronized (LockDemo.lock1) {
					System.out.println("if lock1");
					synchronized (LockDemo.lock2) {
						System.out.println("if lock2");
					}
				}
			}
		} else {
			while (true) {
				synchronized (LockDemo.lock2) {
					System.out.println("else lock2");
					synchronized (LockDemo.lock1) {
						System.out.println("else lock1");
					}
				}
			}
		}

	}

}
