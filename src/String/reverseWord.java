package src.String;

public class reverseWord {

        public static void main(String[] args) {
            String input = "Happy independence day";
            String[] words = input.split(" ");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                StringBuilder reversed = new StringBuilder(word);
                result.append(reversed.reverse()).append(" ");
            }
            System.out.println(result);
        }

}
