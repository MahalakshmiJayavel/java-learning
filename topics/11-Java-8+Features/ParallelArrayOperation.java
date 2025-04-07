import java.util.Arrays;

public class ParallelArrayOperation {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 9, 1};

        int[] numbersForParallel = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(numbers);
        System.out.println("Arrays.sort(): " + Arrays.toString(numbers));

        Arrays.parallelSort(numbersForParallel);
        System.out.println(" Arrays.parallelSort(): " + Arrays.toString(numbersForParallel));
    }
}
