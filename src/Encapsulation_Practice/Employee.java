package src.Encapsulation_Practice;

public class Employee {
    // Private variables, these cannot be accessed directly from outside the class
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String newName) {
        name = newName;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int newAge) {
        age = newAge;
    }
}
