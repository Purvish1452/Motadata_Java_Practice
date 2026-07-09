interface pp{
    public static void pp()
    {
        System.out.println("jay mahakaal");
    }
}

class AA implements Runnable,pp{
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("class A");
            try {
                Thread.sleep(10);

            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

}
class BB  implements Runnable{
    public void  run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("class B");
            try {
                Thread.sleep(10);

            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
class DD implements Runnable{
    public void  run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("class D");
            try {
                Thread.sleep(10);

            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class Thread_third extends Thread{
    public static void main(String a[]) throws InterruptedException {
//        AA b1=new AA();
//        BB b2=new BB();
//        DD b3=new DD();

//        System.out.println(b1.getPriority());
//        System.out.println(b1.getPriority());
//        System.out.println(b1.getPriority());
//        b1.start();
//        Thread.sleep(2);
//        b2.start();
//        Thread.sleep(2);
//        b3.start();
//        Thread.sleep(2);

        Runnable b1=new AA();
        Runnable b2=new BB();
        Runnable b3=new DD();

        Thread t1=new Thread(b1);
        Thread t2=new Thread(b2);
        Thread t3=new Thread(b3);

        t1.start();
        t2.start();
        t3.start();





    }

}
