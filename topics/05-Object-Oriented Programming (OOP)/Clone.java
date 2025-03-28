class Person implements Cloneable {
    String name;

    Person(String name) {
        this.name = name;
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    void show() {
        System.out.println(name);
    }
}

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Maha");
        Person p2 = p1.clone();  // Clone p1 into p2

        p1.show();
        p2.show();
    }
}
