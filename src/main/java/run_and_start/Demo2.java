package run_and_start;

public class Demo2 extends Thread {

	private String name;

	public Demo2(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; ++i) {
			System.out.println(name + " demo run --- " + i);
		}
	}

}
