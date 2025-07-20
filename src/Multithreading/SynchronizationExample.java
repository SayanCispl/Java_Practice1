package src.Multithreading;

public class SynchronizationExample {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(() -> {
            printer.printDocument("Document1", 3);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            printer.printDocument("Document2", 3);
        }, "Thread-2");

        t1.start();
        t2.start();
    }

}

class Printer {
    public synchronized void printDocument(String doc, int copies) {
        for (int i = 1; i <= copies; i++) {
            System.out.println(Thread.currentThread().getName() + " printing " + doc + " copy " + i);
        }
    }
}