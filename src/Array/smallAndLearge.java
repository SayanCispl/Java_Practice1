package src.Array;

public class smallAndLearge {

        public static void main(String[] args) {
            int[] arr = {10, 5, 20, 8, 15};

            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;

            // Pass 1: Find smallest and largest
            for (int num : arr) {
                if (num < smallest) {
                    smallest = num;
                }
                if (num > largest) {
                    largest = num;
                }
            }

            int secondSmallest = Integer.MAX_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            // Pass 2: Find second smallest and second largest
            for (int num : arr) {
                if (num > smallest && num < secondSmallest) {
                    secondSmallest = num;
                }
                if (num < largest && num > secondLargest) {
                    secondLargest = num;
                }
            }

            System.out.println("Smallest: " + smallest);
            System.out.println("2nd Smallest: " + secondSmallest);
            System.out.println("Largest: " + largest);
            System.out.println("2nd Largest: " + secondLargest);
        }
    }



