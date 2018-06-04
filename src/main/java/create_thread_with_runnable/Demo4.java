package create_thread_with_runnable;

public class Demo4 implements Runnable {

	private int tickets;

	public Demo4(int tickets) {
		super();
		this.tickets = tickets;
	}

	public void run() {
		while (tickets > 0) {
			System.out.println(Thread.currentThread().getName()
					+ "... sale : ticket#" + tickets--);
		}
	}

}
