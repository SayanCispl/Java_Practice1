package src.Inheritance_Practice;
// Superclass (parent class)
class Animal {
    // Superclass attribute
    protected String sound;

    // Superclass constructor
    public Animal(String sound) {
        this.sound = sound;
    }

    // Superclass method
    public void makeSound() {
        System.out.println("This animal makes a " + sound + " sound.");
    }
}

// Subclass (child class)
class Dog extends Animal {
    // Subclass attribute
    private String breed;

    // Subclass constructor
    public Dog(String sound, String breed) {
        super(sound); // Call the superclass constructor
        this.breed = breed;
    }

    // Subclass method
    public void displayBreed() {
        System.out.println("This dog is a " + breed + ".");
    }
}
public class Inheritance_1 {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("bark", "Labrador");

        // Call superclass method
        myDog.makeSound();

        // Call subclass method
        myDog.displayBreed();
    }
}
