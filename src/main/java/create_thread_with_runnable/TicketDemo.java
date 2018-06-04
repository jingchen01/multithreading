package create_thread_with_runnable;

public class TicketDemo {

	public static void main(String[] args) {

		int tickets = 20;
		Demo4 d = new Demo4(tickets);

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		Thread t3 = new Thread(d);
		Thread t4 = new Thread(d);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

/*--------------------------------------------------------- * 
 Output:

 Thread-1... sale : ticket#19
 Thread-3... sale : ticket#17
 Thread-2... sale : ticket#18
 Thread-0... sale : ticket#20
 Thread-2... sale : ticket#14
 Thread-3... sale : ticket#15
 Thread-3... sale : ticket#11
 Thread-1... sale : ticket#16
 Thread-3... sale : ticket#10
 Thread-2... sale : ticket#12
 Thread-0... sale : ticket#13
 Thread-0... sale : ticket#6
 Thread-0... sale : ticket#5
 Thread-2... sale : ticket#7
 Thread-3... sale : ticket#8
 Thread-3... sale : ticket#2
 Thread-1... sale : ticket#9
 Thread-3... sale : ticket#1
 Thread-2... sale : ticket#3
 Thread-0... sale : ticket#4


 ---------------------------------------------------------*/