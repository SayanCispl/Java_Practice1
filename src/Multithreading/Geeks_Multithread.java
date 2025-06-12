package src.Multithreading;

public class Geeks_Multithread
{
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Multithread object = new Multithread("Thread Name - Arka");
            object.start();
        }
    }
}
