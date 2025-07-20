package src.Multithreading;

public class TestThread1 {

    public static void main(String[] args){

        ThreadSynCounter counter = new ThreadSynCounter();
        ThreadSync t1 = new ThreadSync(counter);
        ThreadSync t2 = new ThreadSync(counter);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (Exception e){
          return ;
        }

        System.out.println(counter.getCount());
    }

}
