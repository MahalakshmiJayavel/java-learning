class Animal {
    String name = "Kitty"; 
    int age = 2; 
}


class Cat extends Animal {  
}


public class InheritanceDemo {
    public static void main(String[] args) {
        Cat a = new Cat(); // 
        System.out.println(a.name); 
        System.out.println(a.age);
    }
}







