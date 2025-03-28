import java.util.Arrays;
public class ArrayMerge {
   
    public static void main(String[] args) {
        // First array
        int[] array1 = {1, 2, 3};

        // Second array
        int[] array2 = {4, 5, 6};

        // Create a new array to hold both
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from array1
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from array2
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        // Print merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}

