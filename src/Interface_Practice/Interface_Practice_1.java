package src.Interface_Practice;
import java.io.*;
interface In1 {
    final int a = 100;
    // public and abstract
    void display();
}
// A class that implements the interface.

public class Interface_Practice_1 implements In1 {
    public void display()
    {
        System.out.println("Test");
    }
    public static void main(String[] args)
    {
        Interface_Practice_1 t = new Interface_Practice_1();
        t.display();
        System.out.println(t.a);
    }
}
