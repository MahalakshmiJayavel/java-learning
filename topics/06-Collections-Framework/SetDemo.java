import java.util.*; 

public class SetDemo {
    public static void main(String[] args) {
        TreeSet<String> place = new TreeSet<>();

        place.add("MI"); // Michigan
        place.add("MA"); // Massachusetts
        place.add("CA"); // California
        place.add("VA"); // Virginia

        System.out.println("Sorted Set of Places: " + place);
    }
}

