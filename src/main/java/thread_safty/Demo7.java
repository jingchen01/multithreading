package thread_safty;

/**
 * ticket system with synchronized, it's thread safe
 * 
 */
public class Demo7 implements Runnable {

	private int tickets;

	public Demo7(int tickets) {
		super();
		this.tickets = tickets;
	}

	public void run() {

		while (true) {
			synchronized (Demo7.class) {
				if (tickets > 0) {
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName()
							+ "... sale : ticket#" + tickets--);
				} else {
					break;
				}
			}
		}
	}

}
