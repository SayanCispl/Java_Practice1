package src.Stream_Lamda;

import java.util.ArrayList;

public class StreamLearn {

    public static void main (String[] args){

        // lambda expression is An Anonymous Function ( No Name And No Return Type Nad No Access Modifier )
        Thread t1 = new Thread(() -> {
            System.out.println("Thread t1 Run = "+ Thread.currentThread());
        });
        t1.start();

        // Lambda expression with zero parameters *************************************
        ZeroParameter zeroParamLambda = ()
                -> System.out.println(
                "This is a zero-parameter lambda expression!");
        // Invoke the method
        zeroParamLambda.display();

        //  Lambda with a Single Parameter *****************************************
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        // Using lambda expression to print all elements of al
        System.out.println("Elements of the ArrayList: ");
        al.forEach(System.out::println);

        // Using lambda expression to print even elements of al
        System.out.println(
                "Even elements of the ArrayList: ");
        al.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });

        // Lambda Expression with Multiple Parameters *****************************************
        mathOperation add = (a , b) -> a+b;
        mathOperation sub = (a , b) -> a-b;
        mathOperation multi = (a , b) -> a*b;

        // Using the operations
        System.out.println(add.operation(6, 3));
        System.out.println(sub.operation(4, 5));
        System.out.println(multi.operation(4, 5));



    }

    @FunctionalInterface
    interface ZeroParameter {
        void display();
    }

    @FunctionalInterface
    interface mathOperation {
        int operation(int a, int b) ;
    }

}
