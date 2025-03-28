public class MethodOverloading {

        // Method 1: Add two integers
        public int add(int a, int b) {
            return a + b;
        }
    
        // Method 2: Add three integers
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    
        public static void main(String[] args) {
            MethodOverloading calc = new MethodOverloading();
            System.out.println("Sum of 2 and 3: " + calc.add(1, 2));
            System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3));
        }
    }
    
    