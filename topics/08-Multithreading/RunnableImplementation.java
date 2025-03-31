class TaskA implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is running.");
    }
}

public class RunnableImplementation {
    public static void main(String[] args) {
        TaskA taskA = new TaskA();

        Thread threadA = new Thread(taskA);

        threadA.start();

        System.out.println("Start Main method");
    }
}
