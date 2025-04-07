import java.util.concurrent.CompletableFuture;

public class CompletableFuDemp {
    public static void main(String[] args) {
        System.out.println("The main thread is starting");

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 3 * 5
            ; 
        });

        future.thenAccept(result -> System.out.println("Result " + result));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is finished");
    }
}
