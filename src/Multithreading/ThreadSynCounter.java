package src.Multithreading;

public class ThreadSynCounter {

    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
