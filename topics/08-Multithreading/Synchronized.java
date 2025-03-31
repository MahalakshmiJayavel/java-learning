class number {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class Synchronized {
    public static void main(String[] args) {
        number maha = new number();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                maha.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                maha.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted.");
        }

        System.out.println("Final Answer:  " + maha.count);
    }
}
