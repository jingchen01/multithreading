package concurrent_collections.CopyOnWriteArrayList;

import java.util.Iterator;
// Java program to illustrate ConcurrentCollection uses
import java.util.concurrent.CopyOnWriteArrayList;

class ConcurrentDemo2 extends Thread {
  static CopyOnWriteArrayList l = new CopyOnWriteArrayList();

  public void run() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      System.out.println("Child Thread" + " going to add element");
    }

    // Child thread trying to add new
    // element in the Collection object
    l.add("D");
  }

  public static void main(String[] args) throws InterruptedException {
    l.add("A");
    l.add("B");
    l.add("c");

    // We create a child thread that is
    // going to modify ArrayList l.
    ConcurrentDemo2 t = new ConcurrentDemo2();
    t.start();

    // Now we iterate through the ArrayList
    // and get exception.
    Iterator itr = l.iterator();
    while (itr.hasNext()) {
      String s = (String) itr.next();
      System.out.println(s);
      Thread.sleep(6000);
    }
    System.out.println(l);
  }
}


/*--out:*

A
B
c
[A, B, c, D]

 *---*/
