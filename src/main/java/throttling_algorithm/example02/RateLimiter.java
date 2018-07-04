package throttling_algorithm.example02;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class RateLimiter {
  DelayQueue<DelayedEntry> queue;
  DelayedEntry token;
  TimeUnit rateUnit;
  AtomicInteger rate;

  RateLimiter(int rateLimit) {
    queue = new DelayQueue<>();
    rateUnit = TimeUnit.NANOSECONDS;
    rate = new AtomicInteger(rateLimit);
    token = new DelayedEntry(0, TimeUnit.NANOSECONDS);
  }

  boolean acquire(int permits) throws InterruptedException {
    long targetDelay = rateUnit.toNanos(permits) / Math.max(1, rate.get());
    DelayedEntry nextToken = token;
    while (!queue.isEmpty()) {
      nextToken = queue.take();
    }
    assert nextToken != null;
    nextToken.setDelay(targetDelay);
    return queue.offer(token);
  }
}
