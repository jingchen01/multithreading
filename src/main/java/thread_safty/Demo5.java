package thread_safty;

/**
 * ticket system without synchronized, it's not thread safe
 * 
 */
public class Demo5 implements Runnable {

	private int tickets;

	public Demo5(int tickets) {
		super();
		this.tickets = tickets;
	}

	public void run() {
		while (tickets > 0) {

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName()
					+ "... sale : ticket#" + tickets--);
		}
	}

}
