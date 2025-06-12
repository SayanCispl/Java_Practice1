package src.Multithreading;

public class world implements Runnable{

    @Override
    public void run() {
        for(;;){
            System.out.println("World");
        }
    }
}
