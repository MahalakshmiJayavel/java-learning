public class VariableScope {
    int num = 15;

public void method() {
    int num1 = 20;

    System.out.println(num/num1);
}

        public void methodA() {
            int num2 = 21;
            System.out.println(num*num2);
        }

        public static void main(String[] args) {
            VariableScope mainNumber= new VariableScope();
            mainNumber.method();
            mainNumber.methodA();

        }
    }


