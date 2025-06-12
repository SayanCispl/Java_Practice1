package src.Polymorphism_Practice;

public class Polymorphism_1 {

    // In Method Overloading Section Class Are Not Same , Only The Method Name Was Same and Parameter Was Different
    public int method_1(int x, int y)
    {
        return (x + y);
    }
    // Overloaded sum().
    // This sum takes three int parameters
    public int method_1(int x, int y, int z)
    {
        return (x + y + z);
    }
    // Overloaded sum().
    // This sum takes two double parameters
    public double method_1(double x, double y)
    {
        return (x + y);
    }

    public static void main(String[] args)
    {
        Polymorphism_1 s = new Polymorphism_1();
        System.out.println(s.method_1(10, 20));
        System.out.println(s.method_1(10, 20, 30));
        System.out.println(s.method_1(10.5, 20.5));
    }
}
