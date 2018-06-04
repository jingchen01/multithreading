package two_threads_call_two_different_synchronized_instance_methods_of_an_object;

public class DoubleCall {
  public synchronized void method1() {
    try {
      System.out.println("DoubleCall::method1");
      Thread.sleep(3000);
      System.out.println("You've waited for me for 3 seconds. It's your turn.");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public synchronized void method2() {

    try {
      System.out.println("DoubleCall::method2");
      Thread.sleep(5000);
      System.out.println("You've waited for me for 5 seconds. It's your turn.");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
