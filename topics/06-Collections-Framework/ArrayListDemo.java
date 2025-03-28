import java.util.ArrayList; 

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> a = new ArrayList<>();

        // Adding elements to the ArrayList
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        // Removing the element at index 1 (which is '2')
        a.remove(1); // After removal, list becomes [1, 3, 4, 5]

        // Iterating through the ArrayList and printing elements
        for (int i : a) {
            System.out.println(i);
        }
    }
}
