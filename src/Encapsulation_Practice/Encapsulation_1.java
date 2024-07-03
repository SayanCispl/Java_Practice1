package src.Encapsulation_Practice;

public class Encapsulation_1 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting values through setter methods
        emp.setName("Sayan Koley");
        emp.setAge(28);

        // Getting values through getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
    }
}
