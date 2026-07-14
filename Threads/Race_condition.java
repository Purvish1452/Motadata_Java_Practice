public class Race_condition {
    private int count = 0;

    public void increment() {
        count++; // NOT ATOMIC!
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        Race_condition counter = new Race_condition();

        // Create 1000 threads, each incrementing 1000 times
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
        }

        long startTime = System.currentTimeMillis();
        for (Thread t : threads) t.start();
        for (Thread t : threads) t.join();
        long endTime = System.currentTimeMillis();

        System.out.println("Bad Counter");
        System.out.println("Expected: 1,000,000");
        System.out.println("Actual: " + counter.getCount());
        System.out.println("Time: " + (endTime - startTime) + "ms");
    }
}

// OUTPUT: Usually something like 897,432 (less than expected!)