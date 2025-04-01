public class PreventingDeadlock {

    private static final Object Senario1 = new Object();
    private static final Object Senario2 = new Object();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            synchronized (Senario1) { 
                System.out.println("Thread 1 is holding Senario1");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 1 is Waiting for Senario2...");
                synchronized (Senario2) { 
                    System.out.println("Thread 1 acquired Senario2!");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (Senario1) { 
                System.out.println("Thread 2 is holding Senario1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 2 is Waiting for Senario2...");
                synchronized (Senario2) { 
                    System.out.println("Thread 2 acquired Senario2!");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
