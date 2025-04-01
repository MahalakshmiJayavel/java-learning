public class ThreadLocalDemo {

    private static ThreadLocal<Integer> threadLocalData = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 Initial Value: " + threadLocalData.get());

            threadLocalData.set(100);
            System.out.println("Thread 1 Updated Value: " + threadLocalData.get());
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 Initial Value: " + threadLocalData.get());

            threadLocalData.set(200);
            System.out.println("Thread 2 Updated Value: " + threadLocalData.get());
        });

    
        thread1.start();
        thread2.start();

    
        thread1.join();
        thread2.join();
        System.out.println("Main Thread Value: " + threadLocalData.get());
    }
}
