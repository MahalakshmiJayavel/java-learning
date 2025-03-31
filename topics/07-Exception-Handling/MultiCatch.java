public class MultiCatch {
    public static void main(String[] args) {
        try {
            String str1 = null;
            System.out.println("String length: " + str1.length());

            int[] numbers = {1, 2, 3};
            System.out.println("Number at index 5: " + numbers[5]); 

        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("Program continues.");
    }
}
