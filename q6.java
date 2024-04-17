import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user to input two strings
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();
        
        // Converting both strings to lowercase and uppercase
        String firstLower = firstString.toLowerCase();
        String secondLower = secondString.toLowerCase();
        String firstUpper = firstString.toUpperCase();
        String secondUpper = secondString.toUpperCase();
        
        // Comparing the converted strings for case-insensitive equality
        boolean isEqualIgnoreCase = firstLower.equals(secondLower);
        
        // Displaying the converted strings and the result of the comparison
        System.out.println("First String (Lowercase): " + firstLower);
        System.out.println("Second String (Lowercase): " + secondLower);
        System.out.println("First String (Uppercase): " + firstUpper);
        System.out.println("Second String (Uppercase): " + secondUpper);
        System.out.println("Are the strings equal (case-insensitive)? " + isEqualIgnoreCase);
    }
}
