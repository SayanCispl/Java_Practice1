package src.String;


public class wordReverse {

    public static void main(String[] args){

        String original = "Happy Independence Day";
        StringBuilder result = new StringBuilder();
        StringBuilder reversedResult = new StringBuilder();
        char eachElement ;

        for (int i = 0 ; i < original.length(); i++){

            if (original.charAt(i) != ' '){
                eachElement = original.charAt(i);
                result.append(eachElement);
            }else {
                if (!result.isEmpty()){
                    reversedResult.append(result.reverse().append(" "));
                    result.setLength(0);
                }
            }

        }

        if (!result.isEmpty()){
            reversedResult.append(result.reverse().append(" "));
            result.setLength(0);
        }

        System.out.println(original);
        System.out.println(reversedResult);

    }

}

