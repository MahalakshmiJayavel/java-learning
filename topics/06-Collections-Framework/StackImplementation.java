import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack " + stack);

        int popped = stack.pop();
        System.out.println("Popped element" + popped);

        System.out.println("Final Stack " + stack);
    }
}
