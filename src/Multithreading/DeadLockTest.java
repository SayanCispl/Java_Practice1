package src.Multithreading;

public class DeadLockTest {

    public static void main(String[] args) {
        ResourceA a = new ResourceA();
        ResourceB b = new ResourceB();

        Thread t1 = new Thread(() -> a.methodA(b), "Thread-1");
        Thread t2 = new Thread(() -> b.methodB(a), "Thread-2");

        t1.start();
        t2.start();
    }

}

/*
==================================== Code Explanation ===================================
🏠 Real-life Analogy:

Imagine:

    A room = an object (ResourceA, ResourceB)

    A lock = the door is locked when someone enters

    Threads = people trying to enter rooms

If Thread-1 enters Room A and locks it, Thread-2 must wait outside if it also wants Room A.


You Have 2 Objects (Rooms):
==============================
ResourceA a = new ResourceA();
ResourceB b = new ResourceB();

You Have 2 Threads (People):
========================================
Thread-1 → wants to enter ResourceA → then ResourceB
Thread-2 → wants to enter ResourceB → then ResourceA
*/

class ResourceA {
    synchronized void methodA(ResourceB b) {
        System.out.println(Thread.currentThread().getName() + " inside methodA");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        b.last(); // Tries to access ResourceB
    }

    synchronized void last() {
        System.out.println("Inside ResourceA.last()");
    }
}

/*synchronized means:

    When Thread-1 runs a.methodA(b), it locks the object a (ResourceA)

    No other thread can enter any synchronized method of a now

    Then it tries to call b.last(), which is synchronized, so it wants to lock object b
*/

class ResourceB {
    synchronized void methodB(ResourceA a) {
        System.out.println(Thread.currentThread().getName() + " inside methodB");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        a.last(); // Tries to access ResourceA
    }

    synchronized void last() {
        System.out.println("Inside ResourceB.last()");
    }
}

/*
When Thread-2 runs b.methodB(a), it locks the object b

Then it tries to call a.last(), which wants to lock object a
*/

/*

🔥 Where the Deadlock Happens

Here is the exact problem:

    Thread-1 locks a (ResourceA), then tries to lock b (ResourceB) — but b is already locked by Thread-2.

    Thread-2 locks b (ResourceB), then tries to lock a (ResourceA) — but a is already locked by Thread-1.

Result: Both threads are waiting for each other to release the lock, but neither will. The program is stuck forever.
This is called a deadlock.

*/
