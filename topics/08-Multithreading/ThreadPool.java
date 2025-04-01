import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

    public static void main(String[] args) {
        
        int ThreadPoolsize = 4;
        ExecutorService executorService = Executors.newFixedThreadPool(ThreadPoolsize);

        for (int i = 1; i <= 5; i++) {
            final int taskNumber = i; 
            executorService.submit(() -> {
                System.out.println("Task " + taskNumber + " started by " + Thread.currentThread().getName());
                try {
                    TimeUnit.SECONDS.sleep(3); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskNumber + " completed");
            });
        }

     
        executorService.shutdown();

        try {
           
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                System.err.println("Not all tasks completed in time");
                executorService.shutdownNow(); 
            }
        } catch (InterruptedException e) {
            System.err.println("Interruption occurred");
            executorService.shutdownNow();
            Thread.currentThread().interrupt(); 
        }
    }
}
