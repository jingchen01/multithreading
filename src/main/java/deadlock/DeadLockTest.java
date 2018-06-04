package deadlock;

public class DeadLockTest {

	public static void main(String[] args) {

		Thread t1 = new Thread(new DeadLockDemo(true));
		Thread t2 = new Thread(new DeadLockDemo(false));
		t1.start();
		t2.start();
	}
}
