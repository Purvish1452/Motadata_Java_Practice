
class A1 extends Thread{
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
class B1 extends Thread{
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
class D1 extends Thread{
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
public class Thread_second extends Thread{
    public static void main(String a[]) throws InterruptedException {
        A1 b1=new A1();
        B1 b2=new B1();
        D1 b3=new D1();

        System.out.println(b1.getPriority());
        System.out.println(b1.getPriority());
        System.out.println(b1.getPriority());



        b1.start();
        Thread.sleep(2);
        b2.start();
        Thread.sleep(2);
        b3.start();
        Thread.sleep(2);


    }

}
