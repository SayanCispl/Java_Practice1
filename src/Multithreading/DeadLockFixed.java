package src.Multithreading;

public class DeadLockFixed {

    public static void main(String[] args) {
        Resource res1 = new Resource();
        Resource res2 = new Resource();

        Thread t1 = new Thread(() -> {
            new Resource().method(res1, res2); // Always acquire lock in order: res1 → res2
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            new Resource().method(res1, res2); // Same lock order: res1 → res2
        }, "Thread-2");

        t1.start();
        t2.start();
    }

}

class Resource {
    // A single method to lock resources in order
    public void method(Resource a, Resource b) {
        synchronized (a) {
            System.out.println(Thread.currentThread().getName() + " locked Resource A");
            try { Thread.sleep(100); } catch (InterruptedException _) {}

            synchronized (b) {
                System.out.println(Thread.currentThread().getName() + " locked Resource B");
                System.out.println(Thread.currentThread().getName() + " is performing task");
            }
        }
    }
}
