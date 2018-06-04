package run_and_start;

public class ThreadDemo {

	public static void main(String[] args) {

		Thread d = new Demo();
		d.start();// 开启线程并执行该线程的run方法

		for (int i = 0; i < 10; ++i) {
			System.out.println("ThreadDemo run --- " + i);
		}
	}

}

/*--------------------------------------------------------- * 
 Output:

 ThreadDemo run --- 0
 ThreadDemo run --- 1
 Demo run --- 0
 Demo run --- 1
 Demo run --- 2
 ThreadDemo run --- 2
 ThreadDemo run --- 3
 ThreadDemo run --- 4
 Demo run --- 3
 Demo run --- 4
 ThreadDemo run --- 5
 ThreadDemo run --- 6
 Demo run --- 5
 Demo run --- 6
 Demo run --- 7
 Demo run --- 8
 Demo run --- 9
 ThreadDemo run --- 7
 ThreadDemo run --- 8
 ThreadDemo run --- 9

 ---------------------------------------------------------*/