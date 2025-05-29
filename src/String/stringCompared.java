package src.String;

import java.util.Arrays;

public class stringCompared {

    public static void main(String[] args) {

        String[] arr = {
                "Now", "is", "the", "time", "for", "all", "good", "men",
                "to", "come", "to", "the", "aid", "of", "their", "country"
        };

        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }

    }

    public void checkAsciiValue (String value_Check){

        int[] asciiValues = new int[value_Check.length()];
        for (int i = 0; i < value_Check.length(); i++) {
            asciiValues[i] = (int) value_Check.charAt(i);
        }
        System.out.println(Arrays.toString(asciiValues));
    }


}
