import java.util.Scanner;

public class Array_2 {

        // main function
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            // declaring and initializing 2D array
            int arr[][] = new int[3][];
            int arr2D[][]  = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

            // printing 2D array
            for (int i = 0; i < 3; i++) {
                int j;
                for (j = 0; j < 3; j++)
                  //  System.out.print(arr[i][j] + " ");
                    arr[i][j] = sc.nextInt();

                System.out.println();
            }
        }
}
