public class MethodOverloading {

        public int add(int a, int b) {
            return a + b;
        }
    
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    
        public static void main(String[] args) {
            MethodOverloading calc = new MethodOverloading();
            System.out.println("Sum of 2 and 3: " + calc.add(1, 2));
            System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3));
        }
    }
    
    