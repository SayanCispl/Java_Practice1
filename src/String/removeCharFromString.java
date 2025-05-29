package src.String;

import java.util.Arrays;

public class removeCharFromString {

    public static void main (String[] args){
        String inputData = "$45" ;
        String[] convertInput = inputData.split("");
        System.out.println(Arrays.toString(convertInput));
        StringBuilder final_Output = new StringBuilder();
        for (String output : convertInput){
            if (!output.equals("$")){
                final_Output.append(output);
            }
        }
        Integer finalCovertValue = Integer.parseInt(final_Output.toString());
        System.out.println(finalCovertValue.getClass());
    }

}




/*
*
*  Input Of The String - "$45"
*  Out Put Was - 45 and Change The Data Type To Integer
*
*/