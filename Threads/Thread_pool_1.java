import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_pool_1 {
   public static void main(String a[])
   {
       ExecutorService executor = Executors.newFixedThreadPool(2);

       for(int i=1;i<=100;i++)
       {
           int task=i;
           executor.execute(()->{
               System.out.println("Task " + task+ " is performed by " + Thread.currentThread().getName());
           });
       }
       executor.shutdown();
   }

}