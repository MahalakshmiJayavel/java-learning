import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUseage {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Maha");
        names.add("Shamee");
        names.add("Shwe");
        names.add("Divya");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            String name = itr.next();
            if (name.startsWith("S")) {
                itr.remove();  
            }
        }

        System.out.println("Updated list: " + names);
    }
}
