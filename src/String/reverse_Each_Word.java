package src.String;

public class reverse_Each_Word {

    public static void main(String[] args) {
        String input = "Hello World Java Programming";
        System.out.println("Original String: " + input);
        System.out.println("Reverse Result: " + reverseEachWordSimple(input));
    }

    private static String reverseEachWordSimple(String str) {
        // In This line Remove The Space
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            result.append(sb.reverse());

            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

}
