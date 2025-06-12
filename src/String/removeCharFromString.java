package src.String;
public class removeCharFromString {

    public static void main (String[] args){
        String inputData = "$45" ;

        String Output = inputData.replace("$", "");
        int finalCovertValue = Integer.parseInt(Output);
        System.out.println(Output);
    }

}


/*
*
*  Input Of The String - "$45"
*  Out Put Was - 45 and Change The Data Type To Integer
*
*   Lendthey Approach
*   String[] convertInput = inputData.split("");
        System.out.println(Arrays.toString(convertInput));
        StringBuilder final_Output = new StringBuilder();
        for (String output : convertInput){
            if (!output.equals("$")){
                final_Output.append(output);
            }
        }
*
*
*/