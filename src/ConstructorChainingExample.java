package src;

// Parent class
class Vehicle {
    Vehicle() {
        this("Petrol");
        System.out.println("Vehicle default constructor");
    }

    Vehicle(String fuelType) {
        System.out.println("Vehicle parameterized constructor: Fuel Type - " + fuelType);
    }
}

// Child class
class Car extends Vehicle {
    Car() {
        this(4);
        System.out.println("Car default constructor");
    }

    Car(int wheels) {
        super();  // Calls Vehicle's default constructor
        System.out.println("Car parameterized constructor: Wheels - " + wheels);
    }
}

// Main class to test
public class ConstructorChainingExample {
    public static void main(String[] args) {
        Car c = new Car();
    }
}

