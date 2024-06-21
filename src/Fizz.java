import java.util.Scanner;
public class Fizz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter the start and end of the range
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        // Loop through each number in the range
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // If the number is a multiple of both 3 and 5, print "fizzbuzz"
                System.out.println("fizzbuzz");
                System.out.println("fizz");
            } else if (i % 3 == 0) {
                // If the number is a multiple of 3, print "fizz"
            } else if (i % 5 == 0) {
                // If the number is a multiple of 5, print "buzz"
                System.out.println("buzz");
            } else {
                // Otherwise, print the number itself
                System.out.println(i);
            }
        }
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
