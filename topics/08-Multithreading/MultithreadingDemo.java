// Class A extending Thread
class A extends Thread {
    // Overriding the run() method to define thread behavior
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");

            try {
                // Making the thread sleep for 10 milliseconds
                Thread.sleep(10);
            } catch (InterruptedException s) {
                s.printStackTrace(); // Printing exception details if interrupted
            }
        }
    }
}

// Class B extending Thread
class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("okay, bye");
        }
    }
}

// Main class for executing multithreading
public class MultithreadingDemo {
    public static void main(String[] args) {
        // Creating thread objects
        A a1 = new A();
        B b1 = new B();

        // Setting thread priorities (10 = highest, 1 = lowest)
        b1.setPriority(10); // B has higher priority
        a1.setPriority(2);  // A has lower priority

        // Starting both threads
        a1.start(); 
        b1.start();
    }
}
