package throttling_algorithm.example01;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author krishnaprasad
 * 
 */
public abstract class AbstractDelayedWrapper implements Delayed {

  private long queueInsertTime;

  protected long delay;

  private TimeUnit timeUnit;

  public AbstractDelayedWrapper(TimeUnit timeUnit) {
    super();
    this.timeUnit = timeUnit;
    this.queueInsertTime = getCurrentTime();
  }

  /**
   * Should return in the specified TimeUnit
   * 
   * @return
   */
  public abstract long getCurrentTime();

  public void updateTime() {
    this.queueInsertTime = getCurrentTime();
  }

  @Override
  public long getDelay(TimeUnit unit) {
    return unit.convert((queueInsertTime - getCurrentTime()) + delay, timeUnit);
  }

  @Override
  public int compareTo(Delayed obj) {
    int val = 0;
    Delayed newObj = obj;
    long newDelay = newObj.getDelay(timeUnit);
    long thisDelay = this.getDelay(timeUnit);
    if (thisDelay < newDelay) {
      val = -1;
    } else if (thisDelay > newDelay) {
      val = 1;
    }
    return val;
  }
}
