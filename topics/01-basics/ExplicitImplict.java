public class ExplicitImplict {
        public static void main(String[] args) {
            // Implicit Conversion
            int a;
            a = 100;
            double b = a;

            System.out.println("value of b: " + b);

            // Explicit Conversion
            double c = 9.78;
            float d = (float) c;

            System.out.println("value of d: " + d);
        }
    }


