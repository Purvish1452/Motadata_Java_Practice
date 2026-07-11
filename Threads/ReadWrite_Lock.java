import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWrite_Lock {
   public  static void main(String a[])
   {
       ShardResouce sr=new ShardResouce();

       Thread r1=new Thread(()->sr.read());
       Thread r2=new Thread(()->sr.read());
       Thread r3=new Thread(()->sr.read());

       Thread w1=new Thread(()->sr.write(20));
       Thread w2=new Thread(()->sr.write(30));
       Thread w3=new Thread(()->sr.write(40));


       r1.start();
       r2.start();
       r3.start();
       w1.start();
       w2.start();
       w3.start();

   }

}
class ShardResouce{
    private int value=0;

    ReadWriteLock rwLock=new ReentrantReadWriteLock();
    Lock r1=rwLock.readLock(); //shared lock
    Lock w1=rwLock.writeLock(); //exclusive lock




    //shared Lock (for read only)
    public int read()
    {
        r1.lock();
        try{
            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
            System.out.println(Thread.currentThread().getName() + " reades value" + value);
            return value;
        }
        finally {
           r1.unlock();
        }

    }



    //write Lock  (for only write)
    public void write(int newvalue) {
        w1.lock();
        try {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
            value = newvalue;
            System.out.println(Thread.currentThread().getName() + " change value" + value);
        }
        finally {
            w1.unlock();
        }
    }




}