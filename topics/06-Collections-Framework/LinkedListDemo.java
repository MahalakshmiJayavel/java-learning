import java.util.LinkedList; 

public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<String> name = new LinkedList<>();

        name.add("squid");
        name.add("tom");
        name.add("brady");
        name.add("snoopy");
        name.add("yor");
        System.out.println("List of Names: " + name);
    }
}
