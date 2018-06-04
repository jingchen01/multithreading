package delayqueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public class DelayQueueExample {

	public static void main(String[] args) {
		DelayQueue queue = new DelayQueue();

		Delayed element1 = new DelayedElement();

		queue.put(element1);

		try {
			Delayed element2 = queue.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}