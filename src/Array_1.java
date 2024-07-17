package src;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        arr[0]= 22;
        arr[1] = 100;
        arr[2] = 111;
        arr[3] = 9;
        System.out.println(arr[3]);

        for(int i=0; i<arr.length; i++)
        {
            arr[i]= sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
       // Modify
        arr[2]= 1000;
        System.out.println(Arrays.toString(arr));
      //  for(int i=0; i<arr.length; i++)
        //{
          //  System.out.print(arr[i] + " ");

       // }


    }
}
