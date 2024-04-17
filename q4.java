import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(inputString);

        while (true) {
            System.out.println("Current String: " + stringBuilder);
            System.out.println("Choose operation:");
            System.out.println("1. Add a substring at a specified position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter substring to add:");
                    String substringToAdd = scanner.nextLine();
                    System.out.println("Enter position to add at:");
                    int positionToAdd = scanner.nextInt();
                    stringBuilder.insert(positionToAdd, substringToAdd);
                    System.out.println(stringBuilder);
                    break;
                case 2:
                    System.out.println("Enter start index to remove:");
                    int startIndexToRemove = scanner.nextInt();
                    System.out.println("Enter end index to remove:");
                    int endIndexToRemove = scanner.nextInt();
                    stringBuilder.delete(startIndexToRemove, endIndexToRemove);
                    System.out.println(stringBuilder);
                    break;
                case 3:
                    System.out.println("Enter index to modify:");
                    int indexToModify = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.println("Enter character to replace with:");
                    char charToReplace = scanner.nextLine().charAt(0);
                    stringBuilder.setCharAt(indexToModify, charToReplace);
                    System.out.println(stringBuilder);
                    break;
                case 4:
                    System.out.println("Enter string to concatenate:");
                    String stringToConcatenate = scanner.nextLine();
                    stringBuilder.append(stringToConcatenate);
                    System.out.println(stringBuilder);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
