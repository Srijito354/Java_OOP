import java.io.*;

// Creating a simple class.
class Car {
    // Attributes (variables)
    String color;
    int year;

    // Constructor (special method to create objects)
    Car(String c, int y){
        color = c;
        year = y;
    }

    void displayInfo() {
        System.out.println("Car color: " + color + ", Year: " + year);
    }
}

public class Basic_class_object_demo {
    public static void main(String[] args) {

        // Creating objects (instances of Car)
        Car car1 = new Car("Red", 2020);
        Car car2 = new Car("Blue", 2022);

        // Call methods
        car1.displayInfo();
        car2.displayInfo();
    }
}