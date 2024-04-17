public class q2 {
    public static void main(String[] args) {
        // Demonstrating String immutability
        String str1 = "Hello";
        System.out.println("Original String: " + str1);

        // Concatenating a new string
        String str2 = str1.concat(" World");
        System.out.println("Modified String: " + str2);

        // Original string remains unchanged
        System.out.println("Original String after concatenation: " + str1);
        
        // Demonstrating usage as CharSequence
        CharSequence charSeq = "Java is awesome";

       
        System.out.println(charSeq);

       
    }
}
