import java.util.concurrent.locks.StampedLock;

class SharedData {
    private int value = 100;
    private final StampedLock lock = new StampedLock();

    // Writer
    public void write(int newValue) {
        long stamp = lock.writeLock();
        try {
            System.out.println(Thread.currentThread().getName()
                    + " writing: " + newValue);
            value = newValue;
            Thread.sleep(1000); // Simulate work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    // Optimistic Reader
    public int optimisticRead() {
        long stamp = lock.tryOptimisticRead(); // 1. Get optimistic stamp

        int currentValue = value;              // 2. Read data without locking

        if (!lock.validate(stamp)) {           // 3. Check if a writer modified data
            stamp = lock.readLock();           // 4. Fall back to a real read lock
            try {
                currentValue = value;
            } finally {
                lock.unlockRead(stamp);
            }
        }
        else {
            System.out.println(Thread.currentThread().getName()
                    + " -> Optimistic read successful.");
        }

        return currentValue;
    }
}

public class Stamped_Lock {

    public static void main(String[] args) {

        SharedData data = new SharedData();

        Thread reader1 = new Thread(() -> {
            System.out.println("Reader1 read: " + data.optimisticRead());
        }, "Reader-1");

        Thread writer = new Thread(() -> {
            data.write(200);
        }, "Writer");

        Thread reader2 = new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Reader2 read: " + data.optimisticRead());
        }, "Reader-2");

        reader1.start();
        writer.start();
        reader2.start();
    }
}