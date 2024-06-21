package src.Polymorphism_Practice;

public class Polymorphism_1 {
    public int Polymorphism_1(int x, int y)
    {
        return (x + y);
    }
    // Overloaded sum().
    // This sum takes three int parameters
    public int Polymorphism_1(int x, int y, int z)
    {
        return (x + y + z);
    }
    // Overloaded sum().
    // This sum takes two double parameters
    public double Polymorphism_1(double x, double y)
    {
        return (x + y);
    }
    public static void main(String args[])
    {
        Polymorphism_1 s = new Polymorphism_1();
        System.out.println(s.Polymorphism_1(10, 20));
        System.out.println(s.Polymorphism_1(10, 20, 30));
        System.out.println(s.Polymorphism_1(10.5, 20.5));
    }
}
