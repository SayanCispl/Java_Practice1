package src.Multithreading;

import org.w3c.dom.css.Counter;

public class ThreadSync extends Thread {

    private ThreadSynCounter counter;

    public ThreadSync(ThreadSynCounter counter){
        this.counter = counter ;
    }

    @Override
    public void run() {
        for (int i=0; i<1000 ; i++){
            counter.increment();
        }
    }
}
