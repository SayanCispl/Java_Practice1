package src.Multithreading;

public class Multithread extends Thread{

    public  Multithread(String threadName){
        super(threadName);
    }
    @Override
    public void run(){
        System.out.println("Thread"+Thread.currentThread().getName()+" is running");
        for (int i=0; i<=20; i++){
            try {
                Thread.sleep(500);
                System.out.println("Thread"+Thread.currentThread().getName()+" is running & Priority"+Thread.currentThread().getPriority()+"- Count "+ i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main( String[] args) throws InterruptedException {
        /*Multithread t1 = new Multithread("Thread Name - Arka");
        t1.start();
        t1.join();*/
        // Check The Priority
        Multithread t2 = new Multithread("Low Priority");
        Multithread t3 = new Multithread("Mid Priority");
        Multithread t4 = new Multithread("High Priority");
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t3.start();
        t4.start();




    }
}
