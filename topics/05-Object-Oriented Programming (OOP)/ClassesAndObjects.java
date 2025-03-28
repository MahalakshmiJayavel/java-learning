public class ClassesAndObjects {
    // Instance variables (attributes of the object)
    int year = 2023; // Default manufacturing year
    String brand = "Tesla"; // Default car brand

    public static void main(String[] args) {
        // Creating an object of the class
        ClassesAndObjects obj = new ClassesAndObjects();

        // Accessing and printing the instance variables using the object
        System.out.println("Car Brand: " + obj.brand); 
        System.out.println("Manufacturing Year: " + obj.year); 
    }
}
