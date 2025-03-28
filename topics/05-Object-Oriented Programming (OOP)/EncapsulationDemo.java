// Encapsulated User class
class User {
    private String name;
    private String membership;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for membership
    public void setMembership(String membership) {
        this.membership = membership;
    }

    // Getter for membership
    public String getMembership() {
        return membership;
    }
}

// Main class
public class EncapsulationDemo {
    public static void main(String[] args) {
        User u = new User(); 
        u.setName("Mahaks");
        u.setMembership("premium");

        System.out.println(u.getName());      
        System.out.println(u.getMembership()); 
    }
}
