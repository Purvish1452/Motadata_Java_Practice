class couter {
    int ct;

    public  synchronized void incre() {
        ct++;
        System.out.println("jay mahakaal");
    }



}

public class Thread_five {
    public static void main(String a[]) throws InterruptedException {
        couter c = new couter();

        Runnable b1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.incre();
            }
        };

        Runnable b2 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.incre();
            }
        };
        Thread t1=new Thread(b1);
        Thread t2=new Thread(b2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.ct);


    }
}

