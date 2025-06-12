package src.Multithreading;

public class TestThread {

    public static void main(String [] args){
        world t = new world();
        Thread t1 = new Thread(t);
        t1.start();

        for (;;){
            System.out.println("Hello");
        }

    }

}
