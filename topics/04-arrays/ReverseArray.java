public class ReverseArray {
        public static void main(String[] args) {
            int[] array = {11, 12, 23, 32, 51};
    
            System.out.println("Original array:");
            for (int num : array) {
                System.out.print(num + " ");
            }
    
            System.out.println("\nReversed array:");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }
    }
    
