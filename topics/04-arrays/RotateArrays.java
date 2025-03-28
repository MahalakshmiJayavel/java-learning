   import java.util.Arrays;

public class RotateArrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int positions = 3; 

        int length = arr.length;
        int[] rotated = new int[length];

        // Rotating to the right
        for (int i = 0; i < length; i++) {
            rotated[(i + positions) % length] = arr[i];
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Rotated Array:  " + Arrays.toString(rotated));
    }
}
