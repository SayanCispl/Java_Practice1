package src.Array;

public class ArrayIn {

    static int getSecondLargeValue(int[] arr){
        int largest = -1, secondLargest = -1;
        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j < largest && j > secondLargest) {
                secondLargest = j;
            }
        }
        return secondLargest;
    }

    public static void main (String [] args){
        int[] array = {12, 35, 1, 10, 34, 1}; // 5-1 = 4
        System.out.println(getSecondLargeValue(array));
    }

}

/*
int arrayLenth = a.length ;
        int max = a[0];
        for (int num : a){
            if (num > max){
                max = num;
            }
        }
System.out.println(max);
*/
