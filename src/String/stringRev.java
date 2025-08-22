package src.String;

public class stringRev {

    public static void main(String[] args){
        String Original = "Sayan";
        String Reversed ="";
        for(int i = Original.length()-1; i >=0; i--){
            Reversed = Reversed + Original.charAt(i);

            // Reversed.append(Original.charAt(i));
        }
        System.out.println("Original String: " + Original);
        System.out.println("Reversed String: " + Reversed);
    }

}
