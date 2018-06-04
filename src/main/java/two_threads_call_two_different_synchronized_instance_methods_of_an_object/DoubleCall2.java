package two_threads_call_two_different_synchronized_instance_methods_of_an_object;

public class DoubleCall2 {

  private final byte[] lock1 = {};
  private final byte[] lock2 = {};

  public void method1() {
    synchronized (lock1) {
      try {
        System.out.println("DoubleCall2::method1");
        Thread.sleep(3000);
        System.out.println("You've waited for me for 3 seconds. It's your turn.");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void method2() {
    synchronized (lock2) {
      try {
        System.out.println("DoubleCall2::method2");
        Thread.sleep(5000);
        System.out.println("You've waited for me for 5 seconds. It's your turn.");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
