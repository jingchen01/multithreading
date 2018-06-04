package run_and_start;

public class Demo extends Thread {

	public void run() {
		for (int i = 0; i < 10; ++i) {
			System.out.println("Demo run --- " + i);
		}
	}

}
