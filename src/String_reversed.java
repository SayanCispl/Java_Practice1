public class String_reversed {
    public static void main(String[] args) {
        String Original = "Test";
        String Reversed = "";
        for (int i =Original.length()-1; i>= 0; i--){
            char currentChar = Original.charAt(i);
            // Convert the character to a String object
            //using the "Character.toString" method.
            String charAsString = Character.toString(currentChar);

            // Concatenate the converted character String
            //to the end of the "reversed" string.
            Reversed = Reversed.concat(charAsString);
        }
        System.out.println("Original String: " + Original);
        System.out.println("Reversed String: " + Reversed);

    }
}
