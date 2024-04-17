import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two strings from the user
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Concatenating the strings using the concat() method and the + operator
        String concatUsingMethod = firstString.concat(secondString);
        String concatUsingOperator = firstString + secondString;

        // Displaying both results
        System.out.println("Concatenation using the concat() method: " + concatUsingMethod);
        System.out.println("Concatenation using the + operator: " + concatUsingOperator);

        // Asking the user for an index number
        System.out.println("Enter an index number to retrieve a character:");
        int index = scanner.nextInt();

        // Displaying the character at the specified index
        if (index >= 0 && index < concatUsingMethod.length()) {
            char characterAtIndex = concatUsingMethod.charAt(index);
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        } else {
            System.out.println("Invalid index number. Please enter a valid index within the string length.");
        }
    }
}
