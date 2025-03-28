class Car {
    String model;
    String colour;

   
    Car(String model, String colour) {
        this.model = model;
        this.colour = colour;
    }

    
    void showModel() {
        System.out.println("Car model: " + model + ", Colour: " + colour);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("Honda", "Red"),
            new Car("Toyota", "Blue"),
            new Car("Ford", "Black")
        };

        
        for (Car car : cars) {
            car.showModel();
        }
    }
}
