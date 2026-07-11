import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Thread_pool_3 {
    public static void main(String a[])
    {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(
                        2,
                        5,
                        10,
                        TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(5)
                );
        for(int i=0;i<5;i++)
        {
            int task=i;

            executor.execute(()->{
                System.out.println("Task " + task + " is performed by "+ Thread.currentThread().getName());

                try {
                    Thread.sleep(2000);
                }catch (Exception e){}

            });

        }
        executor.shutdown();
    }


}