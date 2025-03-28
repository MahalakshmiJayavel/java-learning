import java.util.LinkedList; 

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> name = new LinkedList<>();

        // Adding elements (names) to the LinkedList
        name.add("squid");
        name.add("tom");
        name.add("brady");
        name.add("snoopy");
        name.add("yor");

        // Printing the LinkedList
        System.out.println("List of Names: " + name);
    }
}
