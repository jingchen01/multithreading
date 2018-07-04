package threadsafe_cache.best_example;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;

public class ScalableConcurrentCache {
  // Ideally pass a parameter for the initial size and the load factor, its important because the
  // expansion of concurrent objects is a costly operation
  private ConcurrentMap<String, FutureTask<String>> cache =
      new ConcurrentHashMap<String, FutureTask<String>>();

  public String getOrComputeScalable(String costlyOperation) {
    try {
      FutureTask<String> futureResult = cache.get(costlyOperation);
      if (futureResult == null) {
        // create future task instance
        FutureTask<String> task = new FutureTask<String>(new Callable<String>() {

          @Override
          public String call() throws Exception {
            String resultOfCostlyOperation = "";
            // execute - costlyOperation
            return resultOfCostlyOperation;
          }

        });
        // put future task into cache map
        FutureTask<String> resultInCache = cache.putIfAbsent(costlyOperation, task);
        if (resultInCache == null) {
          futureResult = task;
          task.run();
        }
      }
      return futureResult.get();
    } catch (Exception e) {
      // You may add specific exception handlers, I have added a generic one to keep the code simple
      // This is ideally to remove inconsistent entries from the cache
      cache.remove(costlyOperation);
    }
    return null;
  }
}
