class Animal {
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}


public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a = new Lion(); 
        a.sound(); 
    }
}

