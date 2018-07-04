package throttling_algorithm.example01;

public class Main {

  private static Pool<Connector> pool = new Pool<Connector>();

  public static void main(String[] args) throws InterruptedException {
    int throttle = 100;
    Connector c = new Connector(throttle);
    pool.put(c);
    Connector c1;
    long time = System.currentTimeMillis();
    for (int i = 0; i < 10; i++) {
      c1 = pool.get();
      c1.send(null);
      System.out.println("Throttle:" + (System.currentTimeMillis() - time));
      time = System.currentTimeMillis();
    }
  }
}
