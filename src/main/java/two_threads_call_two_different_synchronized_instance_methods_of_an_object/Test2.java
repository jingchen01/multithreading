package two_threads_call_two_different_synchronized_instance_methods_of_an_object;

public class Test2 {

  public static void main(String[] args) {

    DoubleCall2 doubleCall = new DoubleCall2();

    new Thread(new Runnable() {
      public void run() {
        doubleCall.method1();
      }
    }).start();


    new Thread(new Runnable() {
      public void run() {
        doubleCall.method2();
      }
    }).start();

    new Thread(new Runnable() {
      public void run() {
        doubleCall.method2();
      }
    }).start();
  }


}

/*--out:*

DoubleCall2::method1
DoubleCall2::method2
You've waited for me for 3 seconds. It's your turn.
You've waited for me for 5 seconds. It's your turn.
DoubleCall2::method2
You've waited for me for 5 seconds. It's your turn.


 *---*/


