package throttling_algorithm.example01;

import java.util.concurrent.TimeUnit;

/**
 * Network writer
 * 
 * @author krishnaprasad
 * 
 */
public class Connector extends AbstractDelayedWrapper {

  public Connector(int throttle) {
    super(TimeUnit.MILLISECONDS);// use nanoseconds for more throughput
    delay = 1000 / throttle;// this can be improved for decimal places
  }

  @Override
  public long getCurrentTime() {
    return System.currentTimeMillis();
  }

  public boolean send(Object obj) {
    // To-do implement the packet writing logic
    System.out.println("Packet send...");
    return true;
  }
}
