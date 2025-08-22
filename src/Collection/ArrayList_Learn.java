package src.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Learn {

    public static void main (String[] args){

        List<Object> newList = new ArrayList<>();
        newList.add("Arka");
        newList.add(1);
        newList.add(1.0);
        newList.add(0, "Hello");

        System.out.println(newList);
        System.out.println(newList.size());
        System.out.println(newList.getClass().getName());

        Integer[] array = {1,2,3,4,5};
        List<Integer> newArrylist =Arrays.asList(array);
        System.out.println(newArrylist.reversed());

        String[] arr = {"Hello", "World"};
        List<String> newStringArrylist = new ArrayList<>();

        for (String str : arr){
            StringBuilder strNew = new StringBuilder(str);
            newStringArrylist.add(strNew.reverse().toString());
        }

        System.out.println(newStringArrylist);




    }

}
