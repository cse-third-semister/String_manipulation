import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to input a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Converting the string to a character array
        char[] charArray = inputString.toCharArray();

        // Prompting the user to enter a character to search
        System.out.println("Enter a character to search:");
        char searchChar = scanner.nextLine().charAt(0);

        System.out.println("First index is "+ inputString.indexOf(searchChar));
        System.out.println("First index is "+ inputString.lastIndexOf(searchChar));

        

        // Displaying the character array and the positions found (if any)
        System.out.println("Character Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
       
    }
}
