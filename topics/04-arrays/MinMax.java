public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {7,11,14,18,01,20};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Max num: " + max);
        System.out.println("Min num: " + min);
    }
}
