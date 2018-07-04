package throttling_algorithm.example03;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedSwap implements Delayed, Comparable<Delayed> {


  int index = 0;
  volatile boolean swap = false;
  long starttime;

  public DelayedSwap(int index, long starttime) {
    super();
    this.index = index;
    this.starttime = starttime;
  }

  private long getDelay() {
    return (swap ? starttime + (2 * Constants.COUNT - index) * 100 : starttime + index * 100)
        - System.currentTimeMillis();
  }


  public String toString() {
    return index + " swapped " + swap + " delay " + getDelay();
  }

  @Override
  public long getDelay(TimeUnit unit) {
    return unit.convert(getDelay(), TimeUnit.MILLISECONDS);
  }

  @Override
  public int compareTo(Delayed delayed) {
    if (delayed == this) {
      return 0;
    }

    return (int) (getDelay(TimeUnit.MILLISECONDS) - delayed.getDelay(TimeUnit.MILLISECONDS));
  }
}
