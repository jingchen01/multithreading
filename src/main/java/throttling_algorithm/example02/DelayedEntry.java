package throttling_algorithm.example02;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedEntry implements Delayed {
  long expireAt;
  TimeUnit unit;

  DelayedEntry(long delay, TimeUnit tu) {
    unit = tu;
    setDelay(delay);
  }

  void setDelay(long delay) {
    this.expireAt = System.nanoTime() + unit.toNanos(delay);
  }

  public int compareTo(Delayed other) {
    throw new IllegalStateException("Expected single element queue");
  }

  public long getDelay(TimeUnit u) {
    return u.convert(expireAt - System.nanoTime(), TimeUnit.NANOSECONDS);
  }
}
