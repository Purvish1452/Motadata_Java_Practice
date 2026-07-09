import java.lang.Thread;
class A extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("class A");
        }
    }

}
class B extends Thread{
    public void  run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("class B");
        }
    }
}
class D extends Thread{
    public void  run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("class D");
        }
    }
}
public class Thread_first extends Thread{
    public static void main(String a[])
    {
        A b1=new A();
        B b2=new B();
        D b3=new D();

        b1.start();
        b2.start();
        b3.start();
    }

}





