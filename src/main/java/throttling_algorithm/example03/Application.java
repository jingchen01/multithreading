package throttling_algorithm.example03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class Application {
  public static void main(String[] args) throws InterruptedException {

    long start = System.currentTimeMillis();
    final List<DelayedSwap> delayed = new ArrayList<DelayedSwap>();
    for (int i = 1; i < Constants.COUNT; i++) {
      delayed.add(new DelayedSwap(i, start));
    }

    final DelayQueue<DelayedSwap> dq = new DelayQueue<>();
    dq.addAll(delayed);

    new Thread(new Runnable() {

      @Override
      public void run() {
        try {
          TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
        }
        for (DelayedSwap d : delayed) {
          d.swap = true;
        }
      }
    }).start();

    while (!dq.isEmpty()) {
      System.out.println(dq.take());
    }

  }
}
