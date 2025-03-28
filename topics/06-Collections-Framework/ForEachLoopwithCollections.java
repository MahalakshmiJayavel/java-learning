import java.util.ArrayList;

public class ForEachLoopwithCollections {
    public static void main(String[] args) {
       
        ArrayList<String> names = new ArrayList<>();

        names.add("Maha");
        names.add("Shamee");
        names.add("Shwe");
        names.add("Divya");

        System.out.println("Names in the list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
