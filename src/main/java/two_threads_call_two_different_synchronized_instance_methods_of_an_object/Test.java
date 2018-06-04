package two_threads_call_two_different_synchronized_instance_methods_of_an_object;

public class Test {

  public static void main(String[] args) {

    DoubleCall doubleCall = new DoubleCall();

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

DoubleCall::method1
You've waited for me for 3 seconds. It's your turn.
DoubleCall::method2
You've waited for me for 5 seconds. It's your turn.
DoubleCall::method2
You've waited for me for 5 seconds. It's your turn.


 *---*/


