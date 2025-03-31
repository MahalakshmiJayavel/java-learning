public class ThreadJoining {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started to run");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started to run");
        });

        t1.start();
        t2.start();

        try {
            t1.join(); 
            t2.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread  has been interrupted.");
        }

        System.out.println("Program ends.");
    }
}
