package run_and_start;

public class ThreadDemo4 {

	public static void main(String[] args) {

		Thread t1 = new Demo2("thread-1");
		Thread t2 = new Demo2("thread-2");
		t1.run();
		t2.run();

		for (int i = 0; i < 10; ++i) {
			System.out.println("ThreadDemo4 run --- " + i);
		}

	}

}

/*--------------------------------------------------------- * 
 Output:

 thread-1 demo run --- 0
 thread-1 demo run --- 1
 thread-1 demo run --- 2
 thread-1 demo run --- 3
 thread-1 demo run --- 4
 thread-1 demo run --- 5
 thread-1 demo run --- 6
 thread-1 demo run --- 7
 thread-1 demo run --- 8
 thread-1 demo run --- 9
 thread-2 demo run --- 0
 thread-2 demo run --- 1
 thread-2 demo run --- 2
 thread-2 demo run --- 3
 thread-2 demo run --- 4
 thread-2 demo run --- 5
 thread-2 demo run --- 6
 thread-2 demo run --- 7
 thread-2 demo run --- 8
 thread-2 demo run --- 9
 ThreadDemo4 run --- 0
 ThreadDemo4 run --- 1
 ThreadDemo4 run --- 2
 ThreadDemo4 run --- 3
 ThreadDemo4 run --- 4
 ThreadDemo4 run --- 5
 ThreadDemo4 run --- 6
 ThreadDemo4 run --- 7
 ThreadDemo4 run --- 8
 ThreadDemo4 run --- 9



 ---------------------------------------------------------*/