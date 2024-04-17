import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base string:");
        String baseString = scanner.nextLine();
        System.out.println("Enter the number of concatenations:");
        int numConcatenations = scanner.nextInt();

        // Using StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuilder.append(baseString);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long timeTakenStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

        System.out.println("Using StringBuilder...");
        System.out.println("Time taken: " + timeTakenStringBuilder + " milliseconds");
        System.out.println("Final string length: " + stringBuilder.length());

        // Using StringBuffer
        long startTimeStringBuffer = System.currentTimeMillis();
        System.out.println(startTimeStringBuffer);
        StringBuffer stringBuffer = new StringBuffer(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuffer.append(baseString);
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        System.out.println(endTimeStringBuffer);
        long timeTakenStringBuffer = endTimeStringBuffer - startTimeStringBuffer;

        System.out.println("Using StringBuffer...");
        System.out.println("Time taken: " + timeTakenStringBuffer + " milliseconds");
        System.out.println("Final string length: " + stringBuffer.length());

        // Comparison
        long difference = timeTakenStringBuffer - timeTakenStringBuilder;
        if (difference > 0) {
            System.out.println("Comparison: StringBuilder was faster than StringBuffer by " + difference + " milliseconds.");
        } else if (difference < 0) {
            System.out.println("Comparison: StringBuffer was faster than StringBuilder by " + (-difference) + " milliseconds.");
        } else {
            System.out.println("Comparison: Both StringBuilder and StringBuffer took the same amount of time.");
        }
    }
}
