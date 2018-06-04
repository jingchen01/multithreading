package run_and_start;

public class ThreadDemo2 {

	public static void main(String[] args) {

		Thread d = new Demo();// 创建一个线程
		d.run();// 仅仅是对象调用方法，而线程创建了并没有运行。

		for (int i = 0; i < 10; ++i) {
			System.out.println("ThreadDemo run --- " + i);
		}
	}

}

/*--------------------------------------------------------- * 
 Output:

 Demo run --- 0
 Demo run --- 1
 Demo run --- 2
 Demo run --- 3
 Demo run --- 4
 Demo run --- 5
 Demo run --- 6
 Demo run --- 7
 Demo run --- 8
 Demo run --- 9
 ThreadDemo run --- 0
 ThreadDemo run --- 1
 ThreadDemo run --- 2
 ThreadDemo run --- 3
 ThreadDemo run --- 4
 ThreadDemo run --- 5
 ThreadDemo run --- 6
 ThreadDemo run --- 7
 ThreadDemo run --- 8
 ThreadDemo run --- 9


 ---------------------------------------------------------*/