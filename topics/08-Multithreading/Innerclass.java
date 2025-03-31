public class Innerclass {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread is running using anonymous class.");
            }
        };

        thread1.start();

        System.out.println("Main method runs");
    }
}
