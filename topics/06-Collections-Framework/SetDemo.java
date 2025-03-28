import java.util.*; 

public class SetDemo {
    public static void main(String[] args) {
        // Creating a TreeSet to store unique places in sorted order
        TreeSet<String> place = new TreeSet<>();

        // Adding elements to the TreeSet
        place.add("MI"); // Michigan
        place.add("MA"); // Massachusetts
        place.add("CA"); // California
        place.add("VA"); // Virginia

        // Printing the TreeSet (elements will be sorted in natural order)
        System.out.println("Sorted Set of Places: " + place);
    }
}

