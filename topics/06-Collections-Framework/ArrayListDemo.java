import java.util.ArrayList; 

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        a.remove(1); 

        for (int i : a) {
            System.out.println(i);
        }
    }
}
