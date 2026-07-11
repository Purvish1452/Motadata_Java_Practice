import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Thread_pool_2 {
  public static void main(String a[]) throws ExecutionException, InterruptedException {
//      //Furture and Callable
//
//      ExecutorService executor = Executors.newFixedThreadPool(2);
//
////      Future<Integer> f1=executor.submit(()->10);
//
//      Future<Integer> f1=executor.submit(()->{
//          try {
//              Thread.sleep(3000);
//          }catch (Exception e) {}
//          return 10;
//      });
//
//
//      System.out.print(f1.get());




      ExecutorService executor =Executors.newFixedThreadPool(2);

      executor.execute(()->{
          int x=10/0;
      });

      Future<Integer> f1=executor.submit(()->{
          return (10/0);
      });

      try {
          System.out.println(f1.get());
      }catch (Exception e){}



  }

}