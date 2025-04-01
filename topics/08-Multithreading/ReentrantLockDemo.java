import java.util.concurrent.locks.ReentrantLock;
class Main {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();


    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }


    public int getCount() {
        lock.lock();
        try {
            return count;
        } finally {
            lock.unlock();
        }
    }
}


public class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Main counter = new Main();


        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };


        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);


        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();
        System.out.println("Final count: " + counter.getCount());
    }
}