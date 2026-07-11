//import java.util.concurrent.atomic.AtomicInteger;
//
//class Counter
//{
//    // Creating a variable of class type AtomicInteger
//    AtomicInteger count
//            = new AtomicInteger();
//
//    // Defining increment() method to change value of AtomicInteger variable
//    public void increment() {
//        count.incrementAndGet();
//    }
//}
//
//public class Thread_ten {
//    public static void main(String[] args)
//            throws Exception
//    {
//        // Creating an instance of Counter class
//        Counter c = new Counter();
//
//        // Creating an instance t1 of Thread class
//        Thread t1 = new Thread(new Runnable()
//        {
//            public void run() {
//                for(int i = 1; i <= 2000; i++) {
//                    c.increment();
//                }
//            }
//        });
//
//        // Creating an instance t2 of Thread class
//        Thread t2 = new Thread(new Runnable()
//        {
//            public void run() {
//                for (int i = 1; i <= 2000; i++) {
//                    c.increment();
//                }
//            }
//        });
//
//        // Calling start() method with t1 and t2
//        t1.start();
//        t2.start();
//

import java.util.concurrent.atomic.AtomicInteger;

////        // Calling join method with t1 and t2
//        t1.join();   //join is wait to finish the thread excution then join it
//        t2.join();
//
//        System.out.println(c.count);
//    }
//}




//Atomic method for achive 200000 count otherwise it not correct the count .


//class Counter {
//   static AtomicInteger count =new AtomicInteger();
//}
//
//public class Thread_ten{
//
//    public static void main(String[] args) throws InterruptedException {
//
//        Runnable task = () -> {
//            for (int i = 0; i < 100000; i++) {
//                Counter.count.incrementAndGet();
//            }
//        };
//
//        Thread t1 = new Thread(task);
//        Thread t2 = new Thread(task);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Final Count = " + Counter.count);
//    }
//}