
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistConversion {
    public static void main(String[] args) {
        // Convert Array to ArrayList
        String[] array = {"Mango", "apple", "grapes"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println("ArrayList from Array:");
        System.out.println(arrayList);

        // Convert ArrayList back to Array
        String[] convertedArray = arrayList.toArray(new String[0]);

        System.out.println("Array from ArrayList:");
        for (String item : convertedArray) {
            System.out.println(item);
        }
    }
}


