package get_thread_instance_and_name;

/*--------------------------------------------------------- * 
 * 原来线程都有自己默认的名称。 
 * Thread－编号 该编号从0开始。
 * 
 * 
 * static Thread currentThread(): 获取当前的线程对象 
 Returns a reference to the currently executing thread object.

 * getName(): 获取线程的名称
 * Returns this thread's name. 
 * 
 * 设置线程的名称: setName或者构造函数 
 * setName(String name)
 Changes the name of this thread to be equal to the argument name.
 * Thread(String name) Allocates a new Thread object.
 每一个线程占有独立的内存空间，所以不同的线程占的内存空间不一样

 ---------------------------------------------------------*/

public class Demo3 extends Thread {

	public Demo3(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 10; ++i) {
			System.out.println(Thread.currentThread().getName() + " run --- "
					+ i);
		}
	}

}
