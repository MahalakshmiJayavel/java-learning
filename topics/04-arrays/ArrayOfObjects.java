class Car {
    String model;
    String colour;

    // Constructor
    Car(String model, String colour) {
        this.model = model;
        this.colour = colour;
    }

    // Method
    void showModel() {
        System.out.println("Car model: " + model + ", Colour: " + colour);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // Create array of Car objects with model and colour
        Car[] cars = {
            new Car("Honda", "Red"),
            new Car("Toyota", "Blue"),
            new Car("Ford", "Black")
        };

        // Loop through the array and display each car model
        for (Car car : cars) {
            car.showModel();
        }
    }
}
