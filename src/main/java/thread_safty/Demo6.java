package thread_safty;

/**
 * ticket system with synchronized, it's thread safe
 * 
 */
public class Demo6 implements Runnable {

	private int tickets;

	public Demo6(int tickets) {
		super();
		this.tickets = tickets;
	}

	public void run() {

		synchronized (Demo6.class) {
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

}
