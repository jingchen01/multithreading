package get_thread_instance_and_name;

public class ThreadName {

	public static void main(String[] args) {

		Thread t1 = new Demo3("NO. 1");
		Thread t2 = new Demo3("NO. 2");
		t1.start();
		t2.start();

		for (int i = 0; i < 10; ++i) {
			System.out.println(Thread.currentThread().getName() + " run --- "
					+ i);
		}

	}

}

/*--------------------------------------------------------- *

 Output:

 NO. 1 run --- 0
 NO. 1 run --- 1
 NO. 1 run --- 2
 NO. 2 run --- 0
 main run --- 0
 NO. 2 run --- 1
 NO. 1 run --- 3
 NO. 1 run --- 4
 NO. 2 run --- 2
 NO. 2 run --- 3
 NO. 2 run --- 4
 main run --- 1
 main run --- 2
 main run --- 3
 main run --- 4
 main run --- 5
 NO. 2 run --- 5
 NO. 2 run --- 6
 NO. 2 run --- 7
 NO. 1 run --- 5
 NO. 1 run --- 6
 NO. 1 run --- 7
 NO. 2 run --- 8
 NO. 2 run --- 9
 main run --- 6
 main run --- 7
 main run --- 8
 NO. 1 run --- 8
 NO. 1 run --- 9
 main run --- 9

 ---------------------------------------------------------*/